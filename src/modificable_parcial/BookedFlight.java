
package modificable_parcial;

import java.util.Date;


public class BookedFlight {
    private int flightNumbers;
    private int flightNumberl;
    private String departure;
    private String arrival;
    private Airport[] air = new Airport[2];
    private Airport airllegada;
    private Airport airsalida;
    
public BookedFlight(){
    
}
public BookedFlight(int j, int k, String departure, String arrival, Airport airsalida, Airport airllegada ){
    
    this.flightNumbers = j;
    this.flightNumberl = k;
    this.departure = departure;
    this.arrival = arrival;
    this.airllegada = airllegada;
    this.airsalida = airsalida;
}

    public int getFlightNumbers() {
        return flightNumbers;
    }
    public int getFlightNumberl(){
        return flightNumberl;
    }

    public Airport getAirllegada() {
        return airllegada;
    }

    public Airport getAirsalida() {
        return airsalida;
    }


}
