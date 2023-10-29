package carsWithNLayeredApp.business;

import carsWithNLayeredApp.core.logging.Logger;
import carsWithNLayeredApp.entities.Car;
import carsWithNLayeredApp.entities.Vehicle;

import java.util.List;
import java.util.Objects;

public class CarStatus {
    private Car car;
    private List<Logger> loggers;

    public CarStatus(List<Logger> loggers){
        this.loggers = loggers;
    }

    /*public CarStatus(Car car, List<Logger> loggers) {
        this.car = car;
        this.loggers = loggers;
    }*/

    public void engineOn(Car car) {
        car.engineOn(car);
        System.out.println(car.getBrandName() + " brand " + car.getModelName() + " model car's engine turns on as expected.");
        for (Logger logger : loggers) {
            logger.log("An engine test has been performed for " + car.getBrandName()+ " brand "+ car.getModelName() + " model car.");
        }
    }

    public void accelerate(Car car) {
        car.accelerate(car);
        System.out.println(car.getBrandName() + " brand " + car.getModelName() + " model car's acceleration works as expected.");
        for (Logger logger : loggers) {
            logger.log("An acceleration test has been performed for " + car.getBrandName()+ " brand "+ car.getModelName() + " model car.");
        }
    }

    public void breaks(Car car) {
        car.breaks(car);
        System.out.println(car.getBrandName() + " brand " + car.getModelName() + " model car's breaking systems works  as expected.");
        for (Logger logger : loggers) {
            logger.log("An break test has been performed for " + car.getBrandName()+ " brand "+ car.getModelName() + " model car.");
        }
    }

    public void electronics(Car car) throws Exception {
        car.electronics(car);
        if(Objects.equals(car.getBrandName(), "Cadillac")) {
            throw new Exception(car.getBrandName() + " brand cars do not have electronic components.");
        }
        System.out.println(car.getBrandName() + " brand " + car.getModelName() + " model car's electronics works as expected.");
        for (Logger logger : loggers) {
            logger.log("An electronics test has been performed for " + car.getBrandName()+ " brand "+ car.getModelName() + " model car.");
        }
    }
}
