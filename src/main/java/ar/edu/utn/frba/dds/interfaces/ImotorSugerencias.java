package ar.edu.utn.frba.dds.interfaces;

import ar.edu.utn.frba.dds.models.Guardarropas;
import ar.edu.utn.frba.dds.models.prenda.Sugerencia;
import ar.edu.utn.frba.dds.models.Usuario;
import java.util.List;

public interface ImotorSugerencias {
  List<Sugerencia> generarSugerencias(Usuario usuario, Guardarropas guardarropas);

  Sugerencia generarSugerencia(Usuario usuario, Guardarropas guardarropas);
}