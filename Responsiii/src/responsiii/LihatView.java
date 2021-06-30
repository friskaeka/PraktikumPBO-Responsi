/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiii;

import javax.swing.*;
import java.sql.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lenovo
 */
public class LihatView {
   JFrame frame = new JFrame("Data Karyawan");
    public JTable tabel;
    DefaultTableModel dt;
    JScrollPane scrollPanel;
    String data[][] = new String[500][4];
    public Object namaKolom[] = {"ID", "Nama", "Usia", "Gaji"};
    
    public JButton bkembali = new JButton("KEMBALI");
    
    public LihatView(){
        frame.setTitle("DataKaryawan");
        frame.setSize(750, 300);
        frame.setLayout(null);
        frame.add(bkembali);
        
        dt = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dt);
        scrollPanel = new JScrollPane(tabel);
        
        scrollPanel = new JScrollPane(tabel);
        frame.add(scrollPanel);
        
        scrollPanel.setBounds(15, 15, 700, 100);
        scrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        bkembali.setBounds(20, 200,700, 20);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
