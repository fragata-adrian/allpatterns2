# Allpatterns2

## Mediator

<div align="center"><img src="https://lh6.googleusercontent.com/ncM1VsUkV5iq1TOo0MtG3x5Z5Fcf5R3AmNayA8bHj3giiYnqoTGMKSv18A8cihfwhVm-jRf9EY5F3xL8OZEbIsTnCZNaSHHmZbDiX3NxT0ZJKpZmUTg"></div>

Un Mediator es un patrón de diseño que define un objeto que hace de procesador central, coordinando las relaciones entre
sus asociados o participantes. Permite la interacción de varios objetos, sin generar acoples fuertes en esas relaciones.
Todos los objetos se comunican con un mediador y es éste quién realiza la comunicación con el resto.

### Usar el patrón Mediator cuando:

- Un conjunto grande de objetos se comunica de una forma bien definida, pero compleja.
- Reutilizar un objeto se hace difícil por que se relaciona con muchos objetos.
- Las clases son difíciles de reutilizar porque su función básica esta entrelazada con relaciones de dependencia.

### Ejemplo:

Nuestro ejemplo será un chat: donde habrá usuarios que se comunicaran entre sí en un salón de chat. Para ellos se define
una interface llamada IUsuarioChat que todos los objetos que quieran participar de un chat deberán implementar. La clase
Ususario representa un usuario que quiera chatear.

### Consecuencias:

- Desacopla a los colegas: el patrón Mediator promueve bajar el acoplamiento entre colegas. Se puede variar y reusar
  colegas y mediadores independiéntemente.
- Simplifica la comunicación entre objetos: los objetos que se comunican de la forma "muchos a muchos" puede ser 
  remplazada por una forma "uno a muchos" que es menos compleja y más elegante. Además esta forma de comunicación 
  es más fácil de entender. Es decir, un objeto no necesita conocer a todos los objetos, tan sólo a un mediador.
- Clarifica como los objetos se relacionan en un sistema.
- Centraliza el control: el mediador es el que se encarga de comunicar a los colegas, este puede ser muy complejo, 
  difícil de entender y modificar.
  
### Temas a tener en cuenta.
  
  Sabemos que el patrón Mediator introduce un objeto para mediar la comunicación entre "colegas". Algunas veces el objeto
  Mediador implementa operaciones simplemente para enviarlas o otros objetos; otras veces pasa una referencia a él mismo
  y por consiguiente utiliza la verdadera delegación.
  
  Entre los colegas puede existir dos tipos de dependencias:
  * Un tipo de dependencia requiere un objeto para conseguir la aprobación de otros objetos antes de hacer tipos 
    específicos de cambios de estado.
    
  * El otro tipo de dependencia requiere un objeto para notificar a otros objetos después de que este ha hecho un tipo 
    específico de cambios de estado.
    
  Ambos tipos de dependencias son manejadas de un modo similar. Las instancias de Colega1, Colega2, .... están asociadas
   con un objeto mediator. Cuando ellos quieren conseguir la aprobación anterior para un cambio de estado, llaman a un 
   método del objeto Mediator. El método del objeto Mediator realiza cuidadoso el resto.
   
  Pero hay que tener en cuenta lo siguiente con respecto al mediador: Poner toda la dependencia de la lógica para un 
  conjunto de objetos relacionados en un lugar puede hacer incomprensible la dependencia lógica fácilmente. Si la clase
  Mediator llega a ser demasiado grande, entonces dividirlo en piezas más pequeñas puede hacerlo más comprensible.
