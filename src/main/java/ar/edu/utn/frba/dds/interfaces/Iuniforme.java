package ar.edu.utn.frba.dds.interfaces;

import ar.edu.utn.frba.dds.models.prenda.Prenda;

public interface Iuniforme {
  Prenda fabricarPrendaSuperior();
  Prenda fabricarPrendaInferior();
  Prenda fabricarPrendaCalzado();
}
