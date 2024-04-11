package ar.edu.utn.frba.dds.prendas;

import ar.edu.utn.frba.dds.PrendaCalzado;
import ar.edu.utn.frba.dds.enums.categorias;
import ar.edu.utn.frba.dds.enums.materiales;

public class Botas extends PrendaCalzado {
    public void Prenda(){
        categoria = categorias.CALZADO;
        material = materiales.CUERO;
    }
}