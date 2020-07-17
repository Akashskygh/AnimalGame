//******************************************************
// TestDriver.java - This class is for testing 
// Contributors: Zein, Kelsee, Akash, James 
//******************************************************
import java.awt.Point; //using Point 2D
public class TestDriver
{
     public static void main (String[] args)
     {
         
          // Creating (4) characters 
          CuriousBunny bunny = new CuriousBunny ("White", "Bugs");
          HappyPig pig = new HappyPig ("Pink", "Peppa");
          AngryDuck duck = new AngryDuck ("Black", "Donald");
          LoudGoose goose = new LoudGoose ("Yellow", "Daisy");
          
          //-----------------------------------------
          //Testing Actions (Not Teleport && Attack).
          //-----------------------------------------
          bunny.hop();
          pig.sleep();
          duck.fly();  //default state is landing - this should change duck state to flying. 
          goose.land();//default state is landing - this should display and ERROR message.
          
          //Testing senario when some of animals are dead
          duck.hit(3); //kill the (WaterFowl) duck.
          pig.hit(3);  //kill the pig. 
          
          pig.roll(); //this animal is dead now && should display an error message
          pig.sleep();//                      (same)
          duck.fly(); //                      (same)    
          
          //display info of character. 
          System.out.print("\n"+duck.toString());
          System.out.print("\n"+pig.toString());
          System.out.printf("\nflying state of %s: %b", duck.getName(),duck.fly_state() ); //WaterFowl when dead the state should be landing (false). 
          
          //----------------------------------------------------------------
          //Testing Teleport. (Only CuriousBunny && AngryDuck can teleport)
          //----------------------------------------------------------------
          //display default positions.  
          System.out.print("\n"+bunny.getPosition());
          System.out.print("\n"+duck.getPosition());
          
          //using teleport(). 
          bunny.teleport(100,12.5); 
          duck.teleport(-1,2); 
          
          //display new positions. 
          System.out.print( "\n"+bunny.getPosition() );
          System.out.print( "\n"+duck.getPosition() +"\n");
          //--------------------------------------------------------------
          //Testing Attackers. (Only AngryDuck && LoudGoose are attackers)
          //--------------------------------------------------------------
          
          //testing attack.
          duck.attack(bunny);  
          duck.attack(goose);
          goose.attack(goose); //attack its own type (should display an error message)  
          goose.attack(duck);
          goose.attack(bunny);
          //display health of character being attacked. 
          System.out.print("\n"+bunny.toString());
          System.out.print("\n"+goose.toString());
          System.out.print("\n"+duck.toString());
          System.out.print("\n"+duck.toString());
         
     }// end of main()
}// end of class.
     
