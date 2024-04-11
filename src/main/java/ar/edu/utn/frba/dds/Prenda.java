package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.enums.categorias;
import ar.edu.utn.frba.dds.enums.colores;
import ar.edu.utn.frba.dds.enums.materiales;
import ar.edu.utn.frba.dds.models.*;

public abstract class Prenda implements IPrenda {
    public categorias categoria;
    public colores colorPrimario;
    public materiales material;

    public void indicarMaterial(materiales nuevoMaterial){
        material = nuevoMaterial;
    }

    public void indicarColorPrimario(colores nuevoColor){
        colorPrimario = nuevoColor;
    }

}