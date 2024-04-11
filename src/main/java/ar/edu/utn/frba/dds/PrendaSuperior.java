package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.enums.colores;
import ar.edu.utn.frba.dds.enums.motivos;

public abstract class PrendaSuperior extends Prenda {
    public colores colorSecundario;
    public motivos motivo;

    public void indicarColorSecundario(colores nuevoColor){
        colorSecundario = nuevoColor;
    }

    public void indicarMotivo(motivos nuevoMotivo){
        motivo = nuevoMotivo;
    }
}
