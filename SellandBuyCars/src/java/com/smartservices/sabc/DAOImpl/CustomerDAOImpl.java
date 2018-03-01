/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.CustomerDAO;
import com.smartservices.sabc.entities.Custinfo;
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
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public int addCustomer(Custinfo Custinfo) {
       int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into Custinfo (fname,lname,addr,mob,email,username,password) values (?,?,?,?,?,?,?)");
            ps.setString(1,Custinfo.getFname());
            ps.setString(2,Custinfo.getLname());
            ps.setString(3,Custinfo.getAddr());
            ps.setInt(4,Custinfo.getMob());
            ps.setString(5,Custinfo.getEmail());
            ps.setString(6,Custinfo.getUsername());
            ps.setString(7,Custinfo.getPassword());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteCustomer(int custId) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from Custinfo where cust_Id=?");
            ps.setInt(1,custId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Custinfo> getAllCustinfo() {
        List<Custinfo> CustList=null;
    
        try { 
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Custinfo");
            ResultSet resultSet = ps.executeQuery();
            CustList = new ArrayList<>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int custId = resultSet.getInt(1);
                    String fname = resultSet.getString(2);
                    String lname = resultSet.getString(3);
                    String addr = resultSet.getString(4);
                    int mob = resultSet.getInt(5);
                    String email = resultSet.getString(6);
                    String username = resultSet.getString(7);
                    String password = resultSet.getString(8);
                    Custinfo Customer = new Custinfo(custId,fname,lname,addr,mob,email,username,password);
                    CustList.add(Customer);
            
                }
            }
            
            
                        
            
             } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CustList;
         
    }

    @Override
    public Custinfo getCustomerByID(int custId) {
       
         List<Custinfo> CustList=null;
    
        try { 
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Custinfo where cust_Id=?");
            ps.setInt(1, custId);
            ResultSet resultSet = ps.executeQuery();
            CustList = new ArrayList<>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                   // int custId = resultSet.getInt(1);
                    String fname = resultSet.getString(2);
                    String lname = resultSet.getString(3);
                    String addr = resultSet.getString(4);
                    int mob = resultSet.getInt(5);
                    String email = resultSet.getString(6);
                    String username = resultSet.getString(7);
                    String password = resultSet.getString(8);
                    Custinfo Customer = new Custinfo(custId,fname,lname,addr,mob,email,username,password);
                    CustList.add(Customer);
            
                }
            }
            
            
                        
            
             } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     if(CustList.size()>0) return CustList.get(0);
     else return null;  
    
       }

    @Override
    public int updateCustomer(int custId, Custinfo Custinfo) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Update Custinfo set fname=?,lname=?,addr=?,mob=?,email=?,username=?,password=? where cust_Id=?");
            ps.setString(1,Custinfo.getFname());
            ps.setString(2,Custinfo.getLname());
            ps.setString(3,Custinfo.getAddr());
            ps.setInt(4,Custinfo.getMob());
            ps.setString(5,Custinfo.getEmail());
            ps.setString(6,Custinfo.getUsername());
            ps.setString(7,Custinfo.getPassword());
            ps.setInt(8, custId);
            count = ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return count;
    
     }
    
}
