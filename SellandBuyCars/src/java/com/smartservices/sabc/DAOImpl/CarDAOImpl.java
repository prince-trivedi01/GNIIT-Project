/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.CarDAO;
import com.smartservices.sabc.entities.Carinfo;
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
public class CarDAOImpl implements CarDAO {

    @Override
    public int addCar(Carinfo Carinfo) {
        int count=0;
        try {
            
            Connection con = DBConnection.getConnection();
            
            PreparedStatement ps = con.prepareStatement("Insert into Carinfo (model,name,type,amount) values (?,?,?,?)");
                    ps.setString(1,Carinfo.getModel());
                    
                    ps.setString(2,Carinfo.getName());
                    ps.setString(3,Carinfo.getType());
                    ps.setInt(4,Carinfo.getAmount());
                    count = ps.executeUpdate();
                    
                    
                    
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            ///System.out.println(ex.getMessage());
        }
        return count;
    }

    @Override
    public int deleteCar(int carId) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from Carinfo where car_Id=?");
            ps.setInt(1,carId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Carinfo> getAllCar() { 
        List<Carinfo> CarList = null;
    
        try {
            
            Connection con = DBConnection.getConnection(); 
            PreparedStatement ps = con.prepareStatement("select * from Carinfo");
            ResultSet resultSet = ps.executeQuery();
             CarList = new ArrayList<>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int carId = resultSet.getInt(1);
                    String model = resultSet.getString(2);
                    String name = resultSet.getString(3);
                    String type = resultSet.getString(4);
                    int amount = resultSet.getInt(5);
                    Carinfo Car = new Carinfo(carId,model,name,type,amount);
                    CarList.add(Car);
            
                }
            }
        
                          
        } 
                catch (SQLException ex) {
            Logger.getLogger(CarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return CarList; 
    }

    @Override
    public Carinfo getCarByID(int carId) {
       List<Carinfo> CarList = null;
    
        try {
            
            Connection con = DBConnection.getConnection(); 
            PreparedStatement ps = con.prepareStatement("select * from Carinfo where car_Id=?");
            ps.setInt(1, carId);
            ResultSet resultSet = ps.executeQuery();
             CarList = new ArrayList<>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                   // int carId = resultSet.getInt(1);
                    String model = resultSet.getString(2);
                    String name = resultSet.getString(3);
                    String type = resultSet.getString(4);
                    int amount = resultSet.getInt(5);
                    Carinfo Car = new Carinfo(carId,model,name,type,amount);
                    CarList.add(Car);
            
                }
            }
        
                          
        } 
                catch (SQLException ex) {
            Logger.getLogger(CarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        if(CarList.size()>0) return CarList.get(0);
     else return null;
    
    }

    @Override
    public int updateCar(int carId, Carinfo Carinfo) {
       int count=0;
       
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Update Carinfo set model=?,name=?,type=?,amount=? where car_Id=?");
            ps.setString(1,Carinfo.getModel());
            ps.setString(2,Carinfo.getName());
            ps.setString(3,Carinfo.getType());
            ps.setInt(4,Carinfo.getAmount());
            ps.setInt(5, carId);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return count;
    }
 }    
    
    

