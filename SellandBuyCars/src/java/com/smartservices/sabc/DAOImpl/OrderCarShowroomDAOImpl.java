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
import java.sql.SQLException;
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
            PreparedStatement ps = con.prepareStatement("Insert into Ordercaronshowroom (amount,date,quantity,status) values (?,?,?,?)");
            ps.setInt(1,Ordercaronshowroom.getAmount());
            ps.setDate(2, (Date) Ordercaronshowroom.getDate());
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
            PreparedStatement ps = con.prepareStatement("delete from Ordercaronshowroom where ocsrId=?");
            ps.setInt(1,ocsrId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderCarShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Ordercaronshowroom> getAllOrderCarShowroom() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public Ordercaronshowroom getOrderCarShowroomByID(int ocsrId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateOrderCarShowroom(int ocsrId, Ordercaronshowroom Ordercaronshowroom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
