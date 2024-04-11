package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.colores;
import ar.edu.utn.frba.dds.enums.materiales;

public interface IPrenda {
    void Prenda();
    void indicarMaterial(materiales nuevoMaterial);
    void indicarColorPrimario(colores nuevoColor);
}
