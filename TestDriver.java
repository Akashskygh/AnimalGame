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

          Animal.displayCount();
          System.out.println ("\nFirst Animal-> " + bunny.toString());
          bunny.hop();
          bunny.hit(2);
          System.out.print("\nMake Bugs red!");
          bunny.setColor("Red");
          System.out.printf ("\n%s", bunny.getColor());
          bunny.hit(1);
          System.out.printf ("\nBugs has %d health point.", bunny.getHealth());
          bunny.hop();
          System.out.println ("\nMake animal's health 3 again!");
          bunny.setHealth(3);
          System.out.printf ("Bugs has %d health points again!", bunny.getHealth());
          
          System.out.println ("\n\nSecond Animal->" + pig.toString());
          pig.sleep();
          pig.roll();
          pig.hit(3);
          pig.sleep();
          
          System.out.println ("\n\nThird Animal-> " + duck.toString());
          duck.setName("Donald Trump");
          System.out.printf ("\n%s", duck.getName());
          duck.swim();
          duck.fly();
          System.out.printf("\nflying state is %b.", duck.fly_state());  
          
          System.out.println ("\n\nFourth Animal->" + goose.toString());
          goose.fly();
          goose.land();
          goose.swim();
          System.out.printf("\nflying state is %b.", goose.fly_state());
          System.out.println();
          Animal.displayCount();
         
          //----------------------------------------------------------------
          //Testing Teleport. (Only CuriousBunny && AngryDuck can teleport)
          //----------------------------------------------------------------
          //display default positions.  
          System.out.print("\n\n"+bunny.getPosition());
          System.out.print("\n"+duck.getPosition()+"\n");
          
          //using teleport()
          bunny.teleport(100,125);
          bunny.teleport(600,500);
          duck.teleport(-1,2); 
          
          //display new positions. 
          System.out.print( "\n"+bunny.getPosition() );
          System.out.print( "\n"+duck.getPosition() +"\n\n");
          
          //--------------------------------------------------------------
          //Testing Attackers. (Only AngryDuck && LoudGoose are attackers)
          //--------------------------------------------------------------
          
          System.out.printf ("Bugs has %d health point.\n", bunny.getHealth());
          duck.attack(bunny);  
          System.out.printf ("Bugs has %d health point.\n", bunny.getHealth());
          duck.attack(goose);
          goose.attack(goose); //attack its own type (should display an error message)  
          goose.attack(duck);
          goose.attack(bunny);
          goose.attack(bunny);
          System.out.printf ("Bugs has %d health point.\n", bunny.getHealth());
          goose.attack(duck);
          goose.attack(duck);
          duck.attack(goose);
          System.out.println("Daisy has a kill count of "+goose.getKillCount());
          System.out.println("Donald Trump has a kill count of "+duck.getKillCount());
      
     }// end of main()
}// end of class.
     
