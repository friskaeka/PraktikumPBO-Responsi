/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiii;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
/**
 * 
 * @author lenovo
 */
public class InputController {
    LihatModel lihatmodel;
    InputView input;

    public InputController(LihatModel lihatmodel, InputView input) {
        this.lihatmodel = lihatmodel;
        this.input = input;
        
        
         input.bsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = input.getNama();
                String umur = input.getUsia();
                String gaji = input.getGaji();
                lihatmodel.insertData(nama, umur, gaji);
            }
        });
         input.breset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.fnama.setText(null);
                input.fusia.setText(null);  
                input.fgaji.setText(null);
            }
        });
    } 
}
