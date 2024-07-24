package practiceprob;

public class Ticket {
    private String departureCity;
    private String arrivalCity;
    private String flightNumber;
    private SeatAssignment seatAssignment;

    public static class SeatAssignment {
        private int row;
        private char seatLetter;

        public SeatAssignment(int row, char seatLetter) {
            this.row = row;
            this.seatLetter = seatLetter;
        }

    
        public int getRow() {
            return row;
        }

        public char getSeatLetter() {
            return seatLetter;
        }

       
        public void setRow(int row) {
            this.row = row;
        }

        public void setSeatLetter(char seatLetter) {
            this.seatLetter = seatLetter;
        }

   
        public String getSeatAssignment() {
            return row + String.valueOf(seatLetter);
        }
    }

    public Ticket(String departureCity, String arrivalCity, String flightNumber, SeatAssignment seatAssignment) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.flightNumber = flightNumber;
        this.seatAssignment = seatAssignment;
    }


    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public SeatAssignment getSeatAssignment() {
        return seatAssignment;
    }


    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSeatAssignment(SeatAssignment seatAssignment) {
        this.seatAssignment = seatAssignment;
    }

    public void printTicketDetails() {
        System.out.println("Ticket Details:");
        System.out.println("Departure City: " + departureCity);
        System.out.println("Arrival City: " + arrivalCity);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Seat Assignment: " + seatAssignment.getSeatAssignment());
    }


    public static void main(String[] args) {
     
        SeatAssignment seat1 = new SeatAssignment(12, 'A');
        SeatAssignment seat2 = new SeatAssignment(14, 'F');


        Ticket ticket1 = new Ticket("ahm", "mumbai", "AA123", seat1);
        Ticket ticket2 = new Ticket("delhi", "bengaluru", "UA456", seat2);

       
        ticket1.printTicketDetails();
        System.out.println();
        ticket2.printTicketDetails();
    }
}

