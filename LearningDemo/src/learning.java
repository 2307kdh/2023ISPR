import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class learning extends JFrame{
    //창 만드는 코드
    public learning() {
        Font f = new Font("나눔고딕",Font.PLAIN,24);
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("무슨 과목 ㅋ");
        setLayout(new FlowLayout());
        JLabel problem = new JLabel("문제는 무엇인가");
        problem.setFont(f);
        this.add(problem);
        JButton button = new JButton("입력");
        button.setFont(f);
        this.add(button);
        setVisible(true);

    }

    public static void main(String[] args) {
        new learning();
    }
}
