import java.awt.Point; 

public class AngryDuck extends WaterFowl implements Teleport
{ 
     //-----------------------------------------
     // AngryDuck's only constructor
     //-----------------------------------------
     public AngryDuck(String color, String name)
     { 
          super(color, name);
          String teleporter = "Duck";        //this is Duck. 
          Point location = new Point (0,0); //default is (0,0) when created.
          
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
     public String getPosition(Animal name1)
     {
          return "("+ location.getX() + ", "+ location.getY() + ")";
          
     }//end of getPostion(). 

     //------------------------------------------------------------------------------------
     //method teleport() - get position from user and teleport character to given position
     //**Kelsee help me with this part please. Thank u so muchhh!!!    
     //** note: I added a varible teleporter to Bunny & Duck class's constructors to mark they 
     //can teleport. Remember to use this to teleport them since they each of them only can 
     //teleport to one half of the map. 
     //------------------------------------------------------------------------------------
     public void teleport(int x, int y)
     { 
       //to be completed - Kels
     }//end of teleport(). 

       
}
