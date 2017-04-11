package headfirst.decorator.starbuzz;

public class hotMilk extends CondimentDecorator
{
    Beverage beverage;
    public hotMilk(Beverage b)
    {
      this.beverage = b;
    }
    public String getDescription()
    {
      return beverage.getDescription()+"Adding hotMilk\n";
    }
    public double cost()
    {
      return beverage.cost()+0.5;
    }
}