public class StreamingPlayer {
    Amplifier amplifier;
    String description;
    String movie;

    public StreamingPlayer(String description, Amplifier amplifier){
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.print(this.description + " is on.\n");
    }

    public void off(){
        System.out.print(this.description + " is off.\n");
    }

    public void pause(){
        System.out.print(this.description + " is now paused.\n");
    }

    public void play(String movie){
        System.out.print(this.description + " is now playing " + movie + ".\n");
        this.movie = movie;
    }

    public void stop(){
        System.out.print(this.description + " stopped playing.\n");
    }

    public void setSurroundAudio(){}
    public void setTwoChannelAudio(){}
    public String toString(){
        // maybe add the movie
        return this.description;
    }




}
