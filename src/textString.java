import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/**
 * Created by jgarcias on 06/10/16.
 */
    public class textString extends JFrame {
        private String color="yellow";
        private JPanel contentPane;
        private String text="";
        private int squareDimension;
        private boolean paintSquare;
        private int posX;
        private int posY;
    public void setPaintSquare(boolean paintSquare) {
        this.paintSquare = paintSquare;
    }



    public void setText(String text) {
        this.text = text;
    }



    public void setSquareDimension(int squareDimension) {
        this.squareDimension = squareDimension;
    }



        /**
         * Launch the application.
         */
        public static void main(String[] args) {

        }

        /**
         * Create the frame.
         */
        public textString() {
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            contentPane.setLayout(new BorderLayout(0, 0));
            setContentPane(contentPane);
            setBounds(0, 0, 800, 600);
        }

//pintar text
        public void paint (Graphics g) {


            super.paint(g);
            g.setColor(Color.red);
            g.drawString(text, posX, posY);
            g.drawRect(posX, posY, squareDimension, squareDimension);
            if (paintSquare) {
                g.fillRect(posX, posY, squareDimension, squareDimension);
            }
        }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}

