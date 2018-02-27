/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAO;

import com.smartservices.sabc.entities.Caronsale;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface CarOnSaleDAO {
    
    int addCarOnSale(Caronsale Caronsale);
    int deleteCarOnSale(int cosaId);
    List<Caronsale> getAllCarOnSale();
    Caronsale getCarOnSaleByID(int cosaId);
    int updateCarOnSale(int cosaId,Caronsale Caronsale);
    
    
}
