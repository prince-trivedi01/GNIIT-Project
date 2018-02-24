/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAO;

import com.smartservices.sabc.entities.Showroomman;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface ShowroomManDAO {
     
    
    int addShowroomman(Showroomman Showroomman);
    int deleteShowroomman(int srmid);
    List<Showroomman> getAllShowroomman();
    Showroomman getShowroommanByID(int srmid);
    int updateShowroomman(int srmid,Showroomman Showroomman);
  
    
}
