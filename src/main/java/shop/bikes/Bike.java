package shop.bikes;

import behaviours.ICalculate;
import shop.Product;
import shop.components.*;

import java.util.ArrayList;

public abstract class Bike extends Product implements ICalculate {
    private Frame frame;
    private ArrayList<Tyre> tyres;
    private Crankset crankset;
    private ArrayList<Wheel> wheels;

    public Bike(Frame frame, Crankset crankset, int price) {
        super(price);
        this.frame = frame;
        this.tyres = new ArrayList<Tyre>();
        this.crankset = crankset;
        this.wheels = new ArrayList<Wheel>();
    }

    public Frame getFrame() {
        return frame;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public Crankset getCrankset() {
        return crankset;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setTyres(ArrayList<Tyre> tyres) {
        this.tyres = tyres;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }
    public int wheelsCount(){
        return wheels.size();
    }
    public void addWheel(Wheel wheel){
        if(wheelsCount() < 4){
            wheels.add(wheel);
        }
    }
    public int tyresCount(){
        return tyres.size();
    }

    public void addTyre(Tyre tyre){
        if(tyresCount() < 4){
            tyres.add(tyre);
        }
    }
    public void calculatePrice(){
        int total = 0;
        for(Wheel wheel : wheels){
            total += wheel.getPrice();
        }
        for(Tyre tyre : tyres){
            total += tyre.getPrice();
        }
        total += frame.getPrice();
        total += crankset.getPrice();
        this.price = total;
    }
}
