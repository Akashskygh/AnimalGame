//Zein Elrez, ID#T00658875
import java.util.*; 

public class HappyPig extends Animal 
{ 
  public HappyPig(String color, String name)
  { 
    super(color, name);
  }
  
  public String getColor()
  { 
    return super.getColor(); 
  } 
  
  public void setColor(String color1)
  { 
    color = color1; 
  }
  
  public String getName()
  { 
    return name; 
  } 
   
  public void setName(String name1)
  { 
    name = name1; 
  }
  
  public int getHealth()
  {
    return health; 
  } 
  
  public String hit(int times)
  { 
    return super.hit(times); 
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
 
  public String toString() 
   { 
     return super.toString();  
   }
}
