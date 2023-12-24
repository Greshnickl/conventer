public class Weapon extends Item{
    private int damage;

    public Weapon(){
        this.damage = 1;
    }
    public Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
