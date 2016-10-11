import java.awt.*;
import java.util.Scanner;
import java.util.List;

/**
 * Created by jgarcias on 11/10/16.
 */
public class Main {


    private static String answer = "";
    private static Scanner sc = new Scanner(System.in);
    public static Figure figure;

    static void menu() {


        System.out.println("A.Text \n" + "B.Punt \n" + "C.Línia \n" + "D.Cercle \n" + "E.Quadrat \n"
                + "F.Rectangle \n" + "G.Poligon \n" + "H.Historic de figures \n" + "I.Sortir \n");

        System.out.println("Que vols fer?:");
        answer = sc.nextLine();

        if (answer.equals("A")) {
            draw();

        } else if (answer.equals("B")) {

            draw();

        } else if (answer.equals("C")) {
            draw();

        } else if (answer.equals("D")) {
            draw();

        } else if (answer.equals("E")) {
            figure=new Square();
            figure.data();
            draw();

        } else if (answer.equals("F")) {
            draw();

        } else if (answer.equals("G")) {
            draw();

        } else if (answer.equals("H")) {
            draw();
        }else if(answer.equals("I")){
            return;
        }
        else {
            System.out.println("Introdueix una opcio valida");
            menu();
        }

    }

    static void draw() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    drawFigures frame = new drawFigures();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



    public static void main(String[] args) {
        menu();
    }
}
