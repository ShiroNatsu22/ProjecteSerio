/**
 * Created by jgarcias on 11/10/16.
 */
public class Circle extends Figure {

    private int width;
    private int heigth;
    private int startAngle;
    private int arcAngle;

    @Override
    void data() {
        super.data();
        System.out.println("Quina amplada vols per al la circumferencia?");
        width=sc.nextInt();
        System.out.println("I altura?");
        heigth=sc.nextInt();
        System.out.println("Quin angle vols que tengui la circumferencia?");
        startAngle=sc.nextInt();
        System.out.println("hola");
        arcAngle=sc.nextInt();

    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getStartAngle() {
        return startAngle;
    }

    public int getArcAngle() {
        return arcAngle;
    }
}
