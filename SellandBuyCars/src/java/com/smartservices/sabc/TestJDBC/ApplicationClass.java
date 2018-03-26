/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartservices.sabc.TestJDBC;

import com.smartservices.sabc.DAO.CarDAO;
import com.smartservices.sabc.DAO.CarOnSaleDAO;
import com.smartservices.sabc.DAO.CarOnShowroomDAO;
import com.smartservices.sabc.DAO.CustomerDAO;
import com.smartservices.sabc.DAOImpl.CarDAOImpl;
import com.smartservices.sabc.DAOImpl.CarOnSaleDAOImpl;
import com.smartservices.sabc.DAOImpl.CarOnShowroomDAOImpl;
import com.smartservices.sabc.DAOImpl.CustomerDAOImpl;
import com.smartservices.sabc.entities.Carinfo;
import com.smartservices.sabc.entities.Caronsale;
import com.smartservices.sabc.entities.Caronshowroom;
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
//       Custinfo ci = new Custinfo("John","Joshi","21B Malad Mumbai",89755462,"johnjoshi@gmail.com","C1006","C1006");
//       int count = CustDAO.addCustomer(ci);
//       if(count>0)System.out.println("Record Added Successfully");
//        else System.out.println("Record Failed to get added");                    
//                             
     //   int count=CustDAO.deleteCustomer(1006);
       //if(count>0)System.out.println("Record Deleted Successfully");
      // else System.out.println("Record Failed to get deleted");                     
          
      // List<Custinfo> CustomerList = CustDAO.getAllCustinfo();
        //CustomerList.forEach((cust) -> {
          //   System.out.println(cust.getCustId()+"|"+cust.getFname()+"|"+cust.getLname()+"|"+cust.getAddr()+"|"+cust.getMob()+"|"+cust.getEmail()+"|"+cust.getUsername());
           //});
        
        
       //  Custinfo cust=CustDAO.getCustomerByID(1002);
       //  System.out.println( cust.getFname() + "|" + cust.getLname() +"|"+ cust.getAddr() +"|"+ cust.getEmail() +"|"+ cust.getMob() +"|"+ cust.getUsername() +"|"+cust.getPassword());
        
        // Custinfo cust = new Custinfo(   );
        //int count=CustomerDAO.updateCust(  );
        //if(count>0)System.out.println("Record Updated Successfully");
        //  else System.out.println("Record Failed to get updated");
      
       
        
                   
                    
                     // Caronsale CRUD Operations.   
    CarOnSaleDAO CaronsaleDAO = new CarOnSaleDAOImpl();
       Caronsale cosa = new Caronsale("Ritz","Maruti","R10258963","65000","One year","Accepted",380000);
      int count = CaronsaleDAO.addCarOnSale(cosa);
       if(count>0)System.out.println("Record Added Successfully");
       else System.out.println("Record Failed to get added");
//      
//      int  count=CarOnSaleDAO.deleteCarOnSale(4007);
//       if(count>0)System.out.println("Record Deleted Successfully");
//      else System.out.println("Record Failed to get deleted");
//              
//        List<Caronsale> CaronsaleList = CaronsaleDAO.getAllCarOnSale();
//       for(Caronsale Caronsale : CaronsaleList){
//        System.out.println(Caronsale.getCarOnSaleById()+ "|" + Caronsale.getModel() + "|" + Caronsale.getName() +"|"+ Caronsale.getCondition() +"|"+ Caronsale.getAmount()+"|"+Caronsale.getMilage);
//        }
//    
//         Caronsale Caronsale=CaronsaleDAO.getCarOnSaleByID(3002);
//         System.out.println( Caronsale.getModel() + "|" + Caronsale.getName() +"|"+ Caronsale.getCondition() +"|"+ Caronsale.getAmount()+"|"+Caronsale.getMilage);
//        
//        Caronsale Caronsale = new Caronsale(         );
//        int count=CaronsaleDAO.updateCaronsale(3002,Caronsale);
//        if(count>0)System.out.println("Record Updated Successfully");
//          else System.out.println("Record Failed to get updated");           
//        
        
