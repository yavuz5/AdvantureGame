public class Silah {
    int ID;
    int damage;
    int price;

    public Silah(int ID, int damage, int price) {
        this.ID = ID;
        this.damage = damage;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getClass()+"-").append(getDamage()+"-").append(getPrice()).append(">");
        return sb.toString();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
