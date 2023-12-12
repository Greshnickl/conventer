public class Main {
    public static void main(String[] args) {
        Stats stats1 = new Stats(11, 12, 13, 14, 15, 16);
        Player player1 = new Player("Jane");
        //player1.getStats().printAllStats();
        Item item = new Item();
        player1.addItem(item);
        player1.addItem();
        for (Item i : player1.getInventory()){
            System.out.println(i.getName());
        }
    }
}