
package modificable_parcial;

import java.util.Date;


public class BookedFlight {
    private int flightNumbers;
    private int flightNumberl;
    private String departure;
    private String arrival;
    private Airport airllegada;
    private Airport airsalida;
    
public BookedFlight(){
    
}
public BookedFlight(int j, int k, String departure, String arrival, Airport l,Airport m ){
    
    this.flightNumbers = j;
    this.flightNumberl = k;
    this.departure = departure;
    this.arrival = arrival;
    this.airllegada = l;
    this.airsalida = m;
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
