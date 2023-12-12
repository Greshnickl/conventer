import java.util.ArrayList;
public class Player {
    private String name;
    private int hp;
    private int level;
    private int xp;
    private Stats stats;
    private ArrayList<Item> inventory;



    public Player(){
        this.level = 1;
        this.xp = 0;
        this.stats = new Stats();
    }
    public Player (String name) {
        this.name = name;
        this.level = 1;
        this.xp = 0;
        this.stats = new Stats();
        this.inventory = new ArrayList<Item>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
    public void addItem(Item item){
        this.inventory.add(item);
    }
    public void addItem(){
        this.inventory.add(new Item());
    }
}
