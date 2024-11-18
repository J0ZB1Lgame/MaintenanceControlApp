package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.view.Pantalla;

public class Aplicacion {

    private Pantalla pantalla;

    public Aplicacion() {
        pantalla = new Pantalla();
    }

    public void run() {
        pantalla.setVisible(true);
    }
}
