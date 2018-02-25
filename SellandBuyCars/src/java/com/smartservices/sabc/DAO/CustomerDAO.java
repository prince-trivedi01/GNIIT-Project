/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.DAO;

import com.smartservices.sabc.entities.Custinfo;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface CustomerDAO {
    
    int addCustomer(Custinfo Custinfo);
    int deleteCustomer(int custId);
    List<Custinfo> getAllCustinfo();
    Custinfo getCustomerByID(int custId);
    int updateCustomer(int custId,Custinfo Custinfo);
  
    

}
    
