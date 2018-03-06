/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.OrderCarSaleDAO;
import com.smartservices.sabc.entities.Ordercaronsale;
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
public class OrderCarSaleDAOImpl implements OrderCarSaleDAO{

    @Override
    public int addOrderCarSale(Ordercaronsale Ordercaronsale) {
       int count=0;
        try {
            
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into Ordercaronsale (date,amount,quantity,status) values (?,?,?,?)");
            //ps.setString(1, (Date) Ordercaronsale.getDate());
            ps.setInt(2,Ordercaronsale.getAmount());
            ps.setInt(3,Ordercaronsale.getQuantity());
            ps.setString(4,Ordercaronsale.getStatus());
            
            
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;            
    
    }

    @Override
    public int deleteOrderCarSale(int ocsaId) {
       int count=0;
            
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from Ordercaronsale where ocsa_Id=?");
            ps.setInt(1,ocsaId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
       return count;
    }
    

    @Override
    public List<Ordercaronsale> getAllOrderCarSale() {
       
      List<Ordercaronsale> OrdercaronsaleList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Ordercaronsale");
            ResultSet resultSet = ps.executeQuery();
           OrdercaronsaleList = new ArrayList<>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int ocsaId=resultSet.getInt(1);
                    int amount = resultSet.getInt(2);
                   
                    int quantity = resultSet.getInt(4);
                     Date date = resultSet.getDate(5);
                   
                    String status= resultSet.getString(7);
                   
                    Ordercaronsale Ordercaronsale = new Ordercaronsale(ocsaId,date,amount,quantity,status);
                   OrdercaronsaleList.add(Ordercaronsale);
            
                }
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return OrdercaronsaleList;
    
    }

    @Override
    public Ordercaronsale getOrderCarSaleByID(int ocsaId) {
        List<Ordercaronsale> OrderCarSaleList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Ordercaronsale where ocsa_Id=?");
            ps.setInt(1, ocsaId);
            ResultSet resultSet = ps.executeQuery();
            OrderCarSaleList = new ArrayList<Ordercaronsale>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    //int cosaId = resultSet.getInt(1);
                    Date date  = resultSet.getDate(1);
                    int amount  = resultSet.getInt(2);
                    int quantity = resultSet.getInt(3);
                    String status = resultSet.getString(4);
                    Ordercaronsale Ordercaronsale = new Ordercaronsale(date,amount,quantity,status);
                    OrderCarSaleList.add(Ordercaronsale);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(OrderCarSaleList.size()>0) return OrderCarSaleList.get(0);
     else return null;
    }
    
    

    @Override
    public int updateOrderCarSale(int ocsaId, Ordercaronsale Ordercaronsale) {
        int count=0;
    
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps =con.prepareStatement("Update Ordercaronsale set date=?,amount=?,quantity=?,status=? where ocsa_Id=?");
            ps.setDate(1, (java.sql.Date) Ordercaronsale.getDate());
            ps.setInt(2,Ordercaronsale.getAmount());
            ps.setInt(3, Ordercaronsale.getQuantity());
            ps.setString(4,Ordercaronsale.getStatus());
            ps.setInt(5,ocsaId);
            count=ps.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return count;
    }
    
}
