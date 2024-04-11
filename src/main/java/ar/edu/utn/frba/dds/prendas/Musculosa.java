package ar.edu.utn.frba.dds.prendas;

import ar.edu.utn.frba.dds.PrendaSuperior;
import ar.edu.utn.frba.dds.enums.categorias;
import ar.edu.utn.frba.dds.enums.colores;

public class Musculosa extends PrendaSuperior {
    public colores colorSecundario;

    public void Prenda(){
        categoria = categorias.PARTE_SUPERIOR;
    }

    public void indicarColorSecundario(colores nuevoColor){
        colorSecundario = nuevoColor;
    }
}
