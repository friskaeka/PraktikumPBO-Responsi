/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiii;

import javax.swing.*;
//import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author lenovo
 */
public class MenuView extends JFrame{
    JButton btnInput = new JButton("Tambah Karyawan");
    JButton btnLihat = new JButton("Lihat Karyawan");
    // JLabel background = new JLabel();

    public MenuView() {
        setTitle("Menu Utama");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(300,400);
        
        // background.setIcon();
        
        add(btnLihat);
        add(btnInput);
        btnLihat.setBounds(60, 170, 150, 20);
        btnInput.setBounds(60, 210, 150, 20);
    }
}
