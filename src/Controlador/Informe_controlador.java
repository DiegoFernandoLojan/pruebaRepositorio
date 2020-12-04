/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Informe;
import Modelo.LibrosTS;

/**
 *
 * @author mac
 */
public class Informe_controlador {
    private LibrosTS librossTS_a[];
    private Informe informes[][];
    
    private LibrosTS librosTS;
    private Informe informe;
    
     public LibrosTS getLibrosTemp(LibrosTS lts){
        LibrosTS aux = new LibrosTS();
        aux.setNum_libros_tematica(lts.getNum_libros_tematica());
        aux.setTematica(lts.getTematica());
        return aux;
    }
    
    public Informe getInforme(Informe i){
    Informe aux = new Informe();
    aux.setLibrosTS(i.getLibrosTS());
    aux.setStands(i.getStands());
    return aux;
    }

    public LibrosTS[] getLibrossTS_a() {
        return librossTS_a;
    }

    public void setLibrossTS_a(LibrosTS[] librossTS_a) {
        this.librossTS_a = librossTS_a;
    }

    public Informe[][] getInformes() {
        return informes;
    }

    public void setInformes(Informe[][] informes) {
        this.informes = informes;
    }

    public LibrosTS getLibrosTS() {
         if (librosTS == null) {
            librosTS = new LibrosTS();
        }
        return librosTS;
    }

    public void setLibrosTS(LibrosTS librosTS) {
        this.librosTS = librosTS;
    }

    public Informe getInforme() {
         if (informe == null) {
            informe = new Informe();
        }
        return informe;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    /////
        public void crearArregloLibro(int cantLibros){
        librossTS_a = new LibrosTS[cantLibros];
    }
    public void crearArregloInforme(int tematica,int stand){
        informes = new Informe[tematica][stand];
    
    }
}
