public class Magara extends BattleLoc
{
    public Magara( User user)
    {
        super( user );
    }

    @Override
    public void getLocation() {
        System.out.println("Mevcut konum Magara!!");
        System.out.println("Dusman turu Ayi!!");
        obstacle = new Ayı();
        fight = new SavasKac(user,obstacle);
    }
}
