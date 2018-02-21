/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservice.sabc.DAO;

import com.smartservices.sabc.entities.Carinfo;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface CarDAO {
    
     List<Carinfo> findAll();
    List<Carinfo> findById(int carid);
    List<Carinfo> findByModel(Carinfo model);
    boolean insertCarinfo(Carinfo Carinfo);
    boolean updateCarinfo(Carinfo Carinfo);
    boolean deleteCarinfo(Carinfo Carinfo);

}
