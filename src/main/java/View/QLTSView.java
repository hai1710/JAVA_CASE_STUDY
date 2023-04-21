package View;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Controller.QLSVController;
import Model.QLTSModel;
import Model.ThiSinh;
import Model.Tinh;

import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class QLTSView extends JFrame {

    public final ButtonGroup btn_GioiTinh;
    public final JComboBox comboBox_QueQuan;
    private JPanel contentPane;
    public QLTSModel model;
    public JTextField textField_maSinhVien;
    private JTable table;
    public JTextField textField_ID;
    public JTextField textField_HoTen;
    public JTextField textField_NgaySinh;
    public JTextField textField_Diem1;
    public JTextField textField_Diem2;
    public JTextField textField_Diem3;
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
        setBounds(100, 100, 913, 749);


        ActionListener actionListener = new QLSVController(this);

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

        JLabel lblQueQuan = new JLabel("Quê Quán");
        lblQueQuan.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblQueQuan.setBounds(10, 1, 79, 61);
        contentPane.add(lblQueQuan);

        JLabel lblMSinhVien = new JLabel("Mã Sinh Viên");
        lblMSinhVien.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMSinhVien.setBounds(411, 1, 123, 61);
        contentPane.add(lblMSinhVien);

        textField_maSinhVien = new JTextField();
        textField_maSinhVien.setColumns(10);
        textField_maSinhVien.setBounds(512, 11, 252, 43);
        contentPane.add(textField_maSinhVien);

        JButton btnNewButton = new JButton("Tìm");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnNewButton.setBounds(774, 11, 115, 43);
        contentPane.add(btnNewButton);

        JComboBox comboBox_QueQuan_TimKiem = new JComboBox();
        ArrayList<Tinh> listTinh = Tinh.getDSTinh();
        comboBox_QueQuan_TimKiem.addItem("");
        for (Tinh tinh: listTinh) {
            comboBox_QueQuan_TimKiem.addItem(tinh.getTenTinh());
        }
        comboBox_QueQuan_TimKiem.setBounds(106, 12, 264, 43);
        contentPane.add(comboBox_QueQuan_TimKiem);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 72, 879, 2);
        contentPane.add(separator_1);

        JLabel Label_DSTS = new JLabel("Danh sách thí sinh");
        Label_DSTS.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        Label_DSTS.setBounds(10, 72, 160, 61);
        contentPane.add(Label_DSTS);

        table = new JTable();
        table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                },
                new String[] {
                        "STT", "Mã thí sinh", "Họ tên", "Quê Quán", "Giới tính", "Điểm 1", "Điểm 2", "Điểm 3"
                }
        ));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 130, 879, 219);
        contentPane.add(scrollPane);

        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setBounds(10, 359, 879, 2);
        contentPane.add(separator_1_1);

        JLabel Label_TTTS = new JLabel("Thông tin thí sinh");
        Label_TTTS.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        Label_TTTS.setBounds(10, 359, 160, 61);
        contentPane.add(Label_TTTS);

        JLabel lblMSinhVien_1 = new JLabel("Mã Sinh Viên");
        lblMSinhVien_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMSinhVien_1.setBounds(10, 399, 123, 61);
        contentPane.add(lblMSinhVien_1);

        textField_ID = new JTextField();
        textField_ID.setColumns(10);
        textField_ID.setBounds(116, 415, 219, 26);
        contentPane.add(textField_ID);

        JLabel lblHoTen = new JLabel("Họ và Tên");
        lblHoTen.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblHoTen.setBounds(10, 430, 123, 61);
        contentPane.add(lblHoTen);

        JLabel lblQueQuan_1 = new JLabel("Quê Quán");
        lblQueQuan_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblQueQuan_1.setBounds(10, 475, 123, 61);
        contentPane.add(lblQueQuan_1);

        comboBox_QueQuan = new JComboBox();
        comboBox_QueQuan.addItem("");
        for (Tinh tinh: listTinh) {
            comboBox_QueQuan.addItem(tinh.getTenTinh());
        }
        comboBox_QueQuan.setBounds(116, 490, 219, 35);
        contentPane.add(comboBox_QueQuan);

        JLabel lblNgaySinh = new JLabel("Ngày sinh");
        lblNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNgaySinh.setBounds(10, 512, 123, 61);
        contentPane.add(lblNgaySinh);

        JLabel lblGioiTinh = new JLabel("Giới Tính");
        lblGioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblGioiTinh.setBounds(378, 399, 123, 61);
        contentPane.add(lblGioiTinh);

        textField_HoTen = new JTextField();
        textField_HoTen.setColumns(10);
        textField_HoTen.setBounds(116, 453, 219, 26);
        contentPane.add(textField_HoTen);

        textField_NgaySinh = new JTextField();
        textField_NgaySinh.setColumns(10);
        textField_NgaySinh.setBounds(116, 535, 219, 26);
        contentPane.add(textField_NgaySinh);

        JRadioButton rdbtnNam = new JRadioButton("Nam");
        rdbtnNam.setFont(new Font("Times New Roman", Font.BOLD, 15));
        rdbtnNam.setBounds(486, 420, 103, 21);
        contentPane.add(rdbtnNam);

        JRadioButton rdbtnNu = new JRadioButton("Nữ");
        rdbtnNu.setFont(new Font("Times New Roman", Font.BOLD, 15));
        rdbtnNu.setBounds(643, 421, 103, 21);
        contentPane.add(rdbtnNu);

        btn_GioiTinh = new ButtonGroup();
        btn_GioiTinh.add(rdbtnNam);
        btn_GioiTinh.add(rdbtnNu);

        JLabel lblDiem1 = new JLabel("Điểm 1");
        lblDiem1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblDiem1.setBounds(378, 447, 123, 61);
        contentPane.add(lblDiem1);

        textField_Diem1 = new JTextField();
        textField_Diem1.setColumns(10);
        textField_Diem1.setBounds(486, 467, 219, 26);
        contentPane.add(textField_Diem1);

        JLabel lblDiem2 = new JLabel("Điểm 2");
        lblDiem2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblDiem2.setBounds(378, 475, 123, 61);
        contentPane.add(lblDiem2);

        textField_Diem2 = new JTextField();
        textField_Diem2.setColumns(10);
        textField_Diem2.setBounds(486, 495, 219, 26);
        contentPane.add(textField_Diem2);

        JLabel lblDiem3 = new JLabel("Điểm 3");
        lblDiem3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblDiem3.setBounds(378, 500, 123, 61);
        contentPane.add(lblDiem3);

        textField_Diem3 = new JTextField();
        textField_Diem3.setColumns(10);
        textField_Diem3.setBounds(486, 523, 219, 26);
        contentPane.add(textField_Diem3);

        JButton btnThem = new JButton("Thêm");
        btnThem.addActionListener(actionListener);
        btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnThem.setBounds(18, 596, 115, 43);
        contentPane.add(btnThem);

        JButton btnXoa = new JButton("Xóa");
        btnXoa.addActionListener(actionListener);
        btnXoa.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnXoa.setBounds(191, 596, 115, 43);
        contentPane.add(btnXoa);

        JButton btnCapNhat = new JButton("Cập Nhật");
        btnCapNhat.addActionListener(actionListener);
        btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnCapNhat.setBounds(363, 596, 115, 43);
        contentPane.add(btnCapNhat);

        JButton btnLuu = new JButton("Lưu");
        btnLuu.addActionListener(actionListener);
        btnLuu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnLuu.setBounds(548, 596, 115, 43);
        contentPane.add(btnLuu);

        JButton btnHuyBo = new JButton("Hủy Bỏ");
        btnHuyBo.addActionListener(actionListener);
        btnHuyBo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnHuyBo.setBounds(736, 596, 115, 43);
        contentPane.add(btnHuyBo);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(10, 582, 879, 4);
        contentPane.add(separator_2);

    }
    public void xoaFrom(){
        textField_ID.setText("");
        textField_HoTen.setText("");
        textField_NgaySinh.setText("");
        textField_Diem1.setText("");
        textField_Diem2.setText("");
        textField_Diem3.setText("");
        comboBox_QueQuan.setSelectedIndex(-1);
        btn_GioiTinh.clearSelection();
    }

    public void themThiSinh(ThiSinh thiSinh) {
        this.model.insert(thiSinh);

    }

    public void capNhatThiSinh(ThiSinh thiSinh) {
    }
}
