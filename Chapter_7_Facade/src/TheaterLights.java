public class TheaterLights {
    String description;


    public TheaterLights(String description){
        this.description = description;
    }

    public void on(){ System.out.print(this.description + ": is on.\n"); }

    public void off(){ System.out.print(this.description + ": is off.\n"); }

    public void dim(int value){
        System.out.print(this.description + ": dim set to " + value + ".\n");
    }


    public String toString(){ return this.description; }





}
