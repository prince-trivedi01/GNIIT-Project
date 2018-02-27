/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAO;

import com.smartservices.sabc.entities.Testdrivecarshowroom;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface TestDriveCarShowroomDAO {
    
    int addTestDriveCarShowroom(Testdrivecarshowroom Testdrivecarshowroom);
    int deleteTestDriveCarShowroom(int tdcsrId);
    List<Testdrivecarshowroom> getAllTestDriveCarShowroom();
    Testdrivecarshowroom getTestDriveCarShowroomByID(int tdcsrId);
    int updateTestDriveCarShowroom(int tdcsrId,Testdrivecarshowroom Testdrivecarshowroom);
    
    
}
