/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.TestJDBC;

import com.smartservices.sabc.DAO.CarDAO;
import com.smartservices.sabc.DAO.CustomerDAO;
import com.smartservices.sabc.DAOImpl.CarDAOImpl;
import com.smartservices.sabc.DAOImpl.CustomerDAOImpl;
import com.smartservices.sabc.entities.Carinfo;
import com.smartservices.sabc.entities.Custinfo;
import java.util.List;

/**
 *
 * @author Prince
 */
public class ApplicationClass {
    
        public static void main(String[] args){
       
                     // Cars CRUD Operations.   
    // CarDAO CarDAO = new CarDAOImpl();
//       Carinfo cd = new Carinfo("Accord","Honda","Luxrious",23000000);
//       int count = CarDAO.addCar(cd);
//       if(count>0)System.out.println("Record Added Successfully");
//       else System.out.println("Record Failed to get added");
      
      // int  count=CarDAO.deleteCar(3007);
       //if(count>0)System.out.println("Record Deleted Successfully");
       //else System.out.println("Record Failed to get deleted");
              
       // List<Carinfo> CarList = CarDAO.getAllCar();
       //for(Carinfo car : CarList){
         //System.out.println(car.getCarId()+ "|" + car.getModel() + "|" + car.getName() +"|"+ car.getType() +"|"+ car.getAmount());
        //}
    
        // Carinfo car=CarDAO.getCarByID(3002);
        // System.out.println(car.getCarId()+ "|" + car.getModel() + "|" + car.getName() +"|"+ car.getType() +"|"+ car.getAmount());
        
        // Carinfo car = new Carinfo(3002,"City","Honda","Sedan",9500000);
        //int count=CarDAO.updateCar(3002,car);
        //if(count>0)System.out.println("Record Updated Successfully");
        //  else System.out.println("Record Failed to get updated");
       
       
                      // Customer's CRUD Operations. 
                             
       CustomerDAO CustDAO = new CustomerDAOImpl();
       Custinfo ci = new Custinfo("John","Joshi","21B Malad Mumbai",89755462,"johnjoshi@gmail.com","C1006","C1006");
       int count = CustDAO.addCustomer(ci);
       if(count>0)System.out.println("Record Added Successfully");
        else System.out.println("Record Failed to get added");                    
                             
       // int  count=CustDAO.deleteCustomer(1003);
      // if(count>0)System.out.println("Record Deleted Successfully");
      // else System.out.println("Record Failed to get deleted");                     
          
       //  List<Custinfo> CustomerList = CustDAO.getAllCustinfo();
         //CustomerList.forEach((cust) -> {
           //  System.out.println(cust.getCustId()+"|"+cust.getFname()+"|"+cust.getLname()+"|"+cust.getAddr()+"|"+cust.getMob()+"|"+cust.getEmail()+"|"+cust.getUsername());
            //});
       // Custinfo cust=CustomerDAO.getCustomerByID(3002);
        // System.out.println(cust.getCustomerId()+ "|" + cust.getFname() + "|" + cust.getLname() +"|"+ cust.getAddress() +"|"+ cust.getEmail() +"|"+ cust.getMob +"|"+cust.getUssername +"|"+cust.getPassword);
        
        // Custinfo cust = new Custinfo(   );
        //int count=CustomerDAO.updateCust(  );
        //if(count>0)System.out.println("Record Updated Successfully");
        //  else System.out.println("Record Failed to get updated");
      
       
        }
    
}
