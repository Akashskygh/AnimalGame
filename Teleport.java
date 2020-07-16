//----------------------------------------------------------------
// Teleport.java - INTERFACE
// Auhthors: James Nguyen & Kelsee Carmichael. 
// Last updated by: null. 
//----------------------------------------------------------------
import java.awt.Point; 
public interface Teleport
{    
     //-------------------------------------------------------------------------
     //method getPosition() - get character and return its position as a String
     //-------------------------------------------------------------------------
     public String getPosition(); 
     //------------------------------------------------------------------------------------
     //method teleport() - get position from user and teleport character to given position
     //------------------------------------------------------------------------------------
     public void teleport(double x, double y);
}//end of Teleport. 