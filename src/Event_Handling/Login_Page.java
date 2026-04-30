import java.awt.*;
import java.awt.event.*;

class MyLoginhandler implements ActionListener {
    TextField t1, t2;
    Label l;

    MyLoginhandler(TextField t1, TextField t2, Label l) {
        this.t1 = t1;
        this.t2 = t2;
        this.l = l;
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("Login")) {
            if (t1.getText().equals("Admin") && t2.getText().equals("Admin123")) {
                l.setText("Login Successful");
            } else {
                l.setText("Invalid Username or Password");
            }
        }
    }
}

class Login {
    public static void main(String[] args) {
        Frame f = new Frame("login Page");
        f.setSize(500, 600);
        f.setLayout(null);  

        Button b1 = new Button("Username");
        b1.setBounds(100, 100, 100, 50);
        f.add(b1);

        Button b2 = new Button("Password");
        b2.setBounds(100, 200, 100, 50);
        f.add(b2);

        TextField t1 = new TextField("");
        t1.setBounds(210, 100, 100, 50);
        f.add(t1);

        TextField t2 = new TextField("");
        t2.setBounds(210, 200, 100, 50);
        t2.setEchoChar('*'); 
        f.add(t2);

        Label l = new Label();
        l.setBounds(150, 400, 200, 50);
        f.add(l);

        Button b3 = new Button("Login");
        b3.setBounds(165, 300, 100, 50);
        f.add(b3);

      
        MyLoginhandler handler = new MyLoginhandler(t1, t2, l);
        b3.addActionListener(handler); 

        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
