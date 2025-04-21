Feature: Validar estrategia

  Scenario: Análisis de validación de estrategia
    Given el usuario está en la página de análisis de estrategia
    When el usuario ejecuta el análisis de estrategia
    Then la estrategia debe ser validada