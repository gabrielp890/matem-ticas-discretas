/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Gabriel
 */
public class FramePrincipal {

    JFrame frame=new JFrame("Matematicas discretas");
    MenuInicial mi=new MenuInicial();
    
    public FramePrincipal() {
        frame.add(mi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
    
    public FramePrincipal(JPanel jp){
        frame.add(jp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
    
    
}
