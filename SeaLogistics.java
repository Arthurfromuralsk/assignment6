package kz.aitu.oop.assignment6;

public class SeaLogistics extends Logistics{
    public Transport createTransport() {return new Ship();};
    public void planDelivery () {
        System.out.println("I choose sea shipping because the shipping address is surrounded by the sea");};
}
