//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //pasajero y vuelo creado
        Pasajero pasajero1 = new Pasajero("Manuel", "98822");
        Vuelo vuelo1 = new Vuelo("UX98822", "España", "03:35");
        //reserva asiento
        if(vuelo1.reservarAsiento(pasajero1)){
            System.out.println("No fue posible realizar la reserva");
        }
        //mostrar itinerario
        System.out.println(vuelo1.obtenerItinerario());
        //cancelar reserva
        vuelo1.cancelarReserva();
        System.out.println("\n❌ Cancelando reserva...");
        //mostrar itinerario de nuevo
        System.out.println(vuelo1.obtenerItinerario());
        //reservar asiento para nuevo pasajero
        vuelo1.reservarAsiento("Lorena", "55293");
        //mostrar itinerario final
        System.out.println(vuelo1.obtenerItinerario());
    }
}