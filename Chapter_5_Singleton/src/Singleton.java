public class Singleton {
    private static Singleton uniqueInstance;


    private Singleton() {
        uniqueInstance = new Singleton();
        System.out.print("New instance created");
    }


    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // the rest of the class method should follow under the comment
}
