import java.awt.Point; //import Point 2D
public class AngryDuck extends WaterFowl implements Teleport
{ 
     //Declare varibles.
     Point location = new Point (0,0); //default is (0,0) when created.
     //-----------------------------------------
     // AngryDuck's only constructor
     //-----------------------------------------
     public AngryDuck(String color, String name)
     { 
          super(color, name);
          location = new Point (0,0); //AngryDuck can teleport. 
          
     }//end of constructor.
     
     //-------------------------------------------------------------------------
     //method getPosition() - get character and return its position as a String
     //-------------------------------------------------------------------------
     public String getPosition()
     {
          return "("+ location.getX() + ", "+ location.getY() + ")";
          
     }//end of getPostion(). 
     //-----------------------------------------------
     //method getX() - get X coordinate of character
     //-----------------------------------------------
     public double getX()
     {
          return location.getY()
     }//end of getX()
     //-----------------------------------------------
     //method getY() - get Y coordinate of character
     //-----------------------------------------------
     public double getY()
     {
          return location.getX();
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
}//end of AngryDuck class. 
