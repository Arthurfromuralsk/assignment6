package kz.aitu.oop.assignment6;

public class RoadLogistics extends Logistics{
    public Transport createTransport() {return new Truck();};
    public void planDelivery () {
        System.out.println("I choose road delivery because the delivery address is not far away");
    };
}

