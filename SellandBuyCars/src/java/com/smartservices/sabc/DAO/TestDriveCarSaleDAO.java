/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAO;

import com.smartservices.sabc.entities.Testdrivecarsale;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface TestDriveCarSaleDAO {
    
    int addTestDriveCarSale(Testdrivecarsale Testdrivecarsale);
    int deleteTestDriveCarSale(int tdcsaid);
    List<Testdrivecarsale> getAllTestDriveCarSale();
    Testdrivecarsale getTestDriveCarSaleByID(int tdcsaid);
    int updateTestdrivecarsale(int tdcsaid,Testdrivecarsale Testdrivecarsale);
    
    
}
