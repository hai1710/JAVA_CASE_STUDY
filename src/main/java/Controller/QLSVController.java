package Controller;

import Model.ThiSinh;
import Model.Tinh;
import View.QLTSView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;

public class QLSVController implements ActionListener {

    public QLTSView view;

    public QLSVController(QLTSView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        JOptionPane.showMessageDialog(view,"Bạn vừa nhấn vào: " + actionCommand);


        if( actionCommand.equals("Thêm")){
            this.view.xoaFrom();
            this.view.model.setLuaChon("Thêm");
        }else if( actionCommand.equals("Lưu")) {
       try {
           //Lấy dữ liệu
           int maThiSinh = Integer.valueOf(this.view.textField_ID.getText());
           String hoTen = this.view.textField_HoTen.getText();
           int queQuan = this.view.comboBox_QueQuan.getSelectedIndex();
           Tinh tinh = Tinh.getTinhById(queQuan);
           Date ngaySinh = new Date(this.view.textField_NgaySinh.getText());
           boolean gioiTinh = true;
           String chonGioiTinh = this.view.btn_GioiTinh.getSelection()+"";
           if (chonGioiTinh.equals("Nam")){
               gioiTinh = true;
           } else {gioiTinh = false;}
           float diemMon1 = Float.valueOf(this.view.textField_Diem1.getText());
           float diemMon2 = Float.valueOf(this.view.textField_Diem2.getText());
           float diemMon3 = Float.valueOf(this.view.textField_Diem3.getText());

           ThiSinh thiSinh = new ThiSinh(maThiSinh,hoTen,tinh,ngaySinh,gioiTinh,diemMon1,diemMon2,diemMon3);
           if (this.view.model.getLuaChon().equals("")||this.view.model.getLuaChon().equals("Thêm")){
               this.view.themThiSinh(thiSinh);
           }else if (this.view.model.getLuaChon().equals("Cập Nhật")){
               this.view.capNhatThiSinh(thiSinh);
           }
       }catch (Exception e2){
           e2.printStackTrace();
       }
        } else if (actionCommand.equals("")){}
    }
}
