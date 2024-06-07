package ar.edu.utn.frba.dds.events;

import ar.edu.utn.frba.dds.interfaces.SubscriptoresSugerencias;
import java.util.ArrayList;
import java.util.List;

public class SugerenciaDiaria {
  private List<SubscriptoresSugerencias> subscriptores = new ArrayList<>();

  public void dispararSugerenciaDiaria() {
    this.subscriptores.forEach(SubscriptoresSugerencias::generarSugerenciaDiaria);
  }
}
