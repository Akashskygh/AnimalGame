//**********************************************
// HappyPig.java 
// contributors: Zein, Kelsee, Akash, James
//**********************************************
public class HappyPig extends Animal 
{ 
     //----------------------------------------
     // HappyPig's constructor
     //----------------------------------------
     public HappyPig(String color, String name)
     { 
          super(color, name);
     }//end of constructor.
          
     //-------------------------------------
     // sleep() - return action sleeping.
     //-------------------------------------
     final public String sleep() 
     { 
          doAction("is sleeping..."); //only the happy pig can sleep. 
     }//end of sleep(). 
     //------------------------------------
     //roll() -return action rolling
     //------------------------------------
     final public String roll() 
     { 
          doAction("is rolling...");
     }//end of roll(). 
}//end of HappyPig class. 
