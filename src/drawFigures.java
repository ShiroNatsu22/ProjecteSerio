/**
 * Created by jgarcias on 11/10/16.
 */

    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.EventQueue;
    import java.awt.Graphics;

    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.border.EmptyBorder;


    public class drawFigures extends JFrame {

        private JPanel contentPane;

        /**
         * Launch the application.
         */




        /**
         * Create the frame.
         */
        public drawFigures() {
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            contentPane.setLayout(new BorderLayout(0, 0));
            setContentPane(contentPane);
            setBounds(0,0,800,600);
        }


        public void paint (Graphics g)
        {
            super.paint(g);

            if (Main.figure instanceof Square){
                Square square = (Square) Main.figure;
                g.setColor(Color.red);
               // g.fillRect(square.getPosX(),square.getPosY(),square.getDimensions(),square.getDimensions());
                g.drawRect(square.getPosX(),square.getPosY(),square.getDimensions(),square.getDimensions());
            }
            else if (Main.figure instanceof Text) {
                Text text = (Text) Main.figure;

                g.drawString(text.getText(),text.getPosX(), text.getPosY());
            }

            else if (Main.figure instanceof Rectangle){
                Rectangle rectangle = (Rectangle) Main.figure;
                g.setColor(Color.red);
                // g.fillRect(square.getPosX(),square.getPosY(),square.getDimensions(),square.getDimensions());
                g.drawRect(rectangle.getPosX(),rectangle.getPosY(),rectangle.getWidth(),rectangle.getHeigth());

            }else if(Main.figure instanceof Circle){
                Circle circle =(Circle) Main.figure;
                g.setColor(Color.red);
                g.drawArc(circle.getPosX(),circle.getPosY(),circle.getWidth(),circle.getHeigth(),circle.getStartAngle(),
                circle.getArcAngle());
            }
        }


        }



