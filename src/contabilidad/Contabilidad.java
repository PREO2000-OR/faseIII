/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabilidad;
import java.awt.Graphics;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Graphics;

public class Contabilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea el frame llamado Sistema, donde sera toda la Interfaz
        JFrame sistema=new Sistema();
        sistema.setVisible(true);//Se hace visible el frame Sistema
    }
    
}
