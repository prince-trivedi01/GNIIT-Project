/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAO;

import com.smartservices.sabc.entities.Caronshowroom;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface CarOnShowroomDAO {
    
    int addCarOnShowroom(Caronshowroom Caronshowroom);
    int deleteCarOnShowroom(int cosrId);
    List<Caronshowroom> getAllCarOnShowroom();
    Caronshowroom getCarOnShowroomByID(int cosrId);
    int updateCarOnShowroom(int cosrId,Caronshowroom Caronsshowroom);
    
    
}
