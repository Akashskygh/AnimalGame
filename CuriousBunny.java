import java.awt.Point;  

public class CuriousBunny extends Animal implements Teleport
{
     // Declare varibles. 
     Point location = new Point(0,0); //default location is (0,0) when character is created
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
     
     public String getPosition()
     {
       return "("+ location.getX() + ", "+ location.getY() + ")";
     }
     
     public void teleport(double x, double y)
     {
       //To be completed - Kels
     }
     
}//end of CuriousBunny class.
