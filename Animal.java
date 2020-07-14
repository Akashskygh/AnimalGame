//Zein Elrez, ID#T00658875
import java.util.*; 

public abstract class Animal 
{
  protected static int count = 0;
  protected String color = "";
  protected int health = 3; 
  protected String name = ""; 
  private final String dead_mess= "No such action is possible, your animal is dead. You shouldn't have abused it."
  
  public Animal(String color, String name)
  { 
    this.color = color;  
    this.name = name; 
    count++; 
  } 
  
  public String getColor()
  { 
    return color + " is the color of your animal."; 
  }
  
  public void setColor(String color1)
  { 
    color = color1; 
  } 
  
  public String getName()
  {
    return name + " is the name of your animal.";
  }
  
  public void setName(String name1) 
  {
    name = name1; 
  }
  
  public int getHealth()
  { 
    return health; 
  }
  
  public String hit(int times )
  { 
    
  { 
    if (health == 0)
        { 
          return "STOP! Stop hitting a dead bunny-ERROR";  
        } 
    
    for (int hits=0; hits < times; hits++)
    {
        if ( health > 0 )
        { 
          health--; 
        }
    
        else 
        { 
          count--; 
          return dead_mess;
        }
    }
    
        return "Make sure to not abuse animals again!";
  }
  
  } 
  
  public String toString() 
  { 
    String result; 
    result = "This animal is a " + this.getClass().getSimpleName()  + " of color " + color + ", it is called " + name + " and health is at " + health + ".";   
    return result;    
  } 
  
}
