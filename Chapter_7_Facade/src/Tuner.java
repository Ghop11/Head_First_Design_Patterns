public class Tuner {
    Amplifier amplifier;
    String description;
    double frequency;

    public Tuner(String description, Amplifier amplifier){
        this.description = description;
        this.amplifier =  amplifier;
    }

    public void on(){
        System.out.print(description + " is on.\n");
    }

    public void off(){
        System.out.print(description + " is off.\n");
    }

    public void setAm(){
        System.out.print(description + " set to AM radio.\n");
    }

    public void setFm(){
        System.out.print(description + " set to FM radio.\n");
    }

    public void setFrequency(double frequency){
        this.frequency = frequency;
        System.out.print(description + " frequency set to " + this.frequency);
    }
}
