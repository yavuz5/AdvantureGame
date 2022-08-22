import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Game
{
    Scanner scan = new Scanner(System.in);
    User user ;
    Location loc;
    public void login()
    {
        System.out.println("Text tabanli oyunumuza hosgeldiniz!!");
        user = new User();
        user.SelectCharacter();
    }

    public void start()
    {
        int choose;
        System.out.println("Guvenli ev = 1");
        System.out.println("Tool store = 2");
        System.out.println("Orman = 3");
        System.out.println("Nehir = 4");
        System.out.println("Magara = 5");
        System.out.println("Cikis icin = 6");
        System.out.println("Karakter degerleri icin = 7");
        choose = scan.nextInt();

        while( choose > 6 || choose <0 )
        {
            System.out.println("Gecerli bir konum giriniz!!");
            choose = scan.nextInt();
        }

        while(true)
        {
            switch( choose )
            {
                case 1:
                    loc = new Home( user );
                    loc.getLocation();      //Override edildi upcasting islemide yapılabilir.
                    break;
                case 2:
                    loc = new Toolstore( user );
                    loc.getLocation();      //Override edildi upcasting islemide yapılabilir.
                    break;
                case 3:
                    loc = new Orman( user );
                    loc.getLocation();      //Override edildi upcasting islemide yapılabilir.
                    break;
                case 4:
                    loc = new Nehir( user );       //Override edildi upcasting islemide yapılabilir.
                    loc.getLocation();
                    break;
                case 5:
                    loc = new Magara( user );     //Override edildi upcasting islemide yapılabilir.
                    loc.getLocation();
                    break;
                case 6:
                    choose = -1;
                case 7:
                    System.out.println(user.toString());
                    break;
            }
            if (choose == -1)
            {
                System.out.println("Oyun sonlaniyor!!");
                System.out.println("Gorusuruz");
                break;
            }
            choose = scan.nextInt();
        }
    }
}
