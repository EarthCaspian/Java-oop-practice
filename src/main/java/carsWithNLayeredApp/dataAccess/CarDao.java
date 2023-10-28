package carsWithNLayeredApp.dataAccess;

import carsWithNLayeredApp.entities.Car;

public interface CarDao {
    void add(Car car);
    void view(Car car);
    void update(Car car);
    void delete(Car car);
}
