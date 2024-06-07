package ar.edu.utn.frba.dds.models.pronostico;

import ar.edu.utn.frba.dds.enums.Alerta;
import ar.edu.utn.frba.dds.interfaces.IservicioClima;
import ar.edu.utn.frba.dds.interfaces.SdkClima;
import ar.edu.utn.frba.dds.models.AlertaClimatica;
import ar.edu.utn.frba.dds.models.CondicionesClimaticas;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioAccuWeather implements IservicioClima {
  private final SdkClima apiClima;

  public ServicioAccuWeather(SdkClima apiClima) {
    this.apiClima = apiClima;
  }

  public CondicionesClimaticas obtenerCondicionesClimaticas() {
    List<Map<String, Object>> condiciones = apiClima.getWeather("Buenos Aires, Argentina");

    int temperatura = (int) ((HashMap<String, Object>) condiciones.
        get(0).get("Temperature")).get("Value");

    float probabilidad = (float) condiciones.get(0).get("PrecipitationProbability");

    return new CondicionesClimaticas(temperatura, probabilidad);
  }

  public List<AlertaClimatica> obtenerAlertasClimaticas() {
    Map<String, List<String>> alertas = apiClima.getAlerts("Buenos Aires, Argentina");

    List<String> alertasActuales = alertas.get("CurrentAlerts");

    return alertasActuales.stream().map(alerta -> {
      Alerta tipo;

      switch (alerta) {
        case "STORM":
          tipo = Alerta.TORMENTA;
          break;
        case "HAIL":
          tipo = Alerta.GRANIZO;
          break;
        default:
          tipo = Alerta.NORMAL;
          break;
      }

      return new AlertaClimatica(tipo, new Date());
    }).toList();
  }
}
