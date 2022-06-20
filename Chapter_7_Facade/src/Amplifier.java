public class Amplifier {
    Tuner tuner;
    StreamingPlayer player;
    String description;

    public Amplifier(String description){
        this.description = description;
    }

    public void on(){
        System.out.print(description + " is on.\n");
    }

    public void off(){
        System.out.print(description + " is off.\n");
    }
    public void setStreamingPlayer(StreamingPlayer player){
        this.player = player;
    }

    public void setStereoSound(){}
    public void setSurroundSound(){}

    public void setTuner(Tuner tuner){
        this.tuner = tuner;
    }
    public void setVolume(int value){}

    public String toString(){

        return this.description;
    }


}
