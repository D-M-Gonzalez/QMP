# Prosa

## Proyecto QMP

  Este proyecto intenta simular un sistema para que el usuario pueda armar sus propios atuendos, eligiendo todas las caracterìsticas de las prendas que va a utilizar.

## Decisiones de Diseño

  El foco de este proyecto esta puesto en generar un sistema mantenible y extensible debido a que los requerimientos iniciales son básicos y que existe la posibilidad de que estos crezcan con el tiempo.
  Es por eso que se tomo la desición de representar a la Prenda como una clase padre, y cada categoría de prenda como clases que heredan de Prenda, como tambien cada tipo de prenda que heredan de su respectiva categoría.

## Particularidades del Diseño

  Debido a estas desiciones, es facil poder mantener cada una de las prendas existentes al estar divididas en su propia clase. Es perfectamente posible encapsular todo el comportamiento de cada tipo o categoria no permitiendo inconsistencias en la creación de objetos y permite la facil extensión del proyecto ya que en el caso de querer agregar una categoría o tipo, solo se tiene que elegir correctamente de quien hereda. Cada nivel de prenda tiene sus propias características y métodos que son comunes a sus partes.


