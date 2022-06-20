

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

        System.out.print("\n");


        // Add the adapter turkey
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        // make sure the turkey can act on its own
        System.out.print("The Turkey says...\n");
        turkey.gobble();
        turkey.fly();

        // test a duck
        System.out.print("\ntestDuck(mallard): The Duck says: \n");
        testDuck(mallard);

        // try to pass off the turkey as a duck
        System.out.print("\ntestDuck(turkeyAdapter): The turkeyAdapter says: \n");
        testDuck(turkeyAdapter);

    }


    static void testDuck(Duck duck){
        duck.performQuack();
        duck.performFly();
    }



}
