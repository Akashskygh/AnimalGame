import java.awt.Point;  
public class CuriousBunny extends Animal 
{
     //---------------------------------------------------------
     //CuriousBunny's constructor.(this is the only constructor)  
     //---------------------------------------------------------
     public CuriousBunny(String color, String name)
     { 
          super(color, name);
          teleporter = "Bunny";      //this is Bunny. 
          location = new Point(0,0); //default location is (0,0) when character is created
     }//end of CuriousBunny
     
     //-------------------------------
     //hop() - display action/warning
     //-------------------------------
     public void hop()
     {
          doAction("is hopping");
     }//end of hop(). 
}//end of CuriousBunny class.
