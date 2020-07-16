import java.awt.Point;  

public class CuriousBunny extends Animal implements Teleport
{
     //---------------------------------------------------------
     //CuriousBunny's constructor.(this is the only constructor)  
     //---------------------------------------------------------
     public CuriousBunny(String color, String name)
     { 
          super(color, name);
          String teleporter = "Bunny";      //this is Bunny. 
          Point location = new Point(0,0); //default location is (0,0) when character is created
     }//end of CuriousBunny
     
     //-------------------------------
     //hop() - display action/warning
     //-------------------------------
     public void hop()
     {
          doAction("is hopping");
     }//end of hop(). 
     
     public String getPosition(Animal name1)
     {
       return "("+ location.getX() + ", "+ location.getY() + ")";
     }
     
     public void teleport(int x, int y)
     {
       //To be completed - Kels
     }
     
}//end of CuriousBunny class.
