package kz.aitu.oop.assignment6;

public class Main {

    public static void main(String[] args) {
        Logistics primary = createLogistics("Ship");
        Transport transport = primary.createTransport();
        primary.planDelivery();
        transport.deliver();
    }
    public static Logistics createLogistics(String transport){
        if (transport.equals("Truck")) {
            return new RoadLogistics();
        }
        if (transport.equals("Ship")) {
            return new SeaLogistics();
        }
        else
            return null;

    };

}
