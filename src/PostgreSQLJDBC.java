package project;


import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class PostgreSQLJDBC {
	
   public static void main( String args[] ){

       MainScreen ms = new MainScreen();
       //insert into table:
       userAccounts myUser = new userAccounts();
      // myUser.createTable();
       //MainScreen screen = new MainScreen();
       InventoryMan newInv = new InventoryMan();
       //newInv.uploadNewItem();
       newInv.searchItem();
       //calling a function from UserAccounts.java
//       myUser.loginCheck();
//       System.out.println(myUser.toString());
//       myUser.deleteUser();
     }
} 