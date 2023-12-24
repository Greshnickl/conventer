public class RangeWeapon extends Weapon{
    private int range;


    public RangeWeapon(){
        this.setDamage(1);
        this.range = 5;
    }

    public RangeWeapon(int range, int damage){
        this.range = range;
        this.setDamage(damage);
    }

}
