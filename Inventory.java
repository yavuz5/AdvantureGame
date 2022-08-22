public class Inventory {
    boolean water;
    boolean food;
    boolean fireWood;
    String weaponName;
    String armorName;
    Integer weaponDamage;
    Integer armorDefance;

    public Inventory(boolean water, boolean food, boolean fireWood, String weaponName, String armorName, Integer weaponDamage, Integer armorDefance) {
        this.water = water;
        this.food = food;
        this.fireWood = fireWood;
        this.weaponName = weaponName;
        this.armorName = armorName;
        this.weaponDamage = weaponDamage;
        this.armorDefance = armorDefance;
    }

    public Inventory(){
        this(false,false,false,"Empty","Empty",0,0);
    }

}
