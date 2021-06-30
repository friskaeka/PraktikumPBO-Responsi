/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiii;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author lenovo
 */
public class MenuController {
    MenuView mv;
    JFrame frame = new JFrame();

    public MenuController(MenuView menuView) {
        this.mv = menuView;
        // input data ==========================================================

        // lihat data ==========================================================
       menuView.btnLihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LihatView lihatView = new LihatView();
                LihatModel lihatModel = new LihatModel();
                LihatController controller = new LihatController(lihatView, lihatModel);
            }
        });
        menuView.btnInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                InputView inputview = new InputView();
                LihatModel model = new LihatModel();
                InputController inputController = new InputController(model,inputview);
            }
        });
    }
}
