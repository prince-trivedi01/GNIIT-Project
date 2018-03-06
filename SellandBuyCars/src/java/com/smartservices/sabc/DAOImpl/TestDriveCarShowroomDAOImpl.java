/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.TestDriveCarShowroomDAO;
import com.smartservices.sabc.entities.Testdrivecarshowroom;
import com.smartservices.sabc.entities.Testdrivecarshowroom;
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
public class TestDriveCarShowroomDAOImpl implements TestDriveCarShowroomDAO{

    @Override
    public int addTestDriveCarShowroom(Testdrivecarshowroom Testdrivecarshowroom) {
       
         int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into Testdrivecarshowroom (date,jobprofile,status) values (?,?,?)");
           
            ps.setDate(1, (java.sql.Date) (Date) Testdrivecarshowroom.getDate());
             
            ps.setString(4,Testdrivecarshowroom.getStatus());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TestDriveCarShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    
    }

    @Override
    public int deleteTestDriveCarShowroom(int tdcsrId) {
       
          int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from Testdrivecarshowroom where tdcsr_Id=?");
            ps.setInt(1,tdcsrId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TestDriveCarShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    
    
    }

    @Override
    public List<Testdrivecarshowroom> getAllTestDriveCarShowroom() {
     
         
     
         List<Testdrivecarshowroom> TestdrivecarshowroomList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Testdrivecarshowroom");
            ResultSet resultSet = ps.executeQuery();
           TestdrivecarshowroomList = new ArrayList<>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int tdcsrId=resultSet.getInt(1);
                   
                   
                    String jobprofile = resultSet.getString(2);
                     java.sql.Date date = resultSet.getDate(5);
                   
                    String status= resultSet.getString(7);
                   
                    Testdrivecarshowroom Testdrivecarshowroom = new Testdrivecarshowroom(tdcsrId,date,jobprofile,status);
                   TestdrivecarshowroomList.add(Testdrivecarshowroom);
            
                }
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(TestDriveCarShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return TestdrivecarshowroomList;
        
    
    
    
    }

    @Override
    public Testdrivecarshowroom getTestDriveCarShowroomByID(int tdcsrId) {
      
         List<Testdrivecarshowroom> TestdrivecarshowroomList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Testdrivecarshowroom where tdcsr_Id=?");
            ps.setInt(1, tdcsrId);
            ResultSet resultSet = ps.executeQuery();
           TestdrivecarshowroomList = new ArrayList<>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                   // int tdcsrId=resultSet.getInt(1);
                   
                   
                    String jobprofile = resultSet.getString(2);
                     java.sql.Date date = resultSet.getDate(5);
                   
                    String status= resultSet.getString(7);
                   
                    Testdrivecarshowroom Testdrivecarshowroom = new Testdrivecarshowroom(tdcsrId,date,jobprofile,status);
                   TestdrivecarshowroomList.add(Testdrivecarshowroom);
            
                }
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(TestDriveCarShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     if(TestdrivecarshowroomList.size()>0) return TestdrivecarshowroomList.get(0);
     else return null;
    
    
    
    }

    @Override
    public int updateTestDriveCarShowroom(int tdcsrId, Testdrivecarshowroom Testdrivecarshowroom) {
       
         int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Update Testdrivecarshowroom set date=?,jobprofile=?,status=? where tdcsr_Id=?");
          
            ps.setDate(1, (java.sql.Date) Testdrivecarshowroom.getDate());
           
           
            ps.setString(2,Testdrivecarshowroom.getJobprofile());
            ps.setString(4,Testdrivecarshowroom.getStatus());
            ps.setInt(5, tdcsrId);
            
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TestDriveCarShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return count;
    
    
    
    
    }
    
}
