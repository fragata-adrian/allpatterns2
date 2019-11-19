# Allpatterns2

## Chain of Responsibility

<div align="center"><img src="https://lh6.googleusercontent.com/-3NnctckTzla7TA0IA8Be-AbBu0GJLNWMAyNV8DTowXkvpIxOtGh7vp2DXuYvgzVY0Xg1HE_e-R23dmur2jU0OADeQGrc48oI4xHxlCuJlFrfxvll1M"></div>

Permite establecer una cadena de objetos receptores a través de los cuales se pasa una petición formulada por un objeto
emisor. La idea es que cualquiera de los receptores pueden responder a la petición en función de un criterio establecido.
Encadena los objetos receptores y pasa la petición a través de la cadena hasta que es procesada por algún objeto.

Busca evitar un montón de if – else largos y complejos en nuestro código, pero sobre todas las cosas busca evitar que 
el cliente necesite conocer toda nuestra estructura jeráquica y que rol cumple cada integrante de nuestra estructura.
En múltiples ocasiones, un cliente necesita que se realice una función, pero o no conoce al servidor concreto de esa 
función o es conveniente que no lo conozca para evitar un gran acoplamiento entre ambos.


##Ejemplo:

### Cliente
Se pide modelar un cliente el cual desea hacer la compra de un auto, para ello el cliente contara con una suma de dinero la cual  le perimitira o no comprar el vehiculo deseado. 
En caso de no contar con el dinero suficiente para comprarlo, dicho cliente podra contar con la opcio de solicitar un prestamo al banco en que se encuentra afilado.


### Rodados

- **Chevrolet Corsa**. <br>
  - La capacidad de estos autos es de 4 pasajeros, su velocidad máxima 150 km/h, y pesan 1300 kg. <br>

- **Renault Kwid** que funcionan _a gas_. 
  Cada uno de ellos puede tener puesto, o no, un tanque adicional. 
  - La capacidad de un Kwid es de 4 pasajeros si no tiene puesto el tanque adicional, o 3 pasajeros si lo tiene puesto.
  - La velocidad máxima es 120 km/h con, o 110 km/h sin, tanque adicional.
   <br>


### Banco

Estamos realizando el software para un banco y uno de los puntos más importantes es saber quién puede aprobar un crédito. Por lo tanto el banco define las siguientes reglas de negocio:

- **Ejecutivo**
  - Si el monto no supera los $ 10.000 entonces el ejecutivo de cuenta pueda aprobar el préstamo.
- **Lider Ejecutivo**
  - Si el monto esta entre los $10.000 y $50.000 entonces la persona indicada para realizar la aprobación es el líder ejecutivo de cuentas.
- **Gerente**
  - Si el monto se encuentra entre $ 50.000 y $100.000 entonces es el Gerente quién debe realizar dicha aprobación.
- **Director**
  - Por montos superiores a los $100.000 entonces la aprobación la realizará el Director.
  
 ## Consecuencias
 
 - Reduce el acoplamiento.
 - Añade flexibilidad para asignar responsabilidades a objetos.
 - No se garantiza la recepción.
