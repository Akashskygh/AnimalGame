//******************************************
// CuriousBunny.java 
// Contributors: Zein, Kelsee, Akash, James.
//*******************************************
import java.awt.Point;  //import Point 2D
public class CuriousBunny extends Animal implements Teleport
{
     // Declare varibles. 
     Point location = new Point(500,0); //default location is (500,0) when character is create

     //---------------------------------------------------------
     //CuriousBunny's constructor.(this is the only constructor)  
     //---------------------------------------------------------
     public CuriousBunny(String color, String name)
     { 
          super(color, name);
     }//end of CuriousBunny
     
     //-------------------------------
     //hop() - display action/warning
     //-------------------------------
     public void hop()
     {
          doAction("is hopping!");
     }//end of hop(). 

     //-------------------------------------------------------------
     //method getPosition() - return character position as a String
     //-------------------------------------------------------------
     public String getPosition()
     {

       return super.name + " is at ("+ location.getX() + ", "+ location.getY() + ")";
          
     }//end of getPostion(). 

     //-----------------------------------------------
     //method getX() - get X coordinate of character
     //-----------------------------------------------
     public int getX()
     {
          return (int) location.getX();

     }//end of getX()
     //-----------------------------------------------
     //method getY() - get Y coordinate of character
     //-----------------------------------------------
     public double getY()
     {
          return (int) location.getY();
     }//end of getY()

     public void teleport(int x, int y)
     {
          if (x >= 500 && x <= 1000 && y >= 0 && y <= 1000)
            location.setLocation(x, y);
          else
            System.out.println("Cannot teleport, area is out of bounds!");         
     }//end of teleport(). 

     
}//end of CuriousBunny class.
