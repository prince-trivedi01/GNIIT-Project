/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.CarOnShowroomDAO;
import com.smartservices.sabc.entities.Caronshowroom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prince
 */
public class CarOnShowroomDAOImpl implements CarOnShowroomDAO{

    @Override
    public int addCarOnShowroom(Caronshowroom Caronshowroom) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into Caronshowroom (model,name,type,amount,color) values (?,?,?,?,?)");
            ps.setString(1,Caronshowroom.getModel());
            ps.setString(2,Caronshowroom.getName());
            ps.setString(3,Caronshowroom.getType());
            ps.setInt(4,Caronshowroom.getAmount());
            ps.setString(5,Caronshowroom.getColor());
            
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarOnShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteCarOnShowroom(int cosrId) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from Caronshowroom where cosr_Id=?");
            ps.setInt(1,cosrId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarOnShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Caronshowroom> getAllCarOnShowroom() {
        List<Caronshowroom> CaronshowroomList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Caronshowroom");
            ResultSet resultSet = ps.executeQuery();
            CaronshowroomList = new ArrayList<Caronshowroom>();
            if(resultSet!=null){
                while(resultSet.next()){
                    int cosrId = resultSet.getInt(1);
                    String model = resultSet.getString(2);
                    String name = resultSet.getString(3);
                    String type = resultSet.getString(4);
                    String color=resultSet.getString(5);
                    int amount = resultSet.getInt(6);
                    Caronshowroom cosr = new Caronshowroom(cosrId,model,name,type,color,amount);
                    CaronshowroomList.add(cosr);
            
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarOnShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CaronshowroomList;
    }

    @Override
    public Caronshowroom getCarOnShowroomByID(int cosrId) {
         List<Caronshowroom> CaronshowroomList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Caronshowroom where cosr_Id=?");
            ps.setInt(1, cosrId);
            ResultSet resultSet = ps.executeQuery();
            CaronshowroomList = new ArrayList<Caronshowroom>();
            if(resultSet!=null){
                while(resultSet.next()){
                 //   int cosrId = resultSet.getInt(1);
                    String model = resultSet.getString(2);
                    String name = resultSet.getString(3);
                    String type = resultSet.getString(4);
                    String color=resultSet.getString(5);
                    int amount = resultSet.getInt(6);
                    Caronshowroom cosr = new Caronshowroom(cosrId,model,name,type,color,amount);
                    CaronshowroomList.add(cosr);
            
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarOnShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         if(CaronshowroomList.size()>0) return CaronshowroomList.get(0);
     else return null;
    }

    @Override
    public int updateCarOnShowroom(int cosrId, Caronshowroom Caronsshowroom) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Update Caronshowroom set model=?,name=?,type=?,color=?,amount=? where cosr_Id=?");
           
            ps.setInt(1,cosrId);
            ps.setString(2,Caronsshowroom.getModel());
            ps.setString(3,Caronsshowroom.getName());
            ps.setString(4,Caronsshowroom.getType());
            ps.setString(5,Caronsshowroom.getColor());
            count = ps.executeUpdate();  
        } catch (SQLException ex) {
            Logger.getLogger(CarOnShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
}
