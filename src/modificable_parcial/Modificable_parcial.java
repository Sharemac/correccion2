
package modificable_parcial;

import java.util.Scanner;


public class Modificable_parcial {

    
    public static void main(String[] args) {
        TravelAgency aviatur;
        int a, durViaje, nrvSalida, nrvLlegada;
        String nameAgency, nameHotel, dirHotel, dateViaje, airSalida, airLlegada, dateSalida, dateLlegada;
        Scanner sc = new Scanner(System.in);
        Travel travel[]= new Travel[10];
        System.out.println("Cual es el nombre de la Agencia: ");
        nameAgency = sc.nextLine();
        aviatur = new TravelAgency(nameAgency);
        System.out.println("Cuantos viajes desea ingresar: ");
        a = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<a; i++){
            System.out.println("¿Cual es el nombre del Hotel? ");
        nameHotel = sc.nextLine();
            System.out.println("¿Cual es la direccion del Hotel? ");
        dirHotel = sc.nextLine();
            System.out.println("Digite la fecha del viaje: ");
        dateViaje = sc.nextLine();
            System.out.println("Digite la duracion del viaje (en minutos): ");
        durViaje = sc.nextInt();
            System.out.println("Cual es el Aeropuerto de salida: ");
        airSalida = sc.nextLine();
        sc.nextLine();
            System.out.println("Cual es el Aeropuerto de llegada: ");
        airLlegada = sc.nextLine();
        System.out.println("Digite los datos de la reserva de salida:\nNumero de reserva del vuelo");
        nrvSalida = sc.nextInt();
        sc.nextLine();
        System.out.println("Fecha de salida");
        dateSalida = sc.nextLine();
        System.out.println("Digite los datos de la reserva de llegada:\nNumero de reserva del vuelo");
        nrvLlegada = sc.nextInt();
        sc.nextLine();
        System.out.println("Fecha de llegada");
        dateLlegada = sc.nextLine();
        
        
        Hotel hotel = new Hotel(nameHotel, dirHotel);
        Airport airsalida = new Airport(airSalida);
        Airport airllegada = new Airport(airLlegada);
        BookedFlight reserva = new BookedFlight(nrvSalida, nrvLlegada , dateSalida, dateLlegada, airsalida, airllegada );
        travel[i]= new Travel(dateViaje, durViaje, hotel, reserva);
        
        }
   aviatur.ListarViajes(a, travel);
            /*System.out.println(airSalida);
            System.out.println(airLlegada);
            System.out.println(airsalida);
            System.out.println(airllegada);*/
    }
     /*  

        
        TravelAgency aviatur = new TravelAgency("Aviatur");
        Hotel fon = new Hotel("Fontanar","Cra 21 a # 159 a - 28" );
        Travel rionegro = new Travel("22/03/2017", 30, fon);
        Airport salida = new Airport("Jose Maria Cordoba");
        Airport llegada = new Airport("El Dorado");
        BookedFlight reserva = new BookedFlight(1345, 1411, "22/03/2017", "22/03/2017",salida, llegada);
       aviatur.ListarViajes( reserva, llegada, salida);*/
    }
    

