/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementcell;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lap
 */
public class myConnection {
    
    Connection db;
    public myConnection() 
{
   
    try
    {
        db=DriverManager.getConnection("jdbc:mysql://localhost/dbplacement","root","root");
    
    }
    
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
}   
}
