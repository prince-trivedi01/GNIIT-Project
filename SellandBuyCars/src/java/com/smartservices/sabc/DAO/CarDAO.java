/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAO;

import com.smartservices.sabc.entities.Carinfo;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface CarDAO {
    
    int addCar(Carinfo Carinfo);
    int deleteCar(int carId);
    List<Carinfo> getAllCar();
   Carinfo getCarByID(int carId);
    int updateCar(int carId,Carinfo Carinfo);
  
    
}
