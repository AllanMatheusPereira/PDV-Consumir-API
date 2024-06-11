/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pdv;

import javax.swing.JFrame;
import view.ViewPrincipalVenda;

/**
 *
 * @author allan
 */
public class PDV {

    public static void main(String[] args) {
        ViewPrincipalVenda view = new ViewPrincipalVenda();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
   }
}
