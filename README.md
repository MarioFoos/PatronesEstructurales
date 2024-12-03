Patrones Estructurales
Estos patrones se ocupan de la composición de clases y objetos para formar estructuras más grandes y flexibles.
- Adapter: Permite que clases con interfaces incompatibles trabajen juntas mediante la traducción de una interfaz a otra. Piensa en un adaptador de corriente que convierte un enchufe extranjero en uno que puedes usar localmente.
- Decorator: Añade funcionalidades adicionales a un objeto de manera dinámica sin alterar su estructura. Es útil para extender las capacidades de los objetos de forma flexible.
- Composite: Permite tratar a un grupo de objetos de manera uniforme. Es útil para modelar estructuras jerárquicas como árboles, donde los nodos y las hojas deben ser tratados de la misma forma.
- Proxy: Proporciona un sustituto o marcador de posición para controlar el acceso a un objeto. Un ejemplo común es un proxy que carga un objeto pesado de manera perezosa (lazy loading).
- Bridge: Separa una abstracción de su implementación para que ambas puedan evolucionar de forma independiente. Es útil cuando las implementaciones pueden variar de múltiples maneras.
- Facade: Proporciona una interfaz simplificada a un sistema complejo de clases, bibliotecas o frameworks. Reduce la complejidad al ocultar las interacciones internas.
- Flyweight: Reduce el uso de memoria al compartir objetos de manera eficiente, especialmente cuando muchos objetos tienen un estado similar.
