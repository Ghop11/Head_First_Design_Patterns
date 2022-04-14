public abstract class Character {
    WeaponBehavior weaponBehavior;
    HealthBehavior healthBehavior;
    int health = 150;
    int armor = 150;


    public Character(){};

    public void fight(){
        weaponBehavior.fight();
    };
    public int hit(){return weaponBehavior.hit();};

    public void setWeaponBehavior(WeaponBehavior w){weaponBehavior = w;};
}
