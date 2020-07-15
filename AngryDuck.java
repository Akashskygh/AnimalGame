import java.util.*; 

public class AngryDuck extends WaterFowl
{ 
  public AngryDuck(String color, String name)
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
    color = color1; 
  }
  
  public int getHealth()
  {
    return health; 
  } 
  
  public String hit(int times)
  { 
    return super.hit(times); 
  } 
  
  public String fly()
  { 
    return super.fly();  
  }
  
  public String land()
  { 
    return super.land(); 
  }
 
  public String swim()
  { 
    return super.swim();
  }   
 
  public boolean fly_state()
  {
    return super.fly_state();  
  } 
  
  public void attack(Animal name1) 
  {
    super.attack(name1); 
  } 
  
  public int getKillCount()
  {
    return super.getKillCount();
  }
    
 
  public String toString() 
  { 
    return super.toString();   
  }   
}
