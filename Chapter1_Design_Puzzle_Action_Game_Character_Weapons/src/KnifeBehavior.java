public class KnifeBehavior implements WeaponBehavior{
    public void fight() {
        System.out.print("Weapon is a Knife!\n");
    }
    public int hit(){
        return 50;
    };
}
