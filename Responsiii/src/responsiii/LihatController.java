/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiii;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
/**
 *
 * @author lenovo
 */
public class LihatController {
    LihatModel lihatmodel;
    LihatView lihatview;
    
    public LihatController(LihatView lihat, LihatModel model) {
        this.lihatmodel = model;
        this.lihatview = lihat;
        
        if (model.getBanyakData()!=0) {
            String dataKaryawan[][] = lihatmodel.readData();
            lihatview.tabel.setModel((new JTable(dataKaryawan, lihatview.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
    }
        lihatview.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = lihatview.tabel.getSelectedRow();
             //   int kolom = lihatVieww.tabel.getSelectedColumn(); // ga kepake sekarang

                String dataterpilih = lihatview.tabel.getValueAt(baris, 1).toString();

                System.out.println(dataterpilih);

                int input = JOptionPane.showConfirmDialog(null,
                        "Apa anda ingin menghapus " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    lihatmodel.deletedata(dataterpilih);
                    String dataKaryawan[][] = lihatmodel.readData();
                    lihatview.tabel.setModel(new JTable(dataKaryawan, lihatview.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });
}
}
