/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Enums.Stands;

/**
 *
 * @author mac
 */
public class Informe {
    private LibrosTS LibrosTS ;
    private Stands stands;
    private int num_libros_tematica;

    public LibrosTS getLibrosTS() {
        return LibrosTS;
    }

    public void setLibrosTS(LibrosTS LibrosTS) {
        this.LibrosTS = LibrosTS;
    }

    public Stands getStands() {
        return stands;
    }

    public void setStands(Stands stands) {
        this.stands = stands;
    }

    public int getNum_libros_tematica() {
        return num_libros_tematica;
    }

    public void setNum_libros_tematica(int num_libros_tematica) {
        this.num_libros_tematica = num_libros_tematica;
    }
}
