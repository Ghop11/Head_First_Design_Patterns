public class AxeBehavior implements WeaponBehavior {
    public void fight() {
        System.out.print("Weapon is an Axe!\n");
    }

    public int hit(){
      return 35;
    };
}
