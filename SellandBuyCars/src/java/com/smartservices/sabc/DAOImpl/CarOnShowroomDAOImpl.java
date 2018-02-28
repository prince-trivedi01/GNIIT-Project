/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.CarOnShowroomDAO;
import com.smartservices.sabc.entities.Caronshowroom;
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
public class CarOnShowroomDAOImpl implements CarOnShowroomDAO{

    @Override
    public int addCarOnShowroom(Caronshowroom Caronshowroom) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into Caronshowroom (model,name,type,amount,color) values (?,?,?,?,?)");
            ps.setString(1,Caronshowroom.getModel());
            ps.setString(2,Caronshowroom.getName());
            ps.setString(3,Caronshowroom.getType());
            ps.setInt(4,Caronshowroom.getAmount());
            ps.setString(5,Caronshowroom.getColor());
            
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarOnShowroomDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteCarOnShowroom(int cosrId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Caronshowroom> getAllCarOnShowroom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Caronshowroom getCarOnShowroomByID(int cosrId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateCarOnShowroom(int cosrId, Caronshowroom Caronsshowroom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
