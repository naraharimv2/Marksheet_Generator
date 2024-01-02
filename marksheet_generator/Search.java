import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Search extends JFrame implements ActionListener {

    private JLabel usnL;
    private JTextField usnT;
    private JTextArea output;
    private JButton search, back;

    Container con = null;
    String empid = "";

    Search() {
        super("Search Record");
        con = getContentPane();
        con.setLayout(null);
        Color lightBlue = new Color(0, 255, 255);
        con.setBackground(lightBlue);

        con.setSize(300, 300);
        con.setLayout(null);
        con.setVisible(true);

        Font font = new Font("Verdana", Font.BOLD, 16);
        Color blue = new Color(30, 144, 255);
        usnL = new JLabel("Enter USN of record to be searched");
        usnL.setBounds(400, 50, 700, 150);
        usnL.setFont(font);
        usnL.setForeground(Color.BLACK);

        usnT = new JTextField(200);
        usnT.setBounds(725, 110, 250, 30);
        usnT.setFont(font);
        usnT.setForeground(Color.BLACK);

        output = new JTextArea();
        output.setBounds(400, 200, 400, 400);
        output.setFont(font);
        output.setForeground(Color.BLACK);
        output.setEditable(false);

        search = new JButton("Search");
        search.setBounds(400, 700, 150, 40);
        search.addActionListener(this);
        search.setFont(font);
        Color pul = new Color(0, 0, 255);
        Border bored = BorderFactory.createLineBorder(pul, 5);
        search.setBorder(bored);
        search.setForeground(Color.BLACK);
        search.setBackground(blue);

        back = new JButton("Go Back");
        back.setBounds(600, 700, 150, 40);
        back.addActionListener(this);
        back.setFont(font);
        back.setBorder(bored);
        back.setForeground(Color.BLACK);
        back.setBackground(blue);

        con.add(usnL);
        con.add(usnT);
        con.add(output);
        con.add(search);
        con.add(back);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String usn = usnT.getText();
            try {
                String name = "", usn1 = "", sem = "", r;
                BufferedReader br = new BufferedReader(new FileReader("student.txt"));
                while ((r = br.readLine()) != null) {
                    String[] result = r.split("\\*");
                    name = result[0];
                    usn1 = result[1];
                    sem = result[2];
                    if (usn1.equals(usn)) {
                        File temp = new File("temp.txt");
                        Boolean createNewFile1 = temp.createNewFile();
                        BufferedWriter pw = new BufferedWriter(new FileWriter(temp));
                        String b = "        NAME\t|USN\t|SEM";
                        String bb = "        " + name + "\t|" + usn1 + "\t|" + sem;
                        pw.write(b);
                        pw.write("\n");
                        pw.write(bb);
                        pw.write("\n");
                        pw.close();
                        br.close();
                        File file = new File("temp.txt");
                        BufferedReader br1 = new BufferedReader(new FileReader(file));
                        output.read(br1, null);
                        br1.close();
                        output.requestFocus();
                        file.delete();
                        return;
                    }
                }
                showMessageDialog(null, "Record not found");
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (ae.getSource() == back) {
            try {
                this.dispose();
                Home h = new Home();
                h.setSize(2300, 790);
                h.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        Search ser = new Search();
        ser.setSize(2300, 790);
        ser.setVisible(true);
    }
}
