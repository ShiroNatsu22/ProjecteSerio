/**
 * Created by jgarcias on 11/10/16.
 */
public class Rectangle extends Figure{

    private int width;
    private int heigth;



    @Override
    void data() {
        super.data();
        System.out.println("Quina amplada vols per al rectangle?");
        width=sc.nextInt();
        System.out.println("I altura?");
        heigth=sc.nextInt();
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }
}
