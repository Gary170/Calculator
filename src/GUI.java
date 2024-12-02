import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GUI{
    private static JFrame jFrame;
    private static JLabel inputTextBox1;
    private static JLabel inputTextBox2;
    private static JLabel inputTextBox3;
    private static int currentInputBox = 0;
    public static ArrayList jButtons = new ArrayList();
    public GUI() {
        //Main Frame
        jFrame = new JFrame("Calculator");
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setSize(1280, 720);

        //Text Boxes
        inputTextBox1 = new JLabel();
        inputTextBox1.setText("Test");
        inputTextBox1.setVisible(true);
        inputTextBox1.setBounds(500,0,200,200);
        jFrame.add(inputTextBox1);

        inputTextBox2 = new JLabel();
        inputTextBox2.setText("Test");
        inputTextBox2.setVisible(true);
        inputTextBox2.setBounds(600,0,200,200);
        jFrame.add(inputTextBox2);

        inputTextBox3 = new JLabel();
        inputTextBox3.setText("Test");
        inputTextBox3.setVisible(true);
        inputTextBox3.setBounds(700,0,200,200);
        jFrame.add(inputTextBox3);




        //Number Buttons
        createJButton(100,100,100,100,"1",1);
        createJButton(200,100,100,100,"2",2);
        createJButton(300,100,100,100,"3",3);
        createJButton(100,200,100,100,"4",4);
        createJButton(200,200,100,100,"5",5);
        createJButton(300,200,100,100,"6",6);
        createJButton(100,300,100,100,"7",7);
        createJButton(200,300,100,100,"8",8);
        createJButton(300,300,100,100,"9",9);
        createJButton(200,400,100,100,"0",0);

        for (Object buttonObj : jButtons) {
            //Adds action Listener
        }

    }

    public static void createJButton(int x, int y, int width, int height, String buttonText, int tag){
        JButton jButton = new JButton(+buttonText);
        jFrame.add(jButton);
        jButton.setVisible(true);
        jButton.setBounds(x,y,width,height);

        jButtons.add(jButton);
        System.out.println(jButtons);


    }


}