//                 // Caronshowroom CRUD Operations.   
//     CarOnShowroomDAO CarOnShowroomDAO = new CarOnShowroomDAOImpl();
//       Caronshowroom cosr = new Caronshowroom(                                );
//      int count = CarOnShowroomDAO.addCarOnShowroom(cosr);
//       if(count>0)System.out.println("Record Added Successfully");
//       else System.out.println("Record Failed to get added");
//      
//      int  count=CarOnShowroomDAO.deleteCarOnShowroom(3007);
//       if(count>0)System.out.println("Record Deleted Successfully");
//      else System.out.println("Record Failed to get deleted");
//              
//        List<CarOnShowroom> CarOnShowroomList = CarOnShowroomDAO.getAllCarOnShowroom();
//       for(CarOnShowroom CarOnShowroom : CarOnShowroomList){
//        System.out.println(CarOnShowroom.getCarOnShowroomById()+ "|" + CarOnShowroom.getModel() + "|" + CarOnShowroom.getName() +"|"+ CarOnShowroom.getColor() +"|"+ CarOnShowroom.getAmount()+"|"+CarOnShowroom.getType);
//        }
//    
//         CarOnShowroom CarOnShowroom=CarOnShowroomDAO.getCarOnShowroomByID(3002);
//         System.out.println(CarOnShowroom.getCarOnShowroomById()+ "|" + CarOnShowroom.getModel() + "|" + CarOnShowroom.getName() +"|"+ CarOnShowroom.getColor() +"|"+ CarOnShowroom.getAmount()+"|"+CarOnShowroom.getType);
//        
//        CarOnShowroom CarOnShowroom = new CarOnShowroom(         );
//        int count=CarOnShowroomDAO.updateCarOnShowroom(3002,CarOnShowroom);
//        if(count>0)System.out.println("Record Updated Successfully");
//          else System.out.println("Record Failed to get updated");


               // OrderCaronsale CRUD Operations.   
 //   OrderCarSaleDAO OrderCarSaleDAO = new OrderCarSaleDAOImpl();
   //    Ordercaronsale ocsa = new Ordercaronsale();
     // int count = OrderCarSaleDAO.addOrderCarSale(ocsa);
    //   if(count>0)System.out.println("Record Added Successfully");
    //   else System.out.println("Record Failed to get added");
//      
//      int  count= OrderCarSaleDAO.deleteOrderCarSale(4007);
//       if(count>0)System.out.println("Record Deleted Successfully");
//      else System.out.println("Record Failed to get deleted");
//              
//        List<Ordercaronsale> OrdercaronsaleList = OrderCarSaleDAO.getAllOrderCarSale();
//       for(Ordercaronsale Ordercaronsale : OrdercaronsaleList){
//        System.out.println();
//        }
//    
//         Ordercaronsale Ordercaronsale=OrderCarSaleDAO.getOrderCarSaleByID(3002);
//         System.out.println();
//        
//        Ordercaronsale Ordercaronsale = new Ordercaronsale(         );
//        int count=OrderCarSaleDAO.updateOrderCarSale(3002,Caronsale);
//        if(count>0)System.out.println("Record Updated Successfully");
//          else System.out.println("Record Failed to get updated");           
//        





              // OrderCaronshowroom CRUD Operations.   
 //   OrderCarShowroomDAO OrderCarShowroomDAO = new OrderCarShowroomDAOImpl();
   //    Ordercaronshowroom ocsa = new Ordercaronshowroom();
     // int count = OrderCarShowroomDAO.addOrderCarShowroom(ocsr);
    //   if(count>0)System.out.println("Record Added Successfully");
    //   else System.out.println("Record Failed to get added");
