package bai_tap_oop.oop1;

import java.util.Scanner;

public class Vehicle {
    private int capacity;
    private int price;

    public Vehicle (){

    }

    public Vehicle(int capacity, int price) {
        this.capacity = capacity;
        this.price = price;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getVat(){
        float vat ;
        if(this.getCapacity()<100){
            vat = this.price/100;
        }else if(this.getCapacity()>=100&&this.getCapacity()<200){
            vat = this.price/100*3;
        }else {
            vat = this.price/100*5;
        }
        return vat;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
