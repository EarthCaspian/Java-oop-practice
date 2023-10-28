package carsWithNLayeredApp.dataAccess;

import carsWithNLayeredApp.entities.Car;

public class HibernateCarDao implements CarDao{
    public void add(Car car){
        System.out.println("Entry added into db using Hibernate.");
    }

    @Override
    public void view(Car car) {
        System.out.println("Viewed db using Hibernate.");
    }

    @Override
    public void update(Car car) {
        System.out.println("Updated db using Hibernate.");
    }

    @Override
    public void delete(Car car) {
        System.out.println("Deletion from db using Hibernate.");
    }
}
