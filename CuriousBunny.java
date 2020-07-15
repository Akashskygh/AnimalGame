import java.util.*; 

public class CuriousBunny extends Animal
{
  public CuriousBunny(String color, String name)
  { 
    super(color, name); 
  } 
  
  public String getName()
  { 
    return name; 
  } 
  
  public void setName(String name1)
  {
    name = name1; 
  }
  
  public String getColor()
  { 
    return super.getColor(); 
  } 
  
  public void setColor(String color1)
  { 
    color= color1; 
  }
  
  public int getHealth()
  {
    return health; 
  } 
  
  public String hit(int times)
  { 
    return super.hit(times); 
  } 
  
  public String hop() 
  { 
    if ( health > 0 )
    { 
      return name + " is hoping...";
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
