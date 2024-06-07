package ar.edu.utn.frba.dds.interfaces;

import ar.edu.utn.frba.dds.models.AlertaClimatica;
import java.util.List;

public interface SubscriptoresAlertas {
  void notificarAlertas(List<AlertaClimatica> alertas);
}
