# Allpatterns2

## Builder

<div align="center"><img src="https://1.bp.blogspot.com/-Wl7nwZc7HFw/TeJml4n8l9I/AAAAAAAAJKM/egrJhwNO_JM/s1600/image00.jpg" height="300" width="350"></div>

   Permite la creación de un objeto complejo, a partir de una variedad de partes que contribuyen individualmente a la
   creación y ensamblación del objeto mencionado. Hace uso de la frase "divide y conquistarás".
   
   **Se debe utilizar este patrón cuando sea necesario:**
   - Independizar el algoritmo de creación de un objeto complejo de las partes que constituyen el objeto y cómo se 
     ensamblan entre ellas.
   - Que el proceso de construcción permita distintas representaciones para el objeto construido, de manera dinámica.
   
   Esta patrón debe utilizarse cuando el algoritmo para crear un objeto suele ser complejo e implica la interacción de 
   otras partes independientes y una coreografía entre ellas para formar el ensamblaje. Por ejemplo: la construcción de
   un objeto Computadora, se compondrá de otros muchos objetos, como puede ser un objeto PlacaDeSonido, Procesador, 
   PlacaDeVideo, Gabinete, Monitor, etc.
   
   **Ejemplo:**
   
   El objetivo del ejemplo es poder crear un objeto Auto (este sería nuestro producto). El auto se compondrá de varios 
   atributos que lo componen: motor, marca, modelo y cantidad de puertas. En nuestro ejemplo, el auto no se compone de 
   muchos objetos complejos. De hecho, se compone de sólo 4 objetos relativamente sencillos. Esto es para poder hacer 
   entendible la propuesta del Builder y no perderse en los objetos que lo componen. Queda en la imaginación del lector
   la posibilidad de trabajar con ejemplos más complejos. Yo particularmente usé mucho este patrón cuando trabajé con 
   archvios.
   
   **Consecuencias**
   
   - Permite variar la representación interna de un producto.
   - El Builder ofrece una interfaz al Director para construir un producto y encapsula la representación interna del 
     producto y cómo se juntan sus partes.
   - Si se cambia la representación interna basta con crear otro Builder que respete la interfaz.
   - Separa el código de construcción del de representación.
   - Las clases que definen la representación interna del producto no aparecen en la interfaz del Builder.
   - Cada ConcreteBuilder contiene el código para crear y juntar una clase específica de producto.
   - Distintos Directores pueden usar un mismo ConcreteBuilder.
   - Da mayor control en el proceso de construcción.
   - Permite que el Director controle la construcción de un producto paso a paso.
   - Sólo cuando el producto está acabado lo recupera el director del builder.
