package headfirst.decorator.starbuzz;

public class Soybean extends CondimentDecorator
{
  Beverage beverage;
  public Soybean(Beverage b)
  {
    this.beverage = b;
  }
  public String getDescription()
  {
   return beverage.getDescription()+"Adding Soy\n";
  }
  public double cost()
  {
    return beverage.cost()+0.15;
  }
}