package ar.edu.utn.frba.dds.models.motores.filtros;

import ar.edu.utn.frba.dds.models.Usuario;
import ar.edu.utn.frba.dds.models.prenda.Prenda;
import java.util.List;

public class FiltroTemperatura {
  public void getPrendasValidas(Usuario usuario, List<Prenda> prendas) {
    int temperaturaDia = usuario.obtenerCondicionesDelDia().getTemperatura();

    prendas =  prendas.stream()
        .filter(p ->
            p.getTemperaturaMax() > temperaturaDia
                && p.getTempraturaMin() <= temperaturaDia).toList();
  }
}
