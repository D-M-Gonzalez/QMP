package ar.edu.utn.frba.dds.models.motores.filtros;

import ar.edu.utn.frba.dds.models.AlertaClimatica;
import ar.edu.utn.frba.dds.models.Usuario;
import ar.edu.utn.frba.dds.models.prenda.Prenda;
import java.util.List;

public class FiltroClima {
  public void getPrendasValidas(Usuario usuario, List<Prenda> prendas) {
    List<AlertaClimatica> alertas = usuario.obtenerAlertas();

    prendas =  prendas.stream().filter(p ->
        alertas.stream().allMatch(alerta -> p.isUsable(alerta.getAlerta()))).toList();
  }
}
