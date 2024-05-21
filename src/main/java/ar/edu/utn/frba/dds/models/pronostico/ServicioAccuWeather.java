package ar.edu.utn.frba.dds.models.pronostico;

import ar.edu.utn.frba.dds.interfaces.IservicioClima;
import ar.edu.utn.frba.dds.lib.AccuWeatherAPI;
import ar.edu.utn.frba.dds.models.CondicionesClimaticas;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioAccuWeather implements IservicioClima {
  private AccuWeatherAPI apiClima = new AccuWeatherAPI();

  public CondicionesClimaticas obtenerCondicionesClimaticas() {
    List<Map<String, Object>> condiciones = apiClima.getWeather("Buenos Aires, Argentina");

    int temperatura = (int) ((HashMap<String, Object>) condiciones.
        get(0).get("Temperature")).get("Value");

    float probabilidad = (float) condiciones.get(0).get("PrecipitationProbability");

    return new CondicionesClimaticas(temperatura, probabilidad);
  }
}
