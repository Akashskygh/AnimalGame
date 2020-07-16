import java.awt.Point; 
public class AngryDuck extends WaterFowl
{ 
     //-----------------------------------------
     // AngryDuck's only constructor
     //-----------------------------------------
     public AngryDuck(String color, String name)
     { 
          super(color, name);
          teleporter = "Duck";        //this is Duck. 
          location = new Point (0,0); //default is (0,0) when created.
          
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
}
