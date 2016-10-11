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
        // per a que el next agafi tot, ja que si troba un espai en blanc, en e text mostrar la 1a paraula
        sc.useDelimiter(System.getProperty("line.separator"));

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

    public String getColor(String red) {
        return color;
    }
}
