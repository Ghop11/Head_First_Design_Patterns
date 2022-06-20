
public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

//    public abstract display();

    public void performFly(){
        flyBehavior.fly();
    };
    public void performQuack(){
        quackBehavior.quack();
    };

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    };

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void swim(){
        System.out.print("All ducks float, even decoys!");
    }
}
