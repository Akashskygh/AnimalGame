//Zein Elrez, ID#T00658875
public class HappyPig extends Animal 
{ 
     public HappyPig(String color, String name)
     { 
          super(color, name);
     }
          
     public String sleep() 
     { 
          if ( health > 0 )
          { 
               return name + " is sleeping..."; //only the happy pig can sleep 
          }
          
          else 
          { 
               return dead_mess; 
          }
     }    
     public String roll() 
     { 
          if ( health > 0 )
          { 
               return name + " is rolling...";
          }
          
          else 
          { 
               return dead_mess; 
          }
     }

}
