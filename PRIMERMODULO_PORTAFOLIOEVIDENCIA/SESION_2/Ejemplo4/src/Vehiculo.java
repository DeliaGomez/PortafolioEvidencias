//Clase base sellada:  solo las clases permitidad pueden extenderla
//Mejora le control de herencia en jerarquías cerradas
public sealed class Vehiculo permits Auto, Camion { }

//Clase Auto que extiende vehículo. Se declara como final para no permitir más herencia
final class Auto extends Vehiculo{ }

final class Camion extends Vehiculo{ }

//Esta clase no está en la lista de permits, por lo tanto, genra un error
//class Moto extends Vehiculo { }

//Comenta o descomenta la clase solo para mostrar el error.
//Error: 'Moto' is not allowed in the sealed hierarchy



