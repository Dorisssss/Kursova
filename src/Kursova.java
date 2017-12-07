import java.awt.*;
        import java.awt.event.*;
        import java.net.MalformedURLException;
        import java.net.URL;
        import javax.swing.*;
        import static sun.applet.AppletResourceLoader.getImage;

public class Kursova  extends JApplet implements MouseListener {
    int x, y;
    int i=0;

    /*Создаём прослушиватель мыши*/
    public void init() {
        addMouseListener(this);
    }
    /*При нажатии мышки расчитываются координаты нажатия*/
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    /* Класс для вставки картинок */
    Image img, img1, img2, img3, img4, img5;
    MediaTracker tr;

    public void paint(Graphics g) {
        tr = new MediaTracker(this);
		/* Выводим рисунок 1 */
        try {
            img = getImage(new URL("https://i.imgur.com/uupQTAM.png"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        g.drawImage(img, 10, 10, this);

        if (x > 30 && x < 90 && y > 60 && y < 120 || x > 200 && x < 260 && y > 60 && y < 120) {
            // Выводим рисунок 3
            try {
                img = getImage(new URL("https://i.imgur.com/iKrtuuN.png"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
        }
        if (x > 45 && x < 82 && y > 171 && y < 206){
            try {
                img2 = getImage(new URL("https://i.imgur.com/lIj6Hnk.png"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img2, 45, 171, this);
        }
        if (x > 94 && x < 131 && y > 171 && y < 206){
            try {
                img3 = getImage(new URL("https://i.imgur.com/lIj6Hnk.png"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img3, 94, 171, this);
        }
        if (x > 155 && x < 192 && y > 171 && y < 206){
            try {
                img4 = getImage(new URL("https://i.imgur.com/lIj6Hnk.png"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img4, 155, 171, this);
        }
        if (x > 205 && x < 242 && y > 171 && y < 206){
            try {
                img5 = getImage(new URL("https://i.imgur.com/lIj6Hnk.png"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img5, 205, 171, this);
        }

    }

}
