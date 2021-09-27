public class pegasus implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public pegasus() {this.maxSpeed = 10; }

    @Override
    public String sound() {
        return "Majestic Yelp!";
    }

    @Override
    public void upgradeSpeed() {

        this.maxSpeed++;

    }

    @Override
    public void downgradeSpeed() {

        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
