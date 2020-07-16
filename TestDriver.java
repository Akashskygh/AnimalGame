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
          
          //Testing Actions. 
          bunny.hop();
          
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
          System.out.print( "\n"+duck.getPosition() );
          //--------------------------------------------------------------
          //Testing Attackers. (Only AngryDuck && LoudGoose are attackers)
          //--------------------------------------------------------------
          
     }// end of main()
}// end of class.
     
