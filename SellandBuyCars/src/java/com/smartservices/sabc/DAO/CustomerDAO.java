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
    int deleteCustomer(int Cust_id);
    List<Custinfo> getAllCustinfo();
    Custinfo getCustomerByID(int cust_id);
    int updateCustomer(int cust_id,Custinfo Custinfo);
  
    

}
    
