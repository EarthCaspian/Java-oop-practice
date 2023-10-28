package carsWithNLayeredApp.business;

import carsWithNLayeredApp.core.logging.Logger;
import carsWithNLayeredApp.dataAccess.CarDao;
import carsWithNLayeredApp.dataAccess.HibernateCarDao;
import carsWithNLayeredApp.dataAccess.JdbcCarDao;
import carsWithNLayeredApp.entities.Car;

import java.util.List;
import java.util.Objects;

public class CarManager {
    private CarDao carDao;
    private List<Logger> loggers;

    public CarManager(CarDao carDao, List<Logger> loggers) {
        this.carDao = carDao;
        this.loggers = loggers;
    }

    public void add(Car car) throws Exception{
        // business rules
        if(car.getUnitPrice()<500) {
            throw new Exception("Individual unit price cannot be lower than 500.");
        }
        carDao.add(car);

        for (Logger logger : loggers) {
            logger.log(car.getName() + " model car was added.");
        }
    }

    public void view(Car car) {
        carDao.view(car);
        for (Logger logger : loggers) {
            logger.log(car.getName() + " model car was viewed.");
        }
    }

    public void update(Car car) throws Exception {
        if(Objects.equals(car.getName(), "Volvo")) {
            throw new Exception(car.getName() + " model cars require inspection before tampering.");
        }
        carDao.update(car);
        for (Logger logger : loggers) {
            logger.log(car.getName() + " model car was updated.");
        }
    }

    public void delete(Car car) {
        carDao.delete(car);
        for (Logger logger : loggers) {
            logger.log(car.getName() + " model car was removed from the system.");
        }
    }
}