//      
//      int  count= OrderCarShowroomDAO.deleteOrderCarShowroom(4007);
//       if(count>0)System.out.println("Record Deleted Successfully");
//      else System.out.println("Record Failed to get deleted");
//              
//        List<Ordercaronshowroom> OrdercaronhowroomList = OrderCarShowroomDAO.getAllOrderCarShowroom();
//       for(Ordercaronshowroom Ordercaronshowroom : OrdercaronshowroomList){
//        System.out.println();
//        }
//    
//         Ordercaronshowroom Ordercaronshowroom=OrderCarShowroomDAO.getOrderCarShowroomByID(3002);
//         System.out.println();
//        
//        Ordercaronshowroom Ordercaronshowroom = new Ordercaronshowroom(         );
//        int count=OrderCarShowroomDAO.updateOrderCarShowroom();
//        if(count>0)System.out.println("Record Updated Successfully");
//          else System.out.println("Record Failed to get updated");           
//        



         // TestDriveCarsale CRUD Operations.   
 //  TestDriveCarSaleDAO TestDriveCarSaleDAO = new TestDriveCarSaleDAOImpl();
   //    TestDrivecarsale tdcsa = new TestDrivecarsale();
     // int count = TestDriveCarSaleDAO.addTestDriveCarSale(tdcsa);
    //   if(count>0)System.out.println("Record Added Successfully");
    //   else System.out.println("Record Failed to get added");
//      
//      int  count= TestDriveCarSaleDAO.deleteTestDriveCarSale(4007);
//       if(count>0)System.out.println("Record Deleted Successfully");
//      else System.out.println("Record Failed to get deleted");
//              
//        List<Testdrivecarsale> TestDrivecarsaleList = TestDriveCarSaleDAO.getAllTestDriveCarSale();
//       for(Testdrivecarsale Testdrivecarsale : TestDrivecarsaleList){
//        System.out.println();
//        }
//    
//         Testdrivecarsale Testdrivecarsale=TestDriveCarSaleDAO.getTestDriveCarSaleByID(3002);
//         System.out.println();
//        
//        Testdrivecarsale Testdrivecarsale = new Testdrivecarsale(         );
//        int count=TestDriveCarSaleDAO.updateTestDriveCarSale(3002,Caronsale);
//        if(count>0)System.out.println("Record Updated Successfully");
//          else System.out.println("Record Failed to get updated"); 


            
         // TestDriveCarshowroom CRUD Operations.   
 //  TestDriveCarShowroomDAO TestDriveCarShowroomDAO = new TestDriveCarShowroomDAOImpl();
   //    TestDrivecarshowroom tdcsr = new TestDrivecarshowroom();
     // int count = TestDriveCarShowroomDAO.addTestDriveCarShowroom(tdcsr);
    //   if(count>0)System.out.println("Record Added Successfully");
    //   else System.out.println("Record Failed to get added");
//      
//      int  count= TestDriveCarShowroomDAO.deleteTestDriveCarShowroom(4007);
//       if(count>0)System.out.println("Record Deleted Successfully");
//      else System.out.println("Record Failed to get deleted");
//              
//        List<Testdrivecarshowroom> TestDrivecarshowroomList = TestDriveCarShowroomDAO.getAllTestDriveCarShowroom();
//       for(Testdrivecarshowroom Testdrivecarshowroom : TestDrivecarshowroomList){
//        System.out.println();
//        }
//    
//         Testdrivecarshowroom Testdrivecarshowroom=TestDriveCarShowroomDAO.getTestDriveCarShowroomByID(3002);
//         System.out.println();
//        
//        Testdrivecarshowroom Testdrivecarshowroom = new Testdrivecarshowroom(         );
//        int count=TestDriveCarShowroomDAO.updateTestDriveCarShowroom(3002,Caronsale);
//        if(count>0)System.out.println("Record Updated Successfully");
//          else System.out.println("Record Failed to get updated"); 






        }
    
}
