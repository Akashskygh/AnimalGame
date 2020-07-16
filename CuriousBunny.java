import java.awt.Point;  //import Point 2D

public class CuriousBunny extends Animal implements Teleport
{
     // Declare varibles. 
     protected Point location = new Point(0,0); //default is (0,0) when the character created. 
     
     //---------------------------------------------------------
     //CuriousBunny's constructor.(this is the only constructor)  
     //---------------------------------------------------------
     public CuriousBunny(String color, String name)
     { 
          super(color, name);
          location = new Point(0,0); //Bunny can teleport so it will have location. 
     }//end of CuriousBunny
     
     //-------------------------------
     //hop() - display action/warning
     //-------------------------------
     public void hop()
     {
          doAction("is hopping");
     }//end of hop(). 

     //-------------------------------------------------------------
     //method getPosition() - return character position as a String
     //-------------------------------------------------------------
     public String getPosition()
     {
          return "("+ location.getX() + ", "+ location.getY() + ")";
          
     }//end of getPostion(). 
     //-----------------------------------------------
     //method getX() - get X coordinate of character
     //-----------------------------------------------
     public double getX()
     {
          return location.getX();
     }//end of getX()
     //-----------------------------------------------
     //method getY() - get Y coordinate of character
     //-----------------------------------------------
     public double getY()
     {
          return location.getY();
     }//end of getY()
     //---------------------------------------------
     // checkCoord() - check validity of location
     //---------------------------------------------
     public void checkCoord()
     {
          //Kelsee please help me with this. 
     }//end of checkCoord().
     //------------------------------------------------------------------------------------
     //method teleport() - get position from user and teleport character to given position
     //------------------------------------------------------------------------------------
     public void teleport(double x, double y)
     { 
       //to be completed - Kels
     }//end of teleport(). 
     
}//end of CuriousBunny class.
