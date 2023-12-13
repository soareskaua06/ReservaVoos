/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reservavoos;

/**
 *
 * @author aluno tds
 */

public class ReservaVoos {
    private String origin;
    private String destination;
    private int date;
    private int availableSeats;

    public ReservaVoos(String origin, String destination, int date, int totalSeats) {
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.availableSeats = totalSeats;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getDate() {
        return date;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void reserveSeats(int numberOfSeats) {
        if (numberOfSeats > 0 && numberOfSeats <= availableSeats) {
            availableSeats -= numberOfSeats;
            System.out.println("Reserva bem-sucedida para " + numberOfSeats + " assentos.");
        } else {
            System.out.println("Falha na reserva. Assentos insuficientes ou quantidade inválida.");
        }
    }

    public void cancelReservation(int numberOfSeats) {
        int totalSeats = 0;
        if (numberOfSeats > 0 && numberOfSeats <= (totalSeats - availableSeats)) {
            availableSeats += numberOfSeats;
            System.out.println("Cancelamento de reserva bem-sucedido para " + numberOfSeats + " assentos.");
        } else {
            System.out.println("Falha no cancelamento de reserva. Número inválido de assentos.");
        }
    }
}