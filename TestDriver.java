import java.awt.Point;

public class TestDriver
{
     public static void main (String[] args)
     {
          CuriousBunny bunny = new CuriousBunny ("White", "Bugs");
          HappyPig pig = new HappyPig ("Pink", "Peppa");
          AngryDuck duck = new AngryDuck ("Black", "Donald");
          LoudGoose goose = new LoudGoose ("Yellow", "Daisy");
          
          bunny.hop();
          System.out.print("\n"+bunny.getPosition());
     
     }// end of main()
     
}// end of class
     
