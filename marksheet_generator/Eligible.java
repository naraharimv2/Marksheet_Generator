import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.io.*;
import java.time.LocalDate;
import static javax.swing.JOptionPane.showMessageDialog;

public class Eligible extends JFrame implements ActionListener {

    private JLabel heading, usnL;
    private JTextField usnT;
    private JTextArea output;
    private JButton display, back;

    Container con = null;

    Eligible() {
        super("MARKSHEET");
        con = getContentPane();
        con.setLayout(null);
        Color lightBlue = new Color(0, 255, 255);
        con.setBackground(lightBlue);

        con.setSize(300, 300);
        con.setLayout(null);
        con.setVisible(true);

        Font font = new Font("Verdana", Font.BOLD, 16);
        heading = new JLabel("STUDENT MARKSHEET");
        heading.setBounds(550, 20, 700, 20);
        heading.setFont(font);
        heading.setForeground(Color.BLACK);

        usnL = new JLabel("Enter USN of record to be searched");
        usnL.setBounds(400, 0, 700, 150);
        usnL.setFont(font);
        usnL.setForeground(Color.BLACK);

        usnT = new JTextField(200);
        usnT.setBounds(725, 60, 250, 30);
        usnT.setFont(font);
        usnT.setForeground(Color.BLACK);

        output = new JTextArea();
        output.setBounds(100, 100, 1350, 550);
        output.setFont(font);
        output.setForeground(Color.BLACK);
        output.setEditable(false);

        display = new JButton("GENERATE");
        display.setBounds(400, 700, 150, 40);
        display.addActionListener(this);
        display.setFont(font);
        Color pul = new Color(0, 0, 255);
        Border bored = BorderFactory.createLineBorder(pul, 5);
        display.setBorder(bored);
        display.setForeground(Color.BLACK);
        display.setBackground(Color.WHITE);

        back = new JButton("Go Back");
        back.setBounds(600, 700, 150, 40);
        back.addActionListener(this);
        back.setFont(font);
        back.setBorder(bored);
        back.setForeground(Color.BLACK);

        con.add(heading);
        con.add(usnL);
        con.add(usnT);
        con.add(output);
        con.add(display);
        con.add(back);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == display) {
            try {
                String rollno1 = usnT.getText();
                LocalDate date = LocalDate.now();
                String name = "", rollno = "", sem = "", fa = "", ma = "", s;
                String[] I = new String[5];
                String E[] = new String[5];
                String g[] = new String[5];
                String grade[] = new String[5];
                BufferedReader br = new BufferedReader(new FileReader("student.txt"));
                while ((s = br.readLine()) != null) {
                    String[] result = s.split("\\*");
                    name = result[0];
                    rollno = result[1];
                    sem = result[2];
                    fa = result[3];
                    ma = result[4];
                    I[0] = result[5];
                    E[0] = result[6];
                    g[0] = result[7];
                    grade[0] = result[8];
                    I[1] = result[9];
                    E[1] = result[10];
                    g[1] = result[11];
                    grade[1] = result[12];
                    I[2] = result[13];
                    E[2] = result[14];
                    g[2] = result[15];
                    grade[2] = result[16];
                    I[3] = result[17];
                    E[3] = result[18];
                    g[3] = result[19];
                    grade[3] = result[20];
                    I[4] = result[21];
                    E[4] = result[22];
                    g[4] = result[23];
                    grade[4] = result[24];

                    if (rollno.equals(rollno1)) {
                        File temp = new File("temp.txt");
                        Boolean createNewFile1 = temp.createNewFile();
                        BufferedWriter pw = new BufferedWriter(new FileWriter(temp));
                        pw.write(
                                "\n    ------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        pw.write("\n");
                        pw.write(
                                "\t\tB M S    I N S T I T U T E    O F    T E C H N O L O G Y    A N D    M A N A G E M E  N T\n\t\t\t\tB A N G L O R E\n");
                        pw.write("\n");
                        // pw.write(
                        // "\n\n\n NAME:" + name + "\t\t\t\t " + "USN:" + rollno + "\t\t\t\t "
                        // + "SEM:" + sem
                        // + "\n FATHER NAME:" + fa
                        // + "\t\t\t\t\t" + "MOTHER NAME:" + ma + "\n");
                        pw.write(
                                "\n\n\n        NAME: " + name + "\t\t\t\t    " + "USN: " + rollno + "\t\t\t\t    "
                                        + "SEM: " + sem + "\n");
                        pw.write("\n");
                        pw.write(
                                "\n        SL.NO\t        SUBJECTS\t        INTERNAL SCORE\t\t    EXTERNAL SCORE\t    TOTAL\t    GRADE");
                        pw.write("\n");
                        pw.write("\t\t\t         MAX      SCORED\t\t      MAX      SCORED\n");
                        pw.write("\n");
                        pw.write(
                                "        1.\t        18MAT41\t\t           40        " + I[0] + "\t\t       60         "
                                        + E[0]
                                        + "\t        "
                                        + g[0] + "\t     "
                                        + grade[0]);
                        pw.write("\n");
                        pw.write(
                                "        2.\t        18CS42\t\t           40        " + I[1] + "\t\t       60         "
                                        + E[1] + "\t        " + g[1]
                                        + "\t     "
                                        + grade[1]);
                        pw.write("\n");
                        pw.write(
                                "        3.\t        18CS43\t\t           40        " + I[2] + "\t\t       60         "
                                        + E[2] + "\t        " + g[2]
                                        + "\t     "
                                        + grade[2]);
                        pw.write("\n");
                        pw.write(
                                "        4.\t        18CS44\t\t           40        " + I[3]
                                        + "\t\t       60         " + E[3] + "\t        " + g[3]
                                        + "\t     "
                                        + grade[3]);
                        pw.write("\n");
                        pw.write(
                                "        5.\t        18CS45\t\t           40        " + I[4] + "\t\t       60         "
                                        + E[4] + "\t        " + g[4]
                                        + "\t     "
                                        + grade[4]);
                        pw.write("\n");
                        pw.write(
                                "\n\n\n        Date: " + date + "\t\t\t\t\t\t\t\t" + "Sign"
                                        + "\n        Place: Banglore"
                                        + "\t\t\t\t\t\t\t\t"
                                        + "$$$$");
                        pw.write("\n");
                        pw.write(
                                "    ------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        pw.flush();
                        pw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(temp));
                        output.read(br1, null);
                        br1.close();
                        output.requestFocus();
                        temp.delete();
                        return;
                    }
                }
                showMessageDialog(null, "Record not found");
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
                // System.out.println("error is" +e);
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
        Eligible eli = new Eligible();
        eli.setSize(2300, 790);
        eli.setVisible(true);
    }

}