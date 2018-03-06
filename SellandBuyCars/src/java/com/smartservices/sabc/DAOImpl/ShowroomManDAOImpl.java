/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.ShowroomManDAO;
import com.smartservices.sabc.entities.Showroomman;
import java.sql.Connection;
import java.sql.Date;
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
public class ShowroomManDAOImpl implements ShowroomManDAO{

    @Override
    public int addShowroomman(Showroomman Showroomman) {
      int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into Showroomman (fname,lname,mob,email,dateofbirth,username,password) values (?,?,?,?,?,?,?)");
            ps.setString(1,Showroomman.getFname());
            ps.setString(2,Showroomman.getLname());
            ps.setInt(3,Showroomman.getMob());
            ps.setString(4,Showroomman.getEmail());
            ps.setDate(5, (Date) Showroomman.getDateofbirth());
            ps.setString(6,Showroomman.getUsername());
            ps.setString(7,Showroomman.getPassword());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ShowroomManDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteShowroomman(int srmId) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from Showroomman where srm_Id=?");
            ps.setInt(1,srmId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ShowroomManDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Showroomman> getAllShowroomman() {
        List<Showroomman> ShowManList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Showroomman");
            ResultSet resultSet = ps.executeQuery();
            ShowManList = new ArrayList<>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int srmId = resultSet.getInt(1);
                    String fname = resultSet.getString(2);
                    String lname = resultSet.getString(3);
                    int mob = resultSet.getInt(4);
                     Date dateofbirth = resultSet.getDate(5);
                    String email = resultSet.getString(6);
                    String username = resultSet.getString(7);
                    String password = resultSet.getString(8);
                    Showroomman Customer = new Showroomman(srmId,fname,lname,mob,dateofbirth,email,username,password);
                    ShowManList.add(Customer);
            
                }
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(ShowroomManDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return ShowManList;
    
    }

    @Override
    public Showroomman getShowroommanByID(int srmId) {
        
    List<Showroomman> ShowManList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Showroomman where srm_Id=?");
            ps.setInt(1, srmId);
            ResultSet resultSet = ps.executeQuery();
            ShowManList = new ArrayList<Showroomman>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    //int srmId = resultSet.getInt(1);
                    String fname = resultSet.getString(2);
                    String lname = resultSet.getString(3);
                    int mob = resultSet.getInt(4);
                    Date dateofbirth = resultSet.getDate(5);
                    String email = resultSet.getString(6);
                    String username = resultSet.getString(7);
                    String password = resultSet.getString(8);
                    Showroomman Showroomman = new Showroomman(srmId,fname,lname,mob,dateofbirth,email,username,password);
                    ShowManList.add(Showroomman);
            
                }
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ShowroomManDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    if(ShowManList.size()>0) return ShowManList.get(0);
     else return null;
    
    
    }

    @Override
    public int updateShowroomman(int srmId, Showroomman Showroomman) {
        int count=0;
    
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Update Showroomman set fname=?,lname=?,mob=?,dateofbirth=?,email=?,username=?,password=? where srm_Id=?");
            ps.setString(1,Showroomman.getFname());
            ps.setString(2,Showroomman.getLname());
            ps.setInt(3,Showroomman.getMob());
            ps.setDate(4, (Date) Showroomman.getDateofbirth());
            ps.setString(5,Showroomman.getEmail());
            ps.setString(6,Showroomman.getUsername());
            ps.setString(7,Showroomman.getPassword());
            ps.setInt(8, srmId);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ShowroomManDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return count;
    
    }
    
}
