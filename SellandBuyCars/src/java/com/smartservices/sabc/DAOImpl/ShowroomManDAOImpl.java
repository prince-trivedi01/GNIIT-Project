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
import java.sql.SQLException;
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
            PreparedStatement ps = con.prepareStatement("delete from Showroomman where srmId=?");
            ps.setInt(1,srmId);
            count=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ShowroomManDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Showroomman> getAllShowroomman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Showroomman getShowroommanByID(int srmId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateShowroomman(int srmId, Showroomman Showroomman) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
