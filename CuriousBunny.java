import java.awt.Point;  

public class CuriousBunny extends Animal implements Teleport
{
     // Declare varibles. 

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
     //-------------------------------------------
     //getPosition - return position of character
     //-------------------------------------------
     
     
}//end of CuriousBunny class.
