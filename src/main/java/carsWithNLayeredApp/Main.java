package carsWithNLayeredApp;

import carsWithNLayeredApp.business.CarManager;
import carsWithNLayeredApp.core.logging.DatabaseLogger;
import carsWithNLayeredApp.core.logging.FileLogger;
import carsWithNLayeredApp.core.logging.Logger;
import carsWithNLayeredApp.core.logging.MailLogger;
import carsWithNLayeredApp.dataAccess.HibernateCarDao;
import carsWithNLayeredApp.dataAccess.JdbcCarDao;
import carsWithNLayeredApp.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car(1, "Volvo",550);
        Car car2 = new Car(2,"BMW",700);

        //List<Logger> loggers = new ArrayList<Logger>(List.of(new DatabaseLogger(),new FileLogger(),new MailLogger()));
        List<Logger> loggers = new ArrayList<>(List.of(new DatabaseLogger()));

        //CarManager carManager = new CarManager(new JdbcCarDao(),loggers);
        CarManager carManager = new CarManager(new HibernateCarDao(),loggers);

        carManager.add(car1);
        carManager.view(car2);
        //carManager.update(car1);
        carManager.delete(car1);
    }
}