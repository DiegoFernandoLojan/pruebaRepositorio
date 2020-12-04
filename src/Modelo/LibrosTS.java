/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mac
 */
public class LibrosTS {
    private String tematica;

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getNum_libros_tematica() {
        return num_libros_tematica;
    }

    public void setNum_libros_tematica(int num_libros_tematica) {
        this.num_libros_tematica = num_libros_tematica;
    }
    private int num_libros_tematica;

    @Override
    public String toString() {
        return tematica; //To change body of generated methods, choose Tools | Templates.
    }
    
}
