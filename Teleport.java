//***************************************************
// Teleport.java - INTERFACE
// Contributors: James Nguyen & Kelsee Carmichael. 
// Last updated by: James 3:37AM 16/07/20. 
//***************************************************
import java.awt.Point;  //import Point 2D
public interface Teleport
{    
     //-------------------------------------------------------------------------
     //method getPosition() - get character and return its position as a String
     //-------------------------------------------------------------------------
     public String getPosition(); 
     //-----------------------------------------------
     //method getX() - get X coordinate of character
     //-----------------------------------------------
     public double getX();
     //-----------------------------------------------
     //method getY() - get Y coordinate of character
     //-----------------------------------------------
     public double getY();
     //----------------------------------------------
     //checkCoord() - check validity of coordinate
     //----------------------------------------------
     public void checkCoord();
     //------------------------------------------------------------------------------------
     //method teleport() - get position from user and teleport character to given position
     //------------------------------------------------------------------------------------
     public void teleport(double x, double y);
}//end of Teleport. 
