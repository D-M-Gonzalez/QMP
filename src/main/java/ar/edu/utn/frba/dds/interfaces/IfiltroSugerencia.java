package ar.edu.utn.frba.dds.interfaces;

import ar.edu.utn.frba.dds.models.Usuario;
import ar.edu.utn.frba.dds.models.prenda.Prenda;

import java.util.List;

public interface IfiltroSugerencia {
  void getPrendasValidas(Usuario usuario, List<Prenda> prendas);
}
