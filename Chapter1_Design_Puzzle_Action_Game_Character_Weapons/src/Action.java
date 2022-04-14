public class Action {
    public static void main(String[] args){
        Character king = new King();
        king.fight();

        Character queen = new Queen();
        queen.fight();


        System.out.print("Round 1: \n");
        king.health -= queen.hit();

        System.out.print("King's health is at " + king.health + " and is ready to strike.");



    };
}
