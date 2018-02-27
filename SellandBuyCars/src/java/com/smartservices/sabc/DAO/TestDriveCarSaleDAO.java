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
    int deleteTestDriveCarSale(int tdcsaId);
    List<Testdrivecarsale> getAllTestDriveCarSale();
    Testdrivecarsale getTestDriveCarSaleByID(int tdcsaId);
    int updateTestdrivecarsale(int tdcsaId,Testdrivecarsale Testdrivecarsale);
    
    
}
