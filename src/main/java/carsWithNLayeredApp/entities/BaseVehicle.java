package carsWithNLayeredApp.entities;

public abstract class BaseVehicle {
    public final String brandName;
    public final String modelName;
    public final String productionYear;

    public BaseVehicle(String brandName,String modelName, String productionYear){
        this.brandName = brandName;
        this.modelName = modelName;
        this.productionYear = productionYear;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getProductionYear() {
        return productionYear;
    }
}
