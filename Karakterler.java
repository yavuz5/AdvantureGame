public abstract class Karakterler
{
    private int healt;
    private int power;
    private int money;
    private int ID;


    public Karakterler(int id,int healt, int power, int money )
    {
        this.setID(id);
        this.setHealt(healt);
        this.setMoney(money);
        this.setPower(power);

        System.out.println( toString() );     //Karakter proporties print.
    }
    public String toString()
    {
        return String.format("ID = %d\nHealt = %d\nPower = %d\nMoney = %d",
                getID(), getHealt(), getPower(), getMoney());
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
