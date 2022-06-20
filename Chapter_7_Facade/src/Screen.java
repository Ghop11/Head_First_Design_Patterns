public class Screen {
    String description;


    public Screen(String description){
        this.description = description;
    }

    public void up(){
        System.out.print(this.description + ": is going up.\n");
    }

    public void down(){
        System.out.print(this.description + ": is going down.\n");
    }


    public String toString(){
        return this.description;
    }



}
