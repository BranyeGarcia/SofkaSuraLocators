# language: es

Característica: Validar localizadores a EebElements

  Antecedentes:
    Dado que el usuario se encuentra en la pagina del aplicativo

  Esquema del escenario: Validar tiempo que se tarda en localizar elementos web con metodos de screenplay y selenium
    Cuando Se busca un elemento por el tipo de localizador "<locator>"
    Entonces debo almacenar el tiempo que tarda en encontrar el elemento
    Ejemplos:
      | locator     |
      |             |
      | id          |
      | name        |
      #| classname   |
      #| tagname     |
      #| partialText |
      #| linkText    |
      | cssSelector |
      | xpath       |



