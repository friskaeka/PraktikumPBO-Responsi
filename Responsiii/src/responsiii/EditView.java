/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiii;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author lenovo
 */
public class EditView extends ViewForm{
        JLabel ljudul = new JLabel("Input Karyawan");
    
    JLabel lnama = new JLabel("Nama");
    public final JTextField fnama = new JTextField(10);
    
    public final JTextField fid = new JTextField(10);
    
    JLabel lusia = new JLabel("Usia");
    public final JTextField fusia= new JTextField(10);
    
    JLabel lgaji = new JLabel("Gaji");
    public final JTextField fgaji = new JTextField(10);
    
    public JButton bupdate = new JButton("Update");
    public JButton bhapus = new JButton("Hapus");
    
    public JButton bkembali = new JButton("Kembali");
    
     public EditView(){
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
        add(bupdate);
        add(bhapus); 
        add(bkembali);
        
        ljudul.setBounds(15,5,200,20);
        lnama.setBounds(15,30,120,20);
        fnama.setBounds(55,30,200,20);
        
        lusia.setBounds(15,60,120,20);
        fusia.setBounds(55,60,200,20);
        
        lgaji.setBounds(15,90,120,20);
        fgaji.setBounds(55,90,200,20);
        
        bupdate.setBounds(55,130,90,20);
        bhapus.setBounds(155,130,90,20);
        bkembali.setBounds(15,165,250,20);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTitle(String input_Karyawan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLayout(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(JLabel ljudul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(JLabel lnama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(JTextField fgaji) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(JButton bupdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
