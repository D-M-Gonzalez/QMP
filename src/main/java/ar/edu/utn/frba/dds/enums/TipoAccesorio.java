package ar.edu.utn.frba.dds.enums;

import ar.edu.utn.frba.dds.interfaces.ItipoPrenda;

public enum TipoAccesorio implements ItipoPrenda {
  ANTEOJOS,
  PANUELO;

  public Categoria getCategoria() {
    return Categoria.ACCESORIO;
  }
}
