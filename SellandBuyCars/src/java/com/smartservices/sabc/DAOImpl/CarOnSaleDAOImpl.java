/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.CarOnSaleDAO;
import com.smartservices.sabc.entities.Caronsale;
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
public class CarOnSaleDAOImpl implements CarOnSaleDAO{

    @Override
    public int addCarOnSale(Caronsale Caronsale) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into Caronsale (model,name,regno,milage,condition,status,amount) values (?,?,?,?,?,?,?)");
            ps.setString(1,Caronsale.getModel());
            ps.setString(2,Caronsale.getName());
            ps.setString(3,Caronsale.getRegno());
            ps.setString(4,Caronsale.getMilage());
            ps.setString(5,Caronsale.getCondition());
            ps.setString(6,Caronsale.getStatus());
            ps.setInt(7,Caronsale.getAmount());
            
            count = ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CarOnSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return count;
    }

    @Override
    public int deleteCarOnSale(int cosaId) {
         int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from Caronsale where cosa_Id=?");
            ps.setInt(1,cosaId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarOnSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Caronsale> getAllCarOnSale() {
        List<Caronsale> CaronsaleList=null;
        try { 
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Caronsale");
            ResultSet resultSet = ps.executeQuery();
            CaronsaleList = new ArrayList<Caronsale>();
            if(resultSet!=null){
                while(resultSet.next()){
                    int cosaId = resultSet.getInt(1);
                    String model = resultSet.getString(2);
                    String name = resultSet.getString(3);
                    String regno = resultSet.getString(4);
                    String milage=resultSet.getString(5);
                    String condition=resultSet.getString(6);
                    String status=resultSet.getString(7);
                    int amount = resultSet.getInt(8);
                    Caronsale cosa = new Caronsale(cosaId,model,name,regno,milage,condition,status,amount);
                    CaronsaleList.add(cosa);
            
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarOnSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            return CaronsaleList; 
    }

    @Override
    public Caronsale getCarOnSaleByID(int cosaId) {
        
        
        List<Caronsale> CaronsaleList=null;
        try { 
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Caronsale where cosa_Id=?");
            ps.setInt(1, cosaId);
            ResultSet resultSet = ps.executeQuery();
            CaronsaleList = new ArrayList<Caronsale>();
            if(resultSet!=null){
                while(resultSet.next()){
                //    int cosaId = resultSet.getInt(1);
                    String model = resultSet.getString(2);
                    String name = resultSet.getString(3);
                    String regno = resultSet.getString(4);
                    String milage=resultSet.getString(5);
                    String condition=resultSet.getString(6);
                    String status=resultSet.getString(7);
                    int amount = resultSet.getInt(8);
                    Caronsale cosa = new Caronsale(cosaId,model,name,regno,milage,condition,status,amount);
                    CaronsaleList.add(cosa);
            
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarOnSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
           if(CaronsaleList.size()>0) return CaronsaleList.get(0);
     else return null;
    }

    @Override
    public int updateCarOnSale(int cosaId, Caronsale Caronsale) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Update Caronsale set model=?,name=?,regno=?,milage=?,condition=?,status=?,amount=? where cosa_Id=?");
            ps.setString(1,Caronsale.getModel());
            ps.setString(2,Caronsale.getName());
            ps.setString(3,Caronsale.getRegno());
            ps.setString(4,Caronsale.getMilage());
            ps.setString(5,Caronsale.getCondition());
            ps.setString(6,Caronsale.getStatus());
            ps.setInt(7,Caronsale.getAmount());
            ps.setInt(8,cosaId);
            count = ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CarOnSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
    }
