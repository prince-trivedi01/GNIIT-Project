/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservice.sabc.DAO;

import com.smartservices.sabc.entities.Custinfo;
import java.util.List;

/**
 *
 * @author Prince
 */
public interface CustomerDAO {
    
    

    List<Custinfo> findAll();
    List<Custinfo> findById(int custid);
    List<Custinfo> findByName(Custinfo custfname);
    boolean insertCustinfo(Custinfo custinfo);
    boolean updateCustinfo(Custinfo custinfo);
    boolean deleteCustinfo(Custinfo custinfo);

}
    
