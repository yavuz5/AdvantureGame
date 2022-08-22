public class Orman extends BattleLoc
{
    public Orman( User user )
    {
        super( user );
    }

    @Override
    public void getLocation()
    {
        System.out.println("Mevcut konum orman!!");
        System.out.println("Dusman turu Zombie!!");
        obstacle = new Zombi();
        fight = new SavasKac(user,obstacle);
    }
}
