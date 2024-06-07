package ar.edu.utn.frba.dds.interfaces;

import ar.edu.utn.frba.dds.models.AlertaClimatica;
import ar.edu.utn.frba.dds.models.CondicionesClimaticas;
import java.util.List;

public interface IservicioClima {

  CondicionesClimaticas obtenerCondicionesClimaticas();

  List<AlertaClimatica> obtenerAlertasClimaticas();
}