/**
 * Created by jgarcias on 11/10/16.
 */
public class Circle extends Figure {

    private int width;
    private int heigth;
    private int startAngle;
    private int arcAngle;
    private boolean fill;

    @Override
    void data() {
        super.data();
        System.out.println("Quina amplada vols per al la circumferencia?");
        width=sc.nextInt();
        System.out.println("I altura?");
        heigth=sc.nextInt();
        System.out.println("El vols relleno?(s|n)");
        fill=sc.next().equals("s");

    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }



    public boolean isFill() {
        return fill;
    }
}
