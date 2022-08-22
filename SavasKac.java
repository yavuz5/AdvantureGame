import java.util.Scanner;

public class SavasKac
{
    Scanner input = new Scanner(System.in);
    private String choose;
    private User user;
    private Obstacle obstacle;

    public SavasKac(User user,Obstacle obstacle)
    {
        this.user = user;
        this.obstacle = obstacle;

        battle0rFlee();
    }

    public void battle0rFlee()
    {
        System.out.println("(V)ur ya da (K)ac!");
        choose = input.nextLine();

        while( !choose.equals("V") && !choose.equals("K"))
        {
            System.out.println("Gecerli bir komut giriniz!");
            choose = input.nextLine();
        }

        switch( choose )
        {
            case "V":
                for( int i=0;;i++){
                    obstacle.setHealt(obstacle.getHealt()-user.getPower());
                    user.setHealth(user.getHealth()-obstacle.getPower());
                    if (user.getHealth()<=0)
                    {
                        System.out.println("--------------Oldunuz---------------");
                        System.out.println("Devam etmek icin eve isinlanin!!");
                        break;
                    }

                    if (obstacle.getHealt()<=0)
                    {
                        System.out.println("Canavar olduruldu!!");
                        user.setMoney( user.getMoney()+obstacle.getGanimet() );
                       break;
                    }
                }
                break;
            case "K":
                System.out.println("Canavardan kacildi!");
                break;
        }
    }
}
