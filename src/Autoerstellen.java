import com.company.Vehicle;

public class Autoerstellen {

    public static void main(String[] args) {
          Vehicle eins = new Vehicle(60, 800, "golf");
        Vehicle zwei = new Vehicle(120, 1200, "bmw");

        System.out.println( "Das auto " +eins.getName()+ " wiegt " +eins.getWeight()+" kg und hat" );
        eins.berechnePower();

        System.out.println( "Das Auto " +zwei.getName()+ " wiegt "+zwei.getWeight()+ "kg und hat" );
        zwei.berechnePower();
    }
}
