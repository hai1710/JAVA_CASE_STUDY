package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.QLTSModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class QLTSView extends JFrame {

    private JPanel contentPane;
    QLTSModel model;
    private JTextField textField_maSinhVien;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    QLTSView frame = new QLTSView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public QLTSView() {
        this.model = new QLTSModel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 913, 609);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuFile.setFont(new Font("Segoe UI", Font.BOLD, 14));
        menuBar.add(menuFile);

        JMenuItem menuOpen = new JMenuItem("Open");
        menuOpen.setFont(new Font("Segoe UI", Font.BOLD, 13));
        menuFile.add(menuOpen);

        JMenuItem menuClose = new JMenuItem("Close");
        menuClose.setFont(new Font("Segoe UI", Font.BOLD, 13));
        menuFile.add(menuClose);

        JSeparator separator = new JSeparator();
        menuFile.add(separator);

        JMenuItem nemuExit = new JMenuItem("Exit");
        nemuExit.setFont(new Font("Segoe UI", Font.BOLD, 13));
        menuFile.add(nemuExit);

        JMenu menuAbout = new JMenu("About");
        menuAbout.setFont(new Font("Segoe UI", Font.BOLD, 14));
        menuBar.add(menuAbout);

        JMenuItem menuAboutMe = new JMenuItem("About me...");
        menuAboutMe.setFont(new Font("Segoe UI", Font.BOLD, 13));
        menuAbout.add(menuAboutMe);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel Label_QueQuan = new JLabel("Quê Quán");
        Label_QueQuan.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        Label_QueQuan.setBounds(10, 10, 79, 61);
        contentPane.add(Label_QueQuan);

        JLabel Label_MaSinhVien = new JLabel("Mã Sinh Viên");
        Label_MaSinhVien.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        Label_MaSinhVien.setBounds(366, 10, 123, 61);
        contentPane.add(Label_MaSinhVien);

        textField_maSinhVien = new JTextField();
        textField_maSinhVien.setColumns(10);
        textField_maSinhVien.setBounds(463, 12, 252, 61);
        contentPane.add(textField_maSinhVien);

        JButton btnNewButton = new JButton("Tìm");
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnNewButton.setBounds(740, 10, 115, 52);
        contentPane.add(btnNewButton);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(85, 12, 264, 61);
        contentPane.add(comboBox);
    }
}
