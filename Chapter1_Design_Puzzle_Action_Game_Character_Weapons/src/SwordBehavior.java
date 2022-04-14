public class SwordBehavior implements WeaponBehavior{
    public void fight() {
        System.out.print("Weapon is a Sword!!\n");
    }
    public int hit(){
        return 75;
    };
}
