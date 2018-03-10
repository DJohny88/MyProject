package Present;

/**
 * Create by Zubritskiy Dmitriy on 10.03.2018
 * @author Zubritskiy Dmitriy
 *
 */

public class Candy extends Present{

    private String brand;

    public Candy(String name, Double weight, Double price, String brand) {
        super(name, weight, price);
        this.brand = brand;
        }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Candy (" + super.toString() + ", brand: " + brand + ")";
    }
}
