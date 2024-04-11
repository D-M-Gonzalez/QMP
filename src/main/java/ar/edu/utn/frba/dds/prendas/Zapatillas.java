package ar.edu.utn.frba.dds.prendas;

import ar.edu.utn.frba.dds.PrendaCalzado;
import ar.edu.utn.frba.dds.enums.categorias;
import ar.edu.utn.frba.dds.enums.colores;

public class Zapatillas extends PrendaCalzado {
    public colores colorSecundario;

    public void Prenda(){
        categoria = categorias.CALZADO;
    }

    public void indicarColorSecundario(colores nuevoColor){
        colorSecundario = nuevoColor;
    }
}
