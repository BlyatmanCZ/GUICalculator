import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame{

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    calc frame = new calc();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    boolean iplus;
    boolean iminus;
    boolean imult;
    boolean idiv;
    int i = 0;
    int j = 0;
    int k = 0;

    public calc() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 390, 625);
        contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(15, 36, 340, 100);
        contentPane.add(panel);

        JLabel out = new JLabel(" ");
        panel.add(out);
        out.setFont(new Font("Bahnschrift", Font.PLAIN, 70));

        JButton plus = new JButton("+");
        plus.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == plus) {
                    iplus = true;
                }else {
                    iplus = false;
                }
            }
        });

        JButton minus = new JButton("-");
        minus.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == minus) {
                    iminus = true;
                }else {
                    iminus = false;
                }
            }
        });
        minus.setBounds(103, 161, 70, 70);
        contentPane.add(minus);

        JButton multiply = new JButton("x");
        multiply.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == multiply) {
                    imult = true;
                }else {
                    imult = false;
                }
            }
        });
        multiply.setBounds(199, 161, 70, 70);
        contentPane.add(multiply);

        JButton divide = new JButton("/");
        divide.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == divide) {
                    idiv = true;
                }else {
                    idiv = false;
                }
            }
        });
        divide.setBounds(290, 161, 70, 70);
        contentPane.add(divide);

        JButton in1 = new JButton("1");
        in1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        in1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(iplus == true||iminus == true||imult == true||idiv == true) {
                    j = j*10 + 1;
                    out.setText(j + "");
                }else {
                    i = i*10 + 1;
                    out.setText(i + "");
                }
            }
        });

        JButton in0 = new JButton("0");
        in0.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        in0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(iplus == true||iminus == true||imult == true||idiv == true) {
                    j = j*10;
                    out.setText(j + "");
                }else {
                    i = i*10;
                    out.setText(i + "");
                }
            }
        });
        in0.setBounds(136, 483, 100, 70);
        contentPane.add(in0);
        in1.setBounds(10, 401, 100, 70);
        contentPane.add(in1);

        JButton in2 = new JButton("2");
        in2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        in2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(iplus == true||iminus == true||imult == true||idiv == true) {
                    j = j*10 + 2;
                    out.setText(j + "");
                }else {
                    i = i*10 + 2;
                    out.setText(i + "");
                }
            }
        });
        in2.setBounds(136, 401, 100, 70);
        contentPane.add(in2);

        JButton in3 = new JButton("3");
        in3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        in3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(iplus == true||iminus == true||imult == true||idiv == true) {
                    j = j*10 + 3;
                    out.setText(j + "");
                }else {
                    i = i*10 + 3;
                    out.setText(i + "");
                }
            }
        });
        in3.setBounds(260, 401, 100, 70);
        contentPane.add(in3);

        JButton in4 = new JButton("4");
        in4.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        in4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(iplus == true||iminus == true||imult == true||idiv == true) {
                    j = j*10 + 4;
                    out.setText(j + "");
                }else {
                    i = i*10 + 4;
                    out.setText(i + "");
                }
            }
        });
        in4.setBounds(10, 321, 100, 70);
        contentPane.add(in4);

        JButton in5 = new JButton("5");
        in5.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        in5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(iplus == true||iminus == true||imult == true||idiv == true) {
                    j = j*10 + 5;
                    out.setText(j + "");
                }else {
                    i = i*10 + 5;
                    out.setText(i + "");
                }
            }
        });
        in5.setBounds(136, 321, 100, 70);
        contentPane.add(in5);

        JButton in6 = new JButton("6");
        in6.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        in6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(iplus == true||iminus == true||imult == true||idiv == true) {
                    j = j*10 + 6;
                    out.setText(j + "");
                }else {
                    i = i*10 + 6;
                    out.setText(i + "");
                }
            }
        });
        in6.setBounds(260, 321, 100, 70);
        contentPane.add(in6);

        JButton in7 = new JButton("7");
        in7.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        in7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(iplus == true||iminus == true||imult == true||idiv == true) {
                    j = j*10 + 7;
                    out.setText(j + "");
                }else {
                    i = i*10 + 7;
                    out.setText(i + "");
                }
            }
        });
        in7.setBounds(10, 241, 100, 70);
        contentPane.add(in7);

        JButton in8 = new JButton("8");
        in8.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        in8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(iplus == true||iminus == true||imult == true||idiv == true) {
                    j = j*10 + 8;
                    out.setText(j + "");
                }else {
                    i = i*10 + 8;
                    out.setText(i + "");
                }
            }
        });
        in8.setBounds(136, 241, 100, 70);
        contentPane.add(in8);

        JButton in9 = new JButton("9");
        in9.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        in9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(iplus == true||iminus == true||imult == true||idiv == true) {
                    j = j*10 + 9;
                    out.setText(j + "");
                }else {
                    i = i*10 + 9;
                    out.setText(i + "");
                }
            }
        });
        in9.setBounds(260, 241, 100, 70);
        contentPane.add(in9);

        plus.setBounds(10, 161, 70, 70);
        contentPane.add(plus);

        JButton enter = new JButton("ENTER");
        enter.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(iplus == true) {
                    k = i + j;
                    out.setText(k + "");
                    i = k;
                    j = 0;
                    iplus = false;
                }else if(iminus == true) {
                    k = i - j;
                    out.setText(k + "");
                    i = k;
                    j = 0;
                    iminus = false;
                }else if(imult == true) {
                    k = i * j;
                    out.setText(k + "");
                    i = k;
                    j = 0;
                    imult = false;
                }else if(idiv == true) {
                    k = i / j;
                    out.setText(k + "");
                    i = k;
                    j = 0;
                    idiv = false;
                }
            }
        });
        enter.setBounds(260, 483, 100, 70);
        contentPane.add(enter);

        JButton clear = new JButton("CLEAR");
        clear.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i = 0;
                j = 0;
                k = 0;
                iplus = false;
                iminus = false;
                imult = false;
                idiv = false;
                out.setText("");
            }
        });
        clear.setBounds(10, 483, 100, 70);
        contentPane.add(clear);

    }
}
