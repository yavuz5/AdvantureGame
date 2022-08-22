public class Home extends NormalLoc
{
    public Home( User user )
    {
        super( user );
    }

    public void getLocation()
    {
        user.setHealth( user.getrHealt() );
        System.out.println("Can fullendi!!");
    }
}
