/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.TestDriveCarSaleDAO;
import com.smartservices.sabc.entities.Testdrivecarsale;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prince
 */
public class TestDriveCarSaleDAOImpl implements TestDriveCarSaleDAO{

    @Override
    public int addTestDriveCarSale(Testdrivecarsale Testdrivecarsale) {
       
         int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into Testdrivecarsale (date,jobprofile,status) values (?,?,?)");
           
            ps.setDate(1, (java.sql.Date) (Date) Testdrivecarsale.getDate());
            ps.setString(2,Testdrivecarsale.getJobprofile());
            ps.setString(4,Testdrivecarsale.getStatus());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TestDriveCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    
    
    }

    @Override
    public int deleteTestDriveCarSale(int tdcsaId) {
       
         int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from Testdrivecarsale where tdcsa_Id=?");
            ps.setInt(1,tdcsaId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TestDriveCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    
    
    
    }

    @Override
    public List<Testdrivecarsale> getAllTestDriveCarSale() {
       
       List<Testdrivecarsale> TestdrivecarsaleList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Testdrivecarsale");
            ResultSet resultSet = ps.executeQuery();
           TestdrivecarsaleList = new ArrayList<>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int tdcsaId=resultSet.getInt(1);
                   
                   
                    String jobprofile = resultSet.getString(2);
                     java.sql.Date date = resultSet.getDate(5);
                   
                    String status= resultSet.getString(7);
                   
                    Testdrivecarsale Testdrivecarsale = new Testdrivecarsale(tdcsaId,date,jobprofile,status);
                   TestdrivecarsaleList.add(Testdrivecarsale);
            
                }
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(TestDriveCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return TestdrivecarsaleList;
    
    
    
    }

    @Override
    public Testdrivecarsale getTestDriveCarSaleByID(int tdcsaId) {
      
          List<Testdrivecarsale> TestdrivecarsaleList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Testdrivecarsale where tdcsa_Id=?");
            ps.setInt(1, tdcsaId);
            ResultSet resultSet = ps.executeQuery();
           TestdrivecarsaleList = new ArrayList<>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                  //  int tdcsaId=resultSet.getInt(1);
                   
                   
                    String jobprofile = resultSet.getString(2);
                     java.sql.Date date = resultSet.getDate(5);
                   
                    String status= resultSet.getString(7);
                   
                    Testdrivecarsale Testdrivecarsale = new Testdrivecarsale(tdcsaId,date,jobprofile,status);
                   TestdrivecarsaleList.add(Testdrivecarsale);
            
                }
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(TestDriveCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(TestdrivecarsaleList.size()>0) return TestdrivecarsaleList.get(0);
     else return null;
    
    
    
    }

    @Override
    public int updateTestdrivecarsale(int tdcsaId, Testdrivecarsale Testdrivecarsale) {
       
             int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Update Testdrivecarsale set date=?,jobprofile=?,status=? where tdcsa_Id=?");
          
            ps.setDate(1, (java.sql.Date) Testdrivecarsale.getDate());
           
           
            ps.setString(2,Testdrivecarsale.getJobprofile());
            ps.setString(4,Testdrivecarsale.getStatus());
            ps.setInt(5, tdcsaId);
            
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TestDriveCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return count;
    
    
    
    
    }
    
}
