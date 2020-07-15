import java.util.*; 

public class WaterFowl extends Animal implements Attackers
{ 
  protected boolean fly_state = false; 
  protected int kills = 0; 
  
  public WaterFowl(String color, String name) 
  { 
     super(color,name); 
  } 
    
  public String fly()
  {
     if ( health > 0 )
     { 
       if ( fly_state == true) 
       {  
         return "Duck is still flying and had not yet landed.";
       }
       else
       { 
         fly_state = true; 
         return name + " is flying...";
       }
     }

     else  
     {  
       return "No such action is possible, your animal is dead. You shouldn't have abused it."; 
     }
  }
  
  public String land()
  {  
     if ( health > 0 )
     { 
       if (fly_state == false) 
       { 
         return "Duck isn't flying..."; 
       }
      
       else 
       {
         fly_state = false; 
         return name + " is landing...";
       }
     }
   
     else 
     { 
       return "No such action is possible, your animal is dead. You shouldn't have abused it." ; 
     }
  }
  
  public String swim()
  { 
     if ( health > 0 )
     { 
       return name + " is swimming...";
     }
   
     else 
     { 
       return "No such action is possible, your animal is dead. You shouldn't have abused it."; 
     }
    
  }
   
  public boolean fly_state()
  { 
     return fly_state;
  }
  
  public void attack(Animal name1) 
  { 
    
    if ( health == 0)
    { 
      System.out.println("Your animal cannot attack because it's dead"); 
    } 
  
    else if ( name1.getClass().getSimpleName().compareTo(this.getClass().getSimpleName()) == 0) 
    { 
      System.out.println("Your animal cannot attack from its own type");
    }  
    
    else if (name1.health == 0 ) 
    { 
      System.out.println("You cannot hit a dead animal"); 
    } 
    
    else if (name1.health == 1) 
    { 
      kills++; 
      name1.hit(1); 
      System.out.println("Succesful strike, the animal is now Dead"); 
    } 
    
    else
    { 
      System.out.println("Succesful strike, the animal is now Hit"); 
      name1.hit(1); 
    } 
   
  }
  
  public int getKillCount()
  {
    return kills;
  }
       
    
  public String toString() 
  {  
     return super.toString();   
  }   
}
