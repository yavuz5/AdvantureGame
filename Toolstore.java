public class Toolstore extends NormalLoc {
    public Toolstore(User user) {
        super(user);
    }

    public void getLocation() {
        System.out.println("Markete hosgeldiniz!");
        System.out.println("1 - Silahlar");
        System.out.println("2 - Zırhlar");
        System.out.println("3 - Cikis");

        String choose = input.nextLine();
        while (!choose.matches("\\d")) {
            System.out.println("Gecersiz bir deger girdiniz tekrar deneyin.");
            choose = input.nextLine();
        }


        switch (choose) {
            case "1":
                System.out.println(Sword.class.toString());

                break;
            case "2":
                System.out.println("Zirhlar");
                break;
            case "3":
                System.out.println("Cikis  yapiliyor!!");
                break;
        }


    }

    public boolean compareToPrice(int price) {
        int money = user.getMoney();
        if (price > money) {
            return false;
        }
        return true;
    }
}
