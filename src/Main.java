import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * Created by jgarcias on 11/10/16.
 */
public class Main {


    protected static String answer = "";
    private static Scanner sc = new Scanner(System.in);
    public static Figure figure;
    protected static List<Figure> f =new ArrayList<Figure>();

    static void menu() {


        System.out.println("A.Text \n" + "B.Punt \n" + "C.Línia \n" + "D.Cercle \n" + "E.Quadrat \n"
                + "F.Rectangle \n" + "G.Poligon \n" + "H.Historic de figures \n" + "I.Sortir \n");

        System.out.println("Que vols fer?:");
        answer = sc.nextLine();

        if (answer.equals("A")) {
            figure=new Text();
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("B")) {
            figure=new Dot();
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("C")) {
            figure=new Line();
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("D")) {
            figure=new Circle();
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("E")) {
            figure=new Square();
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("F")) {
            figure=new Rectangle();
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("G")) {
            figure=new Poligon();
            figure.data();
            f.add(figure);
            draw();

        } else if (answer.equals("H")) {

            draw();
        }else if(answer.equals("I")){
            return;
        }
        else {
            System.out.println("Introdueix una opcio valida");

        }
        menu();
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
