        import java.awt.*;
        import java.awt.event.*;
        import java.net.MalformedURLException;
        import java.net.URL;
        import javax.swing.*;
        import static sun.applet.AppletResourceLoader.getImage;

public class Kursova extends JApplet implements MouseListener {
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

    public void mouseExited(MouseEvent e)  {
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
            img = getImage(new URL("https://i.imgur.com/orM0ZB6.jpg"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        g.drawImage(img, 10, 10, this);

        if (x > 265 && x < 300 && y > 155 && y < 205 || x > 475 && x < 505 && y > 155 && y < 205) {
            // Выводим рисунок
            try {
                img = getImage(new URL("https://i.imgur.com/iGSwrBq.jpg"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
            try {
                img = getImage(new URL("https://i.imgur.com/qviHPzl.jpg"));
                Thread.sleep(2000);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
        }
        if (x > 260 && x < 330 && y > 90 && y < 125 || x > 465 && x < 545 && y > 90 && y < 125) {
            try {
                img = getImage(new URL("https://i.imgur.com/yeec6I3.jpg"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
        }
        if (x > 260 && x < 310 && y > 290 && y < 335){
            try {
                img = getImage(new URL("https://i.imgur.com/E0qvBCn.jpg"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10 this);
        }
        if (x > 325 && x < 375 && y > 290 && y < 335){
            try {
                img = getImage(new URL("https://i.imgur.com/lCgqmt3.jpg"));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            g.drawImage(img, 10, 10, this);
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
