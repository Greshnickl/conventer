public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Jane");
        Item rock = new Item("Rock", 1, "Simple rock", 1, "COMMON");
        player1.addItem(rock);
        Weapon sword = new Weapon();
        RangeWeapon bow = new RangeWeapon(10, 20);
        System.out.println(rock.getRarity());
        //System.out.println(bow.getDamage());




    }
}