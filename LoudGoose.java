import java.util.*; 

public class LoudGoose extends WaterFowl
{
  public LoudGoose(String color, String name)
  { 
    super(color, name); 
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
 
}
