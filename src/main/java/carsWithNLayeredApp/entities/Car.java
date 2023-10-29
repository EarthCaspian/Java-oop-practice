package carsWithNLayeredApp.entities;

public class Car extends BaseVehicle implements Vehicle {
    private int id;
    private String unitName;
    private double unitPrice;


    public Car(String brandName, String modelName, String productionYear) {
        super(brandName,modelName,productionYear);
    }

    public Car(String brandName, String modelName, String productionYear,int id, String unitName, double unitPrice) {
        super(brandName,modelName,productionYear);
        this.id = id;
        this.unitName = unitName;
        this.unitPrice = unitPrice;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return unitName;
    }

    public void setName(String unitName) {
        this.unitName = unitName;
    }


    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public void engineOn(Car car) {

    }

    @Override
    public void accelerate(Car car) {

    }

    @Override
    public void breaks(Car car) {

    }

    @Override
    public void electronics(Car car) {

    }


}
