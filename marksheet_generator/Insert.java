import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Insert extends JFrame implements ActionListener {
    private JLabel insertHeading, nameL, usnL, semL, motherNameL, fatherNameL, IMAT41L, ICS42L, ICS43L, ICS44L, ICS45L,
            EMAT41L, ECS42L, ECS43L, ECS44L, ECS45L,
            InternalL, ExternalL;
    private JTextField nameT, usnT, semT, motherNameT, fatherNameT, IMAT41T, ICS42T, ICS43T, ICS44T, ICS45T, EMAT41T,
            ECS42T, ECS43T, ECS44T, ECS45T;
    private JButton insert, back;

    Container con = null;
    String name = "", empid1 = "", yoe = "", branch = "", salary = "", nob = "", company = "", ctc = "", comments = "";

    Insert() {
        super("Insert Record");
        con = getContentPane();
        con.setLayout(null);
        Color lightBlue = new Color(0, 255, 255);
        con.setBackground(lightBlue);

        con.setSize(300, 300);
        con.setLayout(null);
        con.setVisible(true);

        insertHeading = new JLabel("INSERT MARKS DETAILS");
        insertHeading.setBounds(550, -50, 400, 150);

        con.add(insertHeading);
        Color blue = new Color(30, 144, 255);
        Font font = new Font("Verdana", Font.BOLD, 16);
        insertHeading.setFont(font);
        insertHeading.setForeground(Color.WHITE);

        nameL = new JLabel("Enter Name:");
        nameL.setBounds(350, 70, 350, 40);
        nameL.setFont(font);
        nameL.setForeground(Color.WHITE);
        nameT = new JTextField(200);
        nameT.setBounds(725, 70, 350, 30);
        nameT.setFont(font);
        nameT.setForeground(Color.BLACK);

        usnL = new JLabel("Enter Student USN:");
        usnL.setBounds(350, 130, 350, 40);
        usnL.setFont(font);
        usnL.setForeground(Color.WHITE);
        usnT = new JTextField(200);
        usnT.setBounds(725, 130, 350, 30);
        usnT.setFont(font);
        usnT.setForeground(Color.BLACK);

        semL = new JLabel("Enter Sem:");
        semL.setBounds(350, 190, 350, 40);
        semL.setFont(font);
        semL.setForeground(Color.WHITE);
        semT = new JTextField(200);
        semT.setBounds(725, 190, 250, 30);
        semT.setFont(font);
        semT.setForeground(Color.BLACK);

        fatherNameL = new JLabel("Enter Father Name:");
        fatherNameL.setBounds(350, 310, 350, 40);
        fatherNameL.setFont(font);
        fatherNameL.setForeground(Color.WHITE);
        fatherNameT = new JTextField(200);
        fatherNameT.setBounds(725, 310, 250, 30);
        fatherNameT.setFont(font);
        fatherNameT.setForeground(Color.BLACK);

        motherNameL = new JLabel("Enter Mother Name:");
        motherNameL.setBounds(350, 250, 150, 40);
        motherNameL.setFont(font);
        motherNameL.setForeground(Color.WHITE);
        motherNameT = new JTextField(200);
        motherNameT.setBounds(725, 250, 250, 30);
        motherNameT.setFont(font);
        motherNameT.setForeground(Color.BLACK);

        InternalL = new JLabel("Enter Internal Marks:");
        InternalL.setBounds(250, 370, 300, 40);
        InternalL.setFont(font);
        InternalL.setForeground(Color.WHITE);

        ExternalL = new JLabel("Enter External Marks:");
        ExternalL.setBounds(950, 370, 300, 40);
        ExternalL.setFont(font);
        ExternalL.setForeground(Color.WHITE);

        IMAT41L = new JLabel("18MAT41:");
        IMAT41L.setBounds(150, 430, 300, 40);
        IMAT41L.setFont(font);
        IMAT41L.setForeground(Color.WHITE);
        IMAT41T = new JTextField(200);
        IMAT41T.setBounds(425, 430, 250, 30);
        IMAT41T.setFont(font);
        IMAT41T.setForeground(Color.BLACK);

        ICS42L = new JLabel("18CS42:");
        ICS42L.setBounds(150, 490, 300, 40);
        ICS42L.setFont(font);
        ICS42L.setForeground(Color.WHITE);
        ICS42T = new JTextField(200);
        ICS42T.setBounds(425, 490, 250, 30);
        ICS42T.setFont(font);
        ICS42T.setForeground(Color.BLACK);

        ICS43L = new JLabel("18CS43:");
        ICS43L.setBounds(150, 550, 300, 40);
        ICS43L.setFont(font);
        ICS43L.setForeground(Color.WHITE);
        ICS43T = new JTextField(200);
        ICS43T.setBounds(425, 550, 250, 30);
        ICS43T.setFont(font);
        ICS43T.setForeground(Color.BLACK);

        ICS44L = new JLabel("18CS44:");
        ICS44L.setBounds(150, 610, 300, 40);
        ICS44L.setFont(font);
        ICS44L.setForeground(Color.WHITE);
        ICS44T = new JTextField(200);
        ICS44T.setBounds(425, 610, 250, 30);
        ICS44T.setFont(font);
        ICS44T.setForeground(Color.BLACK);

        ICS45L = new JLabel("18CS45:");
        ICS45L.setBounds(150, 670, 300, 40);
        ICS45L.setFont(font);
        ICS45L.setForeground(Color.WHITE);
        ICS45T = new JTextField(200);
        ICS45T.setBounds(425, 670, 250, 30);
        ICS45T.setFont(font);
        ICS45T.setForeground(Color.BLACK);

        EMAT41L = new JLabel("18MAT41:");
        EMAT41L.setBounds(850, 430, 300, 40);
        EMAT41L.setFont(font);
        EMAT41L.setForeground(Color.WHITE);
        EMAT41T = new JTextField(200);
        EMAT41T.setBounds(1125, 430, 250, 30);
        EMAT41T.setFont(font);
        EMAT41T.setForeground(Color.BLACK);

        ECS42L = new JLabel("18CS42:");
        ECS42L.setBounds(850, 490, 300, 40);
        ECS42L.setFont(font);
        ECS42L.setForeground(Color.WHITE);
        ECS42T = new JTextField(200);
        ECS42T.setBounds(1125, 490, 250, 30);
        ECS42T.setFont(font);
        ECS42T.setForeground(Color.BLACK);

        ECS43L = new JLabel("18CS43:");
        ECS43L.setBounds(850, 550, 300, 40);
        ECS43L.setFont(font);
        ECS43L.setForeground(Color.WHITE);
        ECS43T = new JTextField(200);
        ECS43T.setBounds(1125, 550, 250, 30);
        ECS43T.setFont(font);
        ECS43T.setForeground(Color.BLACK);

        ECS44L = new JLabel("18CS44:");
        ECS44L.setBounds(850, 610, 300, 40);
        ECS44L.setFont(font);
        ECS44L.setForeground(Color.WHITE);
        ECS44T = new JTextField(200);
        ECS44T.setBounds(1125, 610, 250, 30);
        ECS44T.setFont(font);
        ECS44T.setForeground(Color.BLACK);

        ECS45L = new JLabel("18CS45:");
        ECS45L.setBounds(850, 670, 300, 40);
        ECS45L.setFont(font);
        ECS45L.setForeground(Color.WHITE);
        ECS45T = new JTextField(200);
        ECS45T.setBounds(1125, 670, 250, 30);
        ECS45T.setFont(font);
        ECS45T.setForeground(Color.BLACK);

        // CS46L = new JLabel("Enter 18CS46 Marks:");
        // CS46L.setBounds(350, 670, 300, 40);
        // CS46L.setFont(font);
        // CS46L.setForeground(Color.WHITE);
        // CS46T = new JTextField(200);
        // CS46T.setBounds(725, 670, 250, 30);
        // CS46T.setFont(font);
        // CS46T.setForeground(Color.BLACK);

        insert = new JButton("Insert");
        insert.setBounds(400, 730, 150, 40);
        insert.addActionListener(this);
        insert.setFont(font);
        Color pul = new Color(0, 0, 255);
        Border bored = BorderFactory.createLineBorder(pul, 5);
        insert.setBorder(bored);
        insert.setForeground(Color.WHITE);
        insert.setBackground(blue);

        back = new JButton("Go Back");
        back.setBounds(750, 730, 150, 40);
        back.addActionListener(this);
        back.setFont(font);
        back.setBorder(bored);
        back.setForeground(Color.WHITE);
        back.setBackground(blue);

        con.add(nameL);
        con.add(nameT);
        con.add(usnL);
        con.add(usnT);
        con.add(semL);
        con.add(semT);
        con.add(motherNameL);
        con.add(motherNameT);
        con.add(fatherNameL);
        con.add(fatherNameT);
        con.add(InternalL);
        con.add(ExternalL);
        con.add(IMAT41L);
        con.add(IMAT41T);
        con.add(ICS42L);
        con.add(ICS42T);
        con.add(ICS43L);
        con.add(ICS43T);
        con.add(ICS44L);
        con.add(ICS44T);
        con.add(ICS45L);
        con.add(ICS45T);
        con.add(EMAT41L);
        con.add(EMAT41T);
        con.add(ECS42L);
        con.add(ECS42T);
        con.add(ECS43L);
        con.add(ECS43T);
        con.add(ECS44L);
        con.add(ECS44T);
        con.add(ECS45L);
        con.add(ECS45T);
        con.add(insert);
        con.add(back);

        JLabel background;
        con.setSize(1000, 600);
        con.setLayout(null);
        ImageIcon img = new ImageIcon("background.png");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1600, 900);
        add(background);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == insert) {
            String roll = "", s;
            try (BufferedReader br = new BufferedReader(new FileReader("student.txt"))) {
                String name = nameT.getText();
                String rollno = usnT.getText();
                String sem = semT.getText();
                String fa = fatherNameT.getText();
                String ma = motherNameT.getText();

                int[] I = new int[5];
                I[0] = Integer.parseInt(IMAT41T.getText());
                I[1] = Integer.parseInt(ICS42T.getText());
                I[2] = Integer.parseInt(ICS43T.getText());
                I[3] = Integer.parseInt(ICS44T.getText());
                I[4] = Integer.parseInt(ICS45T.getText());
                int[] E = new int[5];
                E[0] = Integer.parseInt(EMAT41T.getText());
                E[1] = Integer.parseInt(ECS42T.getText());
                E[2] = Integer.parseInt(ECS43T.getText());
                E[3] = Integer.parseInt(ECS44T.getText());
                E[4] = Integer.parseInt(ECS45T.getText());
                int g[] = new int[5];
                for (int i = 0; i < 5; i++) {
                    int sum = 0;
                    sum = I[i] + E[i];
                    g[i] = sum;
                }
                String grade[] = new String[g.length];
                for (int i = 0; i < g.length; i++) {
                    grade[i] = grade(g[i]);
                }
                for (int i = 0; i < grade.length; i++) {
                    if (grade[i] == "D")
                        grade[i] = "Fail";
                }
                PrintWriter pw = new PrintWriter(new FileOutputStream(new File("student.txt"), true));
                String b = name + "*" + rollno + "*" + sem + "*" + fa + "*" + ma + "*" +
                        Integer.toString(I[0]) + "*"
                        + Integer.toString(E[0]) + "*" + Integer.toString(g[0]) + "*" + grade[0] +
                        "*"
                        + Integer.toString(I[1]) + "*" + Integer.toString(E[1]) + "*" +
                        Integer.toString(g[1]) + "*"
                        + grade[1] + "*"
                        + Integer.toString(I[2]) + "*"
                        + Integer.toString(E[2]) + "*" + Integer.toString(g[2]) + "*" + grade[2] +
                        "*"
                        + Integer.toString(I[3])
                        + "*" + Integer.toString(E[3]) + "*" + Integer.toString(g[3]) + "*" +
                        grade[3] + "*"
                        + Integer.toString(I[4]) + "*" + Integer.toString(E[4]) + "*" +
                        Integer.toString(g[4]) + "*"
                        + grade[4]
                        + "*";
                int len = b.length();
                String sc = "-";
                if (len < 50) {
                    for (int j = len; j <= 50; j++)
                        b = b.concat(sc);
                }
                while ((s = br.readLine()) != null) {
                    String result[] = s.split("\\*");
                    roll = result[1];
                    if (roll.equals(rollno)) {
                        br.close();
                        pw.close();
                        modify(b, roll);
                        // System.out.println("File already exist");
                        return;
                    }
                }
                showMessageDialog(null, "Record Added!");
                pw.println(b);
                pw.flush();
                pw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            this.dispose();
            Home h = new Home();
            h.setSize(2300, 790);
            h.setVisible(true);
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

    String grade(float per) throws IOException {
        if (per >= 90)
            return "A";
        else if (per >= 75 && per < 90)
            return "B";
        else if (per >= 35 && per < 75)
            return "C";
        else
            return "D";
    }

    public void modify(String b, String roll)
            throws FileNotFoundException, IOException, NullPointerException {
        showMessageDialog(null, "A record already exists with usn: " + roll);
        File file = new File("student.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        File temp = new File("temp.txt");
        Boolean createNewFile = temp.createNewFile();
        BufferedWriter pw = new BufferedWriter(new FileWriter(temp));

        String r;
        while ((r = br.readLine()) != null) {
            String[] result = r.split("\\*");
            if (roll.equals(result[1])) {
                pw.write(b);
                pw.write("\n");
            } else {
                pw.write(r);
                pw.write("\n");
            }
        }
        pw.flush();
        pw.close();
        br.close();

        // file.delete();
        // temp.renameTo(file);
        if (!file.delete()) {
            System.out.println("Could not delete file");
            return;
        }

        if (!temp.renameTo(file)) {
            System.out.println("Could not rename file");
        }
        showMessageDialog(null, "Record Updated!");

        this.dispose();
        Home h = new Home();
        h.setSize(2300, 790);
        h.setVisible(true);
    }

    public static void main(String args[]) {
        Insert in = new Insert();
        in.setSize(2300, 790);
        in.setVisible(true);
    }
}