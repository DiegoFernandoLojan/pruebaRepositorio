/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.UtilComponentes;

import Controlador.Informe_controlador;
import Controlador.Utilities;
import javax.swing.JComboBox;

/**
 *
 * @author mac
 */
public class UtilComponentes {
    public static void cargarComboStands(JComboBox cbox){
        cbox.removeAllItems();
   
        for (int i = 0; i < Utilities.obtenerStands().length; i++) {
           
            cbox.addItem(Utilities.obtenerStands()[i]);
        }
    }
    
     public static void cargarComboTematica(JComboBox cbox,Informe_controlador ic){
        cbox.removeAllItems();
        for (int i = 0; i < ic.getLibrossTS_a().length; i++) {
            if (ic.getLibrossTS_a()[i] != null) {
                 cbox.addItem(ic.getLibrossTS_a()[i]);
            }
           
        }
    }
     
     
       public static int possNull(Informe_controlador ic){
    int pos = -1;
        for (int i = 0; i < ic.getLibrossTS_a().length; i++) {
            pos++;
            if (ic.getLibrossTS_a()[i] == null) {
                break;
            }
        }
        return pos;
    
    }
}
