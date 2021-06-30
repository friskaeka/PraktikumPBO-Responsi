/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiii;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author lenovo
 */
public class InputView extends JFrame{
    JLabel ljudul = new JLabel("Input Karyawan");
    
    JLabel lnama = new JLabel("Nama");
    public final JTextField fnama = new JTextField(10);
    
    JLabel lusia = new JLabel("Usia");
    public final JTextField fusia= new JTextField(10);
    
    JLabel lgaji = new JLabel("Gaji");
    public final JTextField fgaji = new JTextField(10);
    
    public JButton bsubmit = new JButton("Submit");
    public JButton breset = new JButton("Reset");
    public JButton bkembali = new JButton("Kembali");
    
     public InputView(){
        setTitle("Input Karyawan");
        setSize(300,250);
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(fnama);
        add(lusia);
        add(fusia);
        add(lgaji);
        add(fgaji);  
        add(bsubmit);
        add(breset); 
        add(bkembali);
        
        ljudul.setBounds(15,5,200,20);
        lnama.setBounds(15,30,120,20);
        fnama.setBounds(55,30,200,20);
        
        lusia.setBounds(15,60,120,20);
        fusia.setBounds(55,60,200,20);
        
        lgaji.setBounds(15,90,120,20);
        fgaji.setBounds(55,90,200,20);
        
        bsubmit.setBounds(55,130,90,20);
        breset.setBounds(155,130,90,20);
        bkembali.setBounds(15,165,250,20);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }

	public JLabel getLjudul() {
		return ljudul;
	}

	public void setLjudul(JLabel ljudul) {
		this.ljudul = ljudul;
	}

	public JLabel getLnama() {
		return lnama;
	}

	public void setLnama(JLabel lnama) {
		this.lnama = lnama;
	}

	public JLabel getLusia() {
		return lusia;
	}

	public void setLusia(JLabel lusia) {
		this.lusia = lusia;
	}

    public String getNama(){
        return fnama.getText();
    }
    
    public String getUsia(){
        return fusia.getText();
    }
    
    public String getGaji(){
        return fgaji.getText();
    }
}
