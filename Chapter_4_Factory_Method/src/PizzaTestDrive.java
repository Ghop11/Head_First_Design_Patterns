public class PizzaTestDrive {
    public static void main(String [] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStyleStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.print("Ethan ordered a " + pizza.getName() + "\n");

        System.out.print("==================================================================\n\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.print("Joel ordered a " + pizza.getName() + "\n");

        System.out.print("==================================================================\n\n");

    }
}
