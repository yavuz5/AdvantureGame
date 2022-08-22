public class Obstacle
{
        private int ID;
        private int healt;
        private int power;
        private int ganimet;

        public Obstacle(int id, int healt,int power ,int ganimet)
        {
            this.ID = id;
            this.setHealt( healt );
            this.setPower( power );
            this.setGanimet( ganimet );
            System.out.println( toString() );     //Karakter proporties print.
        }
        public String toString()
        {
            return String.format("Healt = %d\nPower = %d",getHealt(),getPower());
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGanimet() {
        return ganimet;
    }

    public void setGanimet(int ganimet) {
        this.ganimet = ganimet;
    }
}
