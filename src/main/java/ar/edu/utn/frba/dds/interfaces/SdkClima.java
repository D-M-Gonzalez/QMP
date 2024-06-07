package ar.edu.utn.frba.dds.interfaces;

import java.util.List;
import java.util.Map;

public interface SdkClima {
  List<Map<String, Object>> getWeather(String city);

  Map<String, List<String>> getAlerts(String city);
}
