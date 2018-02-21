/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservice.sabc.DAO;

import com.smartservices.sabc.entities.Showroomman;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface ShowroomManDAO {
    
     List<Showroomman> findAll();
    List<Showroomman> findById(int srmid);
    List<Showroomman> findByName(Showroomman srmfname);
    boolean insertShowrooman(Showroomman Showroomman);
    boolean updateShowroomman(Showroomman Showroomman);
    boolean deleteShowroomman(Showroomman Showroomman);

    
}
