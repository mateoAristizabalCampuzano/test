Feature: hora del dia

  Scenario: es de Night cuando es mayor a 0 y menor a 6
    Given la hora es 5
    When verificamos si es de Night
    Then obtenemos que es de Night

  Scenario: es de Morning cuando es menor a 12 y mayor a 6
    Given la hora es 8
    When verificamos si es de Morning
    Then obtenemos que es de Morning

  Scenario: es de Afternoon cuando es mayor a 12 y menor a 18
    Given la hora es 16
    When verificamos si es de Afternoon
    Then obtenemos que es de Afternoon

  Scenario: es de Evening cuando es mayor a 18 y menor a 24
    Given la hora es 21
    When verificamos si es de Evening
    Then obtenemos que es de Evening

  Scenario: es Invalid hour si la hora no esta en el rango de 24 horas
    Given la hora es 30
    When verificamos si es Invalid hour
    Then obtenemos que es de Invalid hour