import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Rules extends JPanel implements KeyListener, ActionListener {
    private int score = 0;
    private boolean playButton = false;

    //game config
    private Timer timePlaying;
    private int totalBlock = 30;
    private int ballDelay = 6;
    private int playerPos = 330;

    //ball config
    private int ballPosX = 120;
    private int ballPosY = 350;
    private int ballDirectionX = -1;
    private int ballDirectionY = -2;

    //constructor
    public Rules() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
//        timePlaying = new Timer(ballDelay, this);
//        timePlaying.start();
    }

    public void paint(Graphics grp) {
        //create background
        grp.setColor(Color.decode("#313552"));
        grp.fillRect(1,1,792,692); //rectangle

        //create borders
        grp.setColor(Color.decode("#B8405E"));
        grp.fillRect(0,0,3,692); //left border
        grp.fillRect(0,0,792,3); // top border
        grp.fillRect(781,0,3,692); //right border

        //create board
        grp.setColor(Color.decode("#2EB086"));
        grp.fillRoundRect(playerPos, 630,120,10,10,10);

        //create ball
        grp.setColor(Color.decode("#EEE6CE"));
        grp.fillRoundRect(ballPosX,ballPosY,20,20, 180,180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerPos >= 700) {
                playerPos = 700;
            } else {
                moveToRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerPos >= 10) {
                playerPos = 10;
            } else {
                moveToLeft();
            }
        }
    }

   public void moveToRight() {
        playButton = true;
        playerPos += 20;
   }

    public void moveToLeft() {
        playButton = true;
        playerPos -= 20;
    }
}
