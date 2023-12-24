public class Item {
    private String name;
    private int cost;
    private String description;
    private int weight;
    private String rarity;

    public Item(){
        this.name = "default";
        this.cost = 0;
        this.description = "empty";
        this.weight = 0;
        this.rarity = "Common";
    }
    public Item(String name, int cost, String description, int weight, String rarity){
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.weight = weight;
        this.rarity = rarity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRarity() {
        return rarity;
    }
    public void setRarity(String rarity){
        this.rarity = rarity;
    }
}
