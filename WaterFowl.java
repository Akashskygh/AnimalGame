//Zein Elrez, ID#T00658875
import java.util.*; 

public class WaterFowl extends Animal 
{ 
  protected boolean fly_state = false; 
  
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
       return dead_mess; 
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
       return dead_mess ; 
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
       return dead_mess; 
     }
    
  }
   
  public boolean fly_state()
  { 
     return fly_state;
  }
    
  public String toString() 
  {  
     return super.toString();   
  }   
}
