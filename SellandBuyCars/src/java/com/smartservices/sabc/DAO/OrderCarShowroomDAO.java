/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAO;

import com.smartservices.sabc.entities.Ordercaronshowroom;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface OrderCarShowroomDAO {
    
    
    int addOrderCarShowroom(Ordercaronshowroom Ordercaronshowroom);
    int deleteOrderCarShowroom(int ocsrId);
    List<Ordercaronshowroom> getAllOrderCarShowroom();
    Ordercaronshowroom getOrderCarShowroomByID(int ocsrId);
    int updateOrderCarShowroom(int ocsrId,Ordercaronshowroom Ordercaronshowroom);
    
    
}
