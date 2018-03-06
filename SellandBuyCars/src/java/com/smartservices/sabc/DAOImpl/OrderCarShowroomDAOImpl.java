/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.OrderCarShowroomDAO;
import com.smartservices.sabc.entities.Ordercaronshowroom;
import static com.smartservices.sabc.entities.Ordercaronshowroom_.ocsrId;
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
public class OrderCarShowroomDAOImpl implements OrderCarShowroomDAO{

    @Override
    public int addOrderCarShowroom(Ordercaronshowroom Ordercaronshowroom) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into Ordercaronshowroom (date,amount,quantity,status) values (?,?,?,?)");
           
            ps.setDate(1, (Date) Ordercaronshowroom.getDate());
             ps.setInt(2,Ordercaronshowroom.getAmount());
            ps.setInt(3,Ordercaronshowroom.getQuantity());
            ps.setString(4,Ordercaronshowroom.getStatus());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteOrderCarShowroom(int ocsrId) {
       int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from Ordercaronshowroom where ocsr_Id=?");
            ps.setInt(1,ocsrId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Ordercaronshowroom> getAllOrderCarShowroom() {
     
         List<Ordercaronshowroom> OrdercaronshowroomList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Ordercaronshowroom");
            ResultSet resultSet = ps.executeQuery();
           OrdercaronshowroomList = new ArrayList<>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int ocsrId=resultSet.getInt(1);
                    int amount = resultSet.getInt(2);
                   
                    int quantity = resultSet.getInt(4);
                     Date date = resultSet.getDate(5);
                   
                    String status= resultSet.getString(7);
                   
                    Ordercaronshowroom Ordercaronshowroom = new Ordercaronshowroom(ocsrId,date,amount,quantity,status);
                   OrdercaronshowroomList.add(Ordercaronshowroom);
            
                }
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return OrdercaronshowroomList;
        
        
        
        
    }

    @Override
    public Ordercaronshowroom getOrderCarShowroomByID(int ocsrId) {
       
         List<Ordercaronshowroom> OrdercaronshowroomList=null;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from Ordercaronshowroom where ocsr_Id=?");
            ps.setInt(1, ocsrId);
            ResultSet resultSet = ps.executeQuery();
            
           OrdercaronshowroomList = new ArrayList<>();
             if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                   // int ocsrId=resultSet.getInt(1);
                    int amount = resultSet.getInt(2);
                   
                    int quantity = resultSet.getInt(4);
                     Date date = resultSet.getDate(5);
                   
                    String status= resultSet.getString(7);
                    
                    Ordercaronshowroom Ordercaronshowroom = new Ordercaronshowroom(date,amount,quantity,status);
                   OrdercaronshowroomList.add(Ordercaronshowroom);
            
                }
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
          if(OrdercaronshowroomList.size()>0) return OrdercaronshowroomList.get(0);
     else return null;
    
    
    }

    @Override
    public int updateOrderCarShowroom(int ocsrId, Ordercaronshowroom Ordercaronshowroom) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Update Ordercaronshowroom set date=?,amount=?,quantity=?,status=? where ocsr_Id=?");
          
            ps.setDate(1, (Date) Ordercaronshowroom.getDate());
           
            ps.setInt(2, Ordercaronshowroom.getAmount());
            ps.setInt(3, Ordercaronshowroom.getQuantity());
            ps.setString(4,Ordercaronshowroom.getStatus());
            ps.setInt(5, ocsrId);
            
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return count;
    }
    
}
