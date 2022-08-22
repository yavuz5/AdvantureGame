import java.util.Scanner;

public abstract class Location
{
    Scanner input = new Scanner(System.in);
    public User user;
    public Location( User user )
    {
        this.user = user;
    }
    public abstract void getLocation();
}
