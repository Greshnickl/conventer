public class Item {
    private String name;
    private int cost;
    private String description;
    private int weight;
    private enum Rarity{
        COMMON,
        RARE,
        ULTRA_RARE,
        EPIC,
        LEGENDARY
    }
    private Rarity rarity;


    public Item(){
        this.name = "default";
        this.cost = 0;
        this.description = "empty";
        this.weight = 0;
        this.rarity = Rarity.COMMON;
    }
    public Item(String name, int cost, String description, int weight, String rarity){
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.weight = weight;
        switch (rarity){
            case "COMMON": this.rarity = Rarity.COMMON; break;
            case "RARE": this.rarity = Rarity.RARE; break;
            case "ULTRA_RARE": this.rarity = Rarity.ULTRA_RARE; break;
            case "EPIC": this.rarity = Rarity.EPIC; break;
            case "LEGENDARY": this.rarity = Rarity.LEGENDARY; break;
        }
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

    public Rarity getRarity() {
        return rarity;
    }
    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
}
