/**
 * Created by jgarcias on 11/10/16.
 */
public class Square extends Figure {
    private int dimensions;
    private boolean fill;


    @Override
    void data() {
        super.data();

        System.out.println("Quina es la dimensió que vols per al quadrat?");
        dimensions= sc.nextInt();
        System.out.println("El vols relleno?(s|n");
        fill=sc.next().equals("s");


    }

    public int getDimensions() {
        return dimensions;
    }


    public boolean isFill() {
        return fill;
    }
}
