import java.util.Scanner;

public class User
{
    private int health;
    private int power;
    private int money;
    private int rHealt;
    private String name;

    int choose;

    Scanner input = new Scanner(System.in);

    public void SelectCharacter()
    {

        System.out.println("Kullanici adinizi giriniz = ");
        name = input.nextLine();

        System.out.println("Hangi karakteri secmek istersiniz = ");
        System.out.println("1-)Samuray\n2-)Okcu\n3-)Sovalye");
        choose = input.nextInt();
        while( choose > 3 || choose < 0 )
        {
            System.out.println("Gecersiz bir deger girdiniz!!");
            System.out.println("Tekrar deneyiniz = ");
            choose = input.nextInt();
        }

        switch ( choose )
        {
            case 1:
                Karakterler a = new Samuray();
                a.toString();
                break;
            case 2:
                Karakterler b = new Okcu();
                b.toString();
                break;
            case 3:
                Karakterler c = new Sovalye();
                c.toString();
                break;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public int getrHealt()
    {
        return rHealt;
    }

    public void setrHealt(int rHealt)
    {
        this.rHealt = rHealt;
    }

    public String toString()
    {
        return String.format("Healt = %d\nPower = %d\nMoney = %d",
                getHealth(), getPower(), getMoney());
    }
}
