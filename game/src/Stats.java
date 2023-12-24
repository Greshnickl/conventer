public class Stats {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;


    public Stats(){
        this.strength = 10;
        this.dexterity = 10;
        this.constitution = 10;
        this.intelligence = 10;
        this.wisdom = 10;
        this.charisma = 10;
    }
    public Stats(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }


    public void printAllStats(){
        System.out.println("Strength= "+this.strength);
        System.out.println("Dexterity= "+this.dexterity);
        System.out.println("Constitution= "+this.constitution);
        System.out.println("Intelligence= "+this.intelligence);
        System.out.println("Wisdom= "+this.wisdom);
        System.out.println("Charisma= "+this.charisma);
    }
}
