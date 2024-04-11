package ar.edu.utn.frba.dds.prendas;

import ar.edu.utn.frba.dds.PrendaAccesorio;
import ar.edu.utn.frba.dds.enums.categorias;
import ar.edu.utn.frba.dds.enums.colores;

public class Panuelo extends PrendaAccesorio {
    public colores colorSecundario;

    public void Prenda(){
        categoria = categorias.ACCESORIO;
    }

    public void indicarColorSecundario(colores nuevoColor){
        colorSecundario = nuevoColor;
    }
}
