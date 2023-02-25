import javax.swing.*;
import java.awt.Flowlayout;

public class Form extends JFrame {
  JLabel lName;
  jTextField tfName;
  JButton bSave;

  public Form(){
    lName = new JLabel("Name";)
    add(tfName);

    tfName = new jTextField(20);
    add(tfName);

    bSave = new JButton("Save");

    setLayout(new Flowlayout());
    setSize(800, 600);
    setVisible(true);
  }


  public static void main(String[] args) {
    Form f = new Form();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
