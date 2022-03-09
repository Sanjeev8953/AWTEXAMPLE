import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleCalculator implements ActionListener {
    Frame frame = new Frame("Simple Calculator");
    Label lebel1 = new Label("first number");
    Label lebel2 = new Label("second nuber");
    Label lebel3 = new Label("result");

    TextField textField1 = new TextField();
    TextField textField2 = new TextField();
    TextField textField3 = new TextField();

    Button button1 =new Button("Add");
    Button button2 =new Button("SUb");
    Button button3 =new Button("mul");
    Button button4 =new Button("div");
    Button button5 = new Button("cancel");


    SimpleCalculator(){
        lebel1.setBounds(50,100,100,20);
        lebel2.setBounds(50,140,100,20);
        lebel3.setBounds(50,180,100,20);

        textField1.setBounds(200,100,100,20);
        textField2.setBounds(200,140,100,20);
        textField3.setBounds(200,180,100,20);

        button1.setBounds(50,250,50,20);
        button2.setBounds(110,250,50,20);
        button3.setBounds(170,250,50,20);
        button4.setBounds(230,250,50,20);
        button5.setBounds(290,250,50,20);

        frame.add(lebel1);
        frame.add(lebel2);
        frame.add(lebel3);

        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);



        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400,350);
       // frame.setBackground(Color.black);
        frame.setLocation(500,200);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }



    public static void main(String[] args) {
        SimpleCalculator simple = new SimpleCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(textField1.getText());
        int n2= Integer.parseInt(textField2.getText());

        if(e.getSource()==button1){
            textField3.setText(String.valueOf(n1+n2));
        }
        if(e.getSource()==button2)
            textField3.setText(String.valueOf(n1-n2));
        if(e.getSource()==button3)
            textField3.setText(String.valueOf(n1*n2));
        if(e.getSource()==button4)
            textField3.setText(String.valueOf(n1/n2));
        if(e.getSource()==button5)
            System.exit(0);

    }
}
