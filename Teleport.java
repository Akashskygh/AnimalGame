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
     public int getX();
     //-----------------------------------------------
     //method getY() - get Y coordinate of character
     //-----------------------------------------------
     public int getY();
     //----------------------------------------------
     //teleport() - teleport character to new position
     //----------------------------------------------
     public void teleport(int x, int y);
}//end of Teleport. 
