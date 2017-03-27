
package modificable_parcial;

public class TravelAgency {
    private String name;
    private Hotel hoteles;
    private Travel travels;
    private Airport airports;
    
public TravelAgency(String name){
    this.name = name;
    this.hoteles = hoteles;
    this.travels = travels;
    this.airports = airports;
}

    public String getName() {
        return name;
    }

public void ListarViajes( int a , Travel travel[]){
   for(int i = 0; i < a; i++){
       System.out.println("Viaje "+ (i+1) + "\nNumero de vuelo reserva salida:"+ travel[i].getReserva().getFlightNumbers()
            +"\nAeropuerto Salida: "+ travel[i].getReserva().getAirsalida());
        System.out.println("Numero de vuelo reserva llegada:" +travel[i].getReserva().getFlightNumberl()
            +"\nAeropuerto Llegada: " + travel[i].getReserva().getAirllegada());
   }
   
}
}
