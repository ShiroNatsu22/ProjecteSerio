import java.util.Scanner;

/**
 * Created by jgarcias on 11/10/16.
 */
public class Figure {
    protected Scanner sc = new Scanner(System.in);
    private int posX;
    private int posY;
    private String color;

    void data() {
        System.out.println("A quina posicio el vols?:(En x i en y)");
        posX = sc.nextInt();
        posY = sc.nextInt();

        System.out.println("De quin color vols que estigui?");
        color = sc.next();

    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String getColor() {
        return color;
    }
}
