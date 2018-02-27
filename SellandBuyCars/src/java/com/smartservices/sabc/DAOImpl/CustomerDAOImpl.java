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
import java.sql.SQLException;
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
            PreparedStatement ps = con.prepareStatement("delete from Custinfo where custId=?");
            ps.setInt(1,custId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Custinfo> getAllCustinfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Custinfo getCustomerByID(int custId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateCustomer(int custId, Custinfo Custinfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
