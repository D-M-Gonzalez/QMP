package ar.edu.utn.frba.dds.models.motores.filtros;

import ar.edu.utn.frba.dds.interfaces.IfiltroSugerencia;
import ar.edu.utn.frba.dds.models.Usuario;
import ar.edu.utn.frba.dds.models.prenda.Prenda;
import java.util.List;

public class FiltroFormalidad implements IfiltroSugerencia {
  public void getPrendasValidas(Usuario usuario, List<Prenda> prendas) {
    prendas =  usuario.getEdad() > 55
        ? prendas.stream()
        .filter(p -> !p.isInformal()).toList() : prendas;
  }
}
