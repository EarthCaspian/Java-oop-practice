package carsWithNLayeredApp;

import carsWithNLayeredApp.business.CarManager;
import carsWithNLayeredApp.business.CarStatus;
import carsWithNLayeredApp.core.logging.DatabaseLogger;
import carsWithNLayeredApp.core.logging.FileLogger;
import carsWithNLayeredApp.core.logging.Logger;
import carsWithNLayeredApp.core.logging.MailLogger;
import carsWithNLayeredApp.dataAccess.HibernateCarDao;
import carsWithNLayeredApp.dataAccess.JdbcCarDao;
import carsWithNLayeredApp.entities.Car;
import carsWithNLayeredApp.entities.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car("Volvo","V90","2020",1,"OceanRace",45000);
        Car car2 = new Car("BMW", "X5", "2023",2,"X5M",113500);
        Car car3 = new Car("Cadillac", "ElDorado","1976",3,"76", 33000);


        // Logs

        //List<Logger> loggers = new ArrayList<Logger>(List.of(new DatabaseLogger(),new FileLogger(),new MailLogger()));
        List<Logger> loggers = new ArrayList<>(List.of(new DatabaseLogger()));

        //CarManager carManager = new CarManager(new JdbcCarDao(),loggers);
        CarManager carManager = new CarManager(new HibernateCarDao(),loggers);


        // CRUD TESTs

        carManager.add(car1);
        carManager.view(car2);
        //carManager.update(car1);
        carManager.delete(car1);


        // Vehicle Functionality Checks

        CarStatus carStatus = new CarStatus(loggers);

        carStatus.engineOn(car2);
        carStatus.breaks(car1);
        carStatus.accelerate(car2);
        //carStatus.electronics(car3);
    }
}