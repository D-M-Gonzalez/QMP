package ar.edu.utn.frba.dds.enums;

import ar.edu.utn.frba.dds.interfaces.ItipoPrenda;

public enum TipoInferior implements ItipoPrenda {
  PANTALON,
  POLLERA;

  public Categoria getCategoria() {
    return Categoria.INFERIOR;
  }
}
