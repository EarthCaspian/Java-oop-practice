package carsWithNLayeredApp.dataAccess;

import carsWithNLayeredApp.entities.Car;

public class JdbcCarDao implements CarDao{
    public void add(Car car){
        // db access codes only
        System.out.println("Entry added into db using JDBC.");
    }

    @Override
    public void view(Car car) {
        System.out.println("Viewed db using JDBC.");
    }

    @Override
    public void update(Car car) {
        System.out.println("Updated db using JDBC.");
    }

    @Override
    public void delete(Car car) {
        System.out.println("Deletion from db using JDBC.");
    }
}
