/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservavoos;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author aluno tds
 */
public class ReservationSystem {
     private List<ReservaVoos> flights;

    public ReservationSystem() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(ReservaVoos flight) {
        flights.add(flight);
    }

    public void reserveSeats(String origin, String destination, String date, int numberOfSeats) {
        for (ReservaVoos flight : flights) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)
                    && flights.getDate().equals(date)) {
                flight.reserveSeats(numberOfSeats);
                return;
            }
        }
        System.out.println("Falha na reserva. Voo não encontrado.");
    }

    public void cancelReservation(String origin, String destination, String date, int numberOfSeats) {
        for (ReservaVoos flight : flights) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)
                    && flights.getDate().equals(date)) {
                flight.cancelReservation(numberOfSeats);
                return;
            }
        }
        System.out.println("Falha no cancelamento de reserva. Voo não encontrado.");
        }
}

