public class PopcornPopper {
    String description;

    public PopcornPopper(String description){
        this.description  = description;
    }

    public void on(){ System.out.print(this.description + ": is on.\n"); }

    public void off(){ System.out.print(this.description + ": is off.\n"); }

    public void pop(){ System.out.print(this.description + ": Popcorn is popping.\n"); }


    public String toString(){ return this.description; }


}
