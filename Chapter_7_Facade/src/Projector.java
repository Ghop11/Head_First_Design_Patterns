public class Projector {
    StreamingPlayer player;
    String description;

    public Projector(String description, StreamingPlayer player){
        this.description = description;
        this.player = player;
    }

    public void on(){ System.out.print(this.description + ": is on.\n"); }

    public void off(){ System.out.print(this.description + ": is off.\n"); }

    public void tvMode(){ System.out.print(this.description + ": is on TV Mode.\n"); }

    public void wideScreenMode(){
        System.out.print(this.description + ": is on Wide Screen Mode\n");
    }

    public String toString(){ return this.description; }





}
