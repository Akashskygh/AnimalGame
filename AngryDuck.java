//*******************************************
// AngryDuck.java 
// Contributors: Zein, Kelsee, Akash, James
//*******************************************
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
     }//end of constructor.
     
     //-------------------------------------------------------------------------
     //method getPosition() - get character and return its position as a String
     //-------------------------------------------------------------------------
     public String getPosition()
     {
          return super.name + " is at ("+ location.getX() + ", "+ location.getY() + ")";
          
     }//end of getPostion(). 
     //-----------------------------------------------
     //method getX() - get X coordinate of character
     //-----------------------------------------------
     public int getX()
     {
          return (int) location.getY();
     }//end of getX()
     //-----------------------------------------------
     //method getY() - get Y coordinate of character
     //-----------------------------------------------
     public int getY()
     {
          return (int) location.getX();
     }//end of getY()
     
     //------------------------------------------------------------------------------------
     //method teleport() - get position from user and teleport character to given position
     //------------------------------------------------------------------------------------
     public void teleport(int x, int y)
     { 
       if (x >= 0 && x <= 500 && y >= 0 && y <= 1000)
            location.setLocation(x, y);
          else
            System.out.print("Cannot teleport, area is out of bounds!");
     }//end of teleport(). 
}//end of AngryDuck class. 
