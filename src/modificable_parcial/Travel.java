
package modificable_parcial;

import java.util.Date;

public class Travel {
    private String start;
    private int duration;
    private Hotel hotel1;
    private BookedFlight reserva;
    

    public Travel(String start, int duration, Hotel hotel1, BookedFlight reserva) {
        this.start = start;
        this.duration = duration;
        this.hotel1 = hotel1;
        this.reserva = reserva;
    }

    public String getStart() {
        return start;
    }

    public int getDuration() {
        return duration;
    }

    public Hotel getHotel1() {
        return hotel1;
    }

    public BookedFlight getReserva() {
        return reserva;
    }
    

}
