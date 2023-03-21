import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

public class bigboob implements KeyListener
{
    @Override
    public void keyTyped(KeyEvent e)
    {

    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.isActionKey())
            System.exit(0);
        System.out.println("The key Pressed was: " + e.getKeyChar());
        if(e.getKeyCode()== KeyEvent.VK_ENTER)
            try {
                Robot rb = new Robot();
                rb.mouseMove(343, 331);// 좌표 이동
                rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 왼쪽누르기
                rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);// 떼기
            }catch(Exception exception) {
                System.out.println("오류");}
    }
    @Override
    public void keyReleased(KeyEvent e)
    {
        System.out.println("The key Released was: " + e.getKeyChar());
    }
    public static void main(String[] args)
    {
        //Setting the Frame and Labels
        Frame f = new Frame("키보드 인식");
        f.setLayout(new FlowLayout());
        f.setSize(250, 100);
        Label l = new Label();
        l.setText("There are not any problems!!!");
        f.add(l);
        f.setVisible(true);

        //Creating and adding the key listener
        bigboob k = new bigboob();
        f.addKeyListener(k);
    }
}