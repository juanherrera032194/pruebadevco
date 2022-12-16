Feature: Search by keyword

  Scenario: Buscar un item especifico y agregarlo al carrito de compras
    Given Que ingreso a la pagina de sauce demo
    When busco e ingreso un producto al carrito de compra
    Then observo en pantalla el mensaje "checkout"