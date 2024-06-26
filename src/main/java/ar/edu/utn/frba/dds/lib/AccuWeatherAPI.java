package ar.edu.utn.frba.dds.lib;

import ar.edu.utn.frba.dds.interfaces.SdkClima;
import java.util.*;

public final class AccuWeatherAPI implements SdkClima {

  public final List<Map<String, Object>> getWeather(String ciudad) {
    return Arrays.asList(new HashMap<String, Object>() { {
        put("DateTime", "2019-05-03T01:00:00-03:00");
        put("EpochDateTime", 1556856000);
        put("WeatherIcon", 33);
        put("IconPhrase", "Clear");
        put("IsDaylight", false);
        put("PrecipitationProbability", 0);
        put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
        put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
        put("Temperature", new HashMap<String, Object>() { {
            put("Value", 57);
            put("Unit", "F");
            put("UnitType", 18);
          }
        });
      }
    });
  }

  public final Map<String, List<String>> getAlerts(String ciudad) {
    List<String> lista = new ArrayList<>();
    lista.add("HAIL");
    lista.add("STORM");

    return new HashMap<String, List<String>>() { {
        put("Current", lista);
      }
    };
  }


}