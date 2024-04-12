# Prosa

## Proyecto QMP

  Este proyecto intenta simular un sistema para que el usuario pueda armar sus propios atuendos, eligiendo todas las caracterìsticas de las prendas que va a utilizar.

## Decisiones de Diseño

  El foco de este proyecto esta puesto en generar un sistema mantenible y extensible debido a que los requerimientos iniciales son básicos y que existe la posibilidad de que estos crezcan con el tiempo.
  Es por eso que se tomo la desición de representar a la Prenda como una clase padre, y cada categoría de prenda como clases que heredan de Prenda, como tambien cada tipo de prenda que heredan de su respectiva categoría.

## Particularidades del Diseño

  Debido a estas desiciones, es facil poder mantener cada una de las prendas existentes al estar divididas en su propia clase. Es perfectamente posible encapsular todo el comportamiento de cada tipo o categoria no permitiendo inconsistencias en la creación de objetos y permite la facil extensión del proyecto ya que en el caso de querer agregar una categoría o tipo, solo se tiene que elegir correctamente de quien hereda. Cada nivel de prenda tiene sus propias características y métodos que son comunes a sus partes.
  Utilizando los constructores nos aseguramos poder respetar una creación de objetos cumpliendo con todos los requerimientos sin posibilidad de errores.

### Prenda

  La clase prenda contiene todas las caracteristicas comunes a todas las prendas y el comportamiento del mismo. Es una clase abstracta, porque no se puede crear una prenda sin saber su categoria y tipo.

### Categoria de Prenda (Superior, Inferior, Calzado, Accesorio)

  La clases pertenecientes a la categoría de prenda contienen el comportamiento específico de cada categoría que no es común a otras. Por ejemplo, podríamos decir que el PrendaCalzado tiene la característica de Altura de Suela, y el método para setear esta misma que es común a cualquier calzado, pero este comportamiento no tendría sentido en PrendaInferior que podría tener tiro y definir tiro, como tambien largo y definir largo que no se comparte con ninguna otra categoría de prenda.
  Es una clase abstracta tambien ya que si bien define la categoría, todavía nos hace falta el tipo.

### Tipo de Prenda

  Las clases pertenencientes al tipo de prenda contienen el comportamiento específico para cada tipo. Muchas prendas pueden compartir ciertas características y comportamiento, pero para poder implementar completamente cada prenda y poder hablar de todas sus características, se generaron como clases.
  Las crocs podrían tener stickers, mientras que los zapatos no, pero estos podrían tener tipo de cordones, como las zapatillas, y estas últimas podrían tener motivo que no sirve ni para zapatos ni para crocs.
  Lo mismo sucede con cada tipo de prenda, en cada uno se pueden definir o modificar sus características particulares sin riesgo de dañar otras prendas. De esta manera tambien es muy facil definir nuevos tipos de prendas si necesitaramos.