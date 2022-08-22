public class Nehir extends BattleLoc
{
    public Nehir( User user)
    {
        super( user );
    }

    @Override
    public void getLocation() {
        System.out.println("Mevcut konum Nehir!!");
        System.out.println("Dusman turu Vampir!!");
        obstacle = new Vampir();
        fight = new SavasKac(user,obstacle);
    }
}
