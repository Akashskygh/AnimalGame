//----------------------------------------------------------------
// Teleport.java - INTERFACE
// Auhthors: James Nguyen & Kelsee Carmichael. 
// Last updated by: null. 
//----------------------------------------------------------------
import java.util.*; //import java ultility package. 

public interface Teleport
{
     //-------------------------------------------------------------------------
     //method getPosition() - get character and return its position as a String
     //-------------------------------------------------------------------------
     public String getPosition(Animal name1); 
     //------------------------------------------------------------------------------------
     //method teleport() - get position from user and teleport character to given position
     //------------------------------------------------------------------------------------
     public void teleport(int x, int y);
}//end of Teleport. 