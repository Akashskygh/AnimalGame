import java.awt.Point; 

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
     
     public boolean fly_state()
     {
          return super.fly_state();  
     } 
     
     public void attack(Animal name1) 
     {
          super.attack(name1); 
     } 
     
     public int getKillCount()
     {
          return super.getKillCount();
     }
     
     //-------------------------------------------------------------------------
     //method getPosition() - get character and return its position as a String
     //-------------------------------------------------------------------------
     public String getPosition()
     {
          return "("+ location.getX() + ", "+ location.getY() + ")";
          
     }//end of getPostion(). 

     //------------------------------------------------------------------------------------
     //method teleport() - get position from user and teleport character to given position
     //------------------------------------------------------------------------------------
     public void teleport(double x, double y)
     { 
       //to be completed - Kels
     }//end of teleport(). 

       
}//end of AngryDuck class. 
