public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        double cost = beverage.cost();

        if (beverage.getSize() == Size.TALL){ cost += .10; }
        else if (beverage.getSize() == Size.GRANDE){ cost += .15; }
        else if (beverage.getSize() == Size.VENTI){ cost += .20; }

        return cost;
    }
}
