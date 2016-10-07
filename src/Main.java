import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by jgarcias on 06/10/16.
 */
public class Main {




    private static String answer;
    private static int squareDimension;
    private static boolean paintSquare=true;
    private static int posX;
    private static int posY;

    private static Scanner sc = new Scanner(System.in);


    static void menu() throws InvocationTargetException, InterruptedException {


        boolean run = true;

        while (run ) {
            System.out.println("Tria la figura que vols que sigui dibuixada: \n" +
                    "A.Cadena de text \n" +
                    "B.Punt \n" +
                    "C.Línia \n" +
                    "D.Cercle \n" +
                    "E.Quadrat \n" +
                    "F.Retangle \n" +
                    "G.Polígon \n" +
                    "H.Historial \n" +
                    "I.Sortir \n");

            answer = sc.nextLine();

            if (answer.equals("A")) {

                text();
            }
            else if (answer.equals("B")) {

            }
            else if (answer.equals("C")) {

            }
            else if (answer.equals("D")) {

            }
            else if (answer.equals("E")) {

                square();

            }
            else if (answer.equals("F")) {

            }
            else if (answer.equals("G")) {

            }
            else if (answer.equals("H")) {

            }
            else if (answer.equals("I")) {
                run=false;
            } else {
                System.out.println("Introdueix una opció valida");

            }
        }


    }

    static void functions() throws InvocationTargetException, InterruptedException {
        EventQueue.invokeAndWait(new Runnable() {
            public void run() {
                try {
                    textString frame = new textString();
                    frame.setSquareDimension(squareDimension);
                    frame.setPosX(posX);
                    frame.setPosY(posY);
                    frame.setText(answer);
                    if (paintSquare) {
                        frame.setPaintSquare(paintSquare);
                    }
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    static void text() throws InvocationTargetException, InterruptedException {

        System.out.println("Introdueix el text que vols mostrar:");
        answer=sc.nextLine();
        System.out.println("A quina posicio de x el vols?");
        posX=sc.nextInt();
        System.out.println("A quina posicio de y el vols?");
        posY=sc.nextInt();

        functions();
    }
    static void square() throws InvocationTargetException, InterruptedException {
        System.out.println("De quina dimesio vols el quadrat?:");
        squareDimension=sc.nextInt();
        System.out.println("El vols relleno? :) (Si/No)");
        paintSquare=sc.next().equals("Si");

        System.out.println("A quina posicio de x el vols?");
        posX=sc.nextInt();
        System.out.println("A quina posicio de y el vols?");
        posY=sc.nextInt();

        functions();
    }


    public static void main(String[] args) throws InvocationTargetException, InterruptedException {

    menu();
    }

}
