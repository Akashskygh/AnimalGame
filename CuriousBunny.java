import java.awt.Point;  

public class CuriousBunny extends Animal implements Teleport
{
     // Declare varibles. 
     protected Point location = new Point(500,0); //default location is (500,0) when character is created
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
          doAction("is hopping");
     }//end of hop(). 
     //-------------------------------------------
     //getPosition - return position of character
     //-------------------------------------------
     public String getPosition()
     {
       return super.name + " is at ("+ location.getX() + ", "+ location.getY() + ")";
     }
     //-----------------------------------------------
     //method getX() - get X coordinate of character
     //-----------------------------------------------
     public double getX()
     {
          return location.getY();
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

     public void teleport(double x, double y)
     {
          if (x > 500 && x < 1000 && y > 0 && y < 1000)
            location.setLocation(x, y);
          else
            System.out.println("Cannot teleport, area is out of bounds!");         
     }
     
}//end of CuriousBunny class.
