//-----------------------------------------
//Animal is abstract class.
//Contributors: Akash, Zein, Kelsee, James 
//-----------------------------------------
import java.awt.Point;
public abstract class Animal implements Teleport 
{
     protected static int count = 0;            //count is static varible. 
     protected String color = "";               //color of character. 
     protected int health = 3;                  //health of character. (deafault is 3/3 when created)  
     protected String name = "";                //name of character.
     protected String teleporter ="null";       // only bunny & duck can teleport. 
     protected Point location = new Point(0,0); //storage location of character
     //------------------------------------------------------------
     // Animal's constructor (this class has only one constructor)  
     //------------------------------------------------------------
     public Animal(String color, String name)
     { 
          this.color = color; //set color for animal. 
          this.name = name;   //set name for animal. 
          count++;            //count+1 when constructor is invoked. 
     }//end of constructor  
     
     //-----------------------------------------------------
     //getColor() - return a String with color of character
     //-----------------------------------------------------
     final public String getColor()
     { 
          return color + " is the color of your animal."; 
     }//end of getColor()
     
     //--------------------------------------------------
     //setColor() set color of character.
     //--------------------------------------------------
     final public void setColor(String color)
     { 
          this.color = color; 
     }//end of setColor()
     
     //---------------------------------------------------
     //getName() - return a String with name of character
     //---------------------------------------------------
     public String getName()
     {
          return name + " is the name of your animal.";
     }//end of getName()
     
     //-----------------------------------------
     // setName() - set new name for character
     //-----------------------------------------
     final public void setName(String name) 
     {
          this.name = name; 
     }//end of setName
     
     //-----------------------------------------
     //getHealth() - return health of character
     //-----------------------------------------
     final public int getHealth()
     { 
          return health; 
     }//end of getHealth()
     //-------------------------------------------------
     //setHealth() - set new health value for character.
     //-------------------------------------------------
     final public void setHealth(int newHealth) 
     {
          if (health<=0 && newHealth>0){
               count++; //animal is now alive again. 
          } else if (health>0 && newHealth<=0){
               count--; //animal is now dead. 
          }
          health = newHealth; //set new health. 
     }//end of setHealth
     //----------------------------------------
     //hit() - hits the character 
     //----------------------------------------
     final public String hit(int times )
     { 
          
          { 
               if (health == 0)
               { 
                    return "STOP! Stop hitting a dead bunny-ERROR";  
               } 
               
               for (int hits=0; hits < times; hits++)
               {
                    if ( health > 0 )
                    { 
                         health--; 
                    }
                    
                    else 
                    { 
                         count--; 
                         return "No such action is possible, the animal is dead. You shouldn't have abused it.";
                    }
               }
               
               return "Make sure to not abuse animals again!";
          }
          
     } 
     //-------------------------------------------------------------------------------------
     //doAction() - to check if animal alive or not then print action/warning
     //-------------------------------------------------------------------------------------
     public void doAction(String action)
     {
          if (health>0)
          {
               System.out.printf("\n%s is %s",name, action); //display action. 
          } else {
               System.out.printf("\n%s has died, action can't be done",name);
          }
          
     }//end of doAction.
     //-------------------------------------------------------------------------------------
     //toString() - return a string with character basic info
     // *note: I'm not sure if you guys override this in WaterFowls so I leave it not final.  
     //--------------------------------------------------------------------------------------
     public String toString() 
     { 

          String result = "This animal is a " + this.getClass().getSimpleName()  + " of color " + color + ", it is called " + name + " and health is at " + health + ".";   
          return result;    
     } 
     //-------------------------------------------------------------------------
     //method getPosition() - get character and return its position as a String
     //-------------------------------------------------------------------------
     public String getPosition()
     {
          return "("+location.getX() + ", "+location.getY() + ")";
     }//end of getPostion(). 
     
     //------------------------------------------------------------------------------------
     //method teleport() - get position from user and teleport character to given position
     //**Kelsee help me with this part please. Thank u so muchhh!!!    
     //** note: I added a varible teleporter to Bunny & Duck class's constructors to mark they 
     //can teleport. Remember to use this to teleport them since they each of them only can 
     //teleport to one half of the map. 
     //------------------------------------------------------------------------------------
     public void teleport(double x, double y)
     { 
     }//end of teleport(). 
     
}//end of abstract class Animal. 
