
//*****************************************************************
// WaterFowl.java - This is abstract class for Duck && Goose
// Contributors: Zein, Kelsee, Akash, James. 
//*****************************************************************
public abstract class WaterFowl extends Animal implements Attackers
{ 
     //declare varibles.
     protected boolean fly_state = false; // state (flying/landing) of character.
     protected int kills = 0;             // kills that character got.
     
     //-----------------------------------------
     // WaterFowl's only construct
     //-----------------------------------------
     public WaterFowl(String color, String name) 
     { 
          super(color,name); 
     } //end of constructor. 
     
     //----------------------------------------
     // fly() - do action flying
     //----------------------------------------
     final public String fly()
     {
          if ( health > 0 ) { 
               if ( fly_state == true) {  
                    return "Duck is still flying and had not yet landed.";
               } else { 
                    fly_state = true; 
                    return name + " is flying!";
               }
          } else  {  
               return "No such action is possible, your animal is dead. You shouldn't have abused it."; 
          }
     }//end of fly(). 
     
     //------------------------------------
     // land() - do action landing
     //------------------------------------
     final public String land()
     {  
          if ( health > 0 ) { 
               if (fly_state == false) { 
                    return "Duck isn't flying."; 
               } else {
                    fly_state = false; 
                    return name + " is landing.";
               }
          } else { 
               return "No such action is possible, your animal is dead. You shouldn't have abused it." ; 
          }
     }//end of land(). 
     
     //--------------------------------------
     // swim() - do action swimming
     //--------------------------------------
     final public void swim()
     { 
          doAction(" is swimming.");
     }//end of swim().
     
     //---------------------------------------
     // fly_state() - return flying state
     //----------------------------------------
     final public boolean fly_state()
     { 
          return fly_state;
     }//end of fly_state(). 
     
     //--------------------------------------
     // attack() - attack other players. 
     //---------------------------------------
     final public void attack(Animal name1) 
     {   
          if ( health == 0)
          { 
               System.out.println("Your animal cannot attack because it's dead"); 
          } else if ( name1.getClass().getSimpleName().compareTo(this.getClass().getSimpleName()) == 0) {
               System.out.println("Your animal cannot attack from its own type");
          }  else if (name1.health == 0 ) {
               System.out.println("You cannot hit a dead animal"); 
          } else if (name1.health == 1) { 
               kills++; 
               name1.hit(1); 
               System.out.println("Succesful strike, the animal is now Dead"); 
          } else { 
               System.out.println("Succesful strike, the animal is now Hit"); 
               name1.hit(1); 
          }    
     }//end of attack(). 
     
     //-------------------------------------------------
     // getKillCount() - return kills that character got
     //-------------------------------------------------
     final public int getKillCount()
     {
          return kills;
     }//end of getKillCount().
}//end of class. 
