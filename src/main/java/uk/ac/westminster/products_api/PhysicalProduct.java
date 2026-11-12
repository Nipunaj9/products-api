package uk.ac.westminster.products_api;

// A PhysicalProduct iS-A Product beacause  that is single level iherintance belongs to this subclass
public class PhysicalProduct extends Product  {

    private double weightKg;
    private String dimensions;

    PhysicalProduct(){} // no-arg constructor

    PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions ){

        super(id,name,price);

    }
    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
