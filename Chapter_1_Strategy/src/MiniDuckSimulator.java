

public class MiniDuckSimulator {
    public static void main(String[] args){
        System.out.print("Mallard Duck: \n");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.print("\n");

        System.out.print("Model Duck: \n");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
