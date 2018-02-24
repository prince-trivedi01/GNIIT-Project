/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAO;

import com.smartservices.sabc.entities.Ordercaronsale;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface OrderCarSaleDAO {
    
   
   
    
    int addOrderCarSale(Ordercaronsale Ordercaronsale);
    int deleteOrderCarSale(int ocsaid);
    List<Ordercaronsale> getAllOrderCarSale();
    Ordercaronsale getOrderCarSaleByID(int ocsaid);
    int updateOrderCarSale(int ocsaid,Ordercaronsale Ordercaronsale);
    
    
    
}
