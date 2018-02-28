/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAOImpl;

import com.smartservices.sabc.DAO.CarOnSaleDAO;
import com.smartservices.sabc.entities.Caronsale;
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
public class CarOnSaleDAOImpl implements CarOnSaleDAO{

    @Override
    public int addCarOnSale(Caronsale Caronsale) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("Insert into Caronsale (model,name,regno,milage,condition,status,amount) values (?,?,?,?,?,?,?)");
            ps.setString(1,Caronsale.getModel());
            ps.setString(2,Caronsale.getName());
            ps.setString(3,Caronsale.getRegno());
            ps.setString(4,Caronsale.getMilage());
            ps.setString(5,Caronsale.getCondition());
            ps.setString(6,Caronsale.getStatus());
            ps.setInt(7,Caronsale.getAmount());
            
            count = ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CarOnSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return count;
    }

    @Override
    public int deleteCarOnSale(int cosaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Caronsale> getAllCarOnSale() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Caronsale getCarOnSaleByID(int cosaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateCarOnSale(int cosaId, Caronsale Caronsale) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
