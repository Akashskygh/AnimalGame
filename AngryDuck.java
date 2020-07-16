import java.awt.Point; //import Point 2D
public class AngryDuck extends WaterFowl implements Teleport
{ 
     //Declare varibles.
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
     
}//end of AngryDuck class. 
