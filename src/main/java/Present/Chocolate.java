package Present;

/**
 * Create by Zubritskiy Dmitriy on 10.03.2018
 * @author Zubritskiy Dmitriy
 *
 */

public class Chocolate extends Present {
    private Double calorific;

    public Chocolate(String name, Double weight, Double price, Double calorific) {
        super(name, weight, price);
        this.calorific = calorific;
    }

    public Double getCalorific() {
        return calorific;
    }

    public void setCalorific(Double calorific) {
        this.calorific = calorific;
    }

    @Override
    public String toString() {
        return "Cocolate (" + super.toString() + ", calorific: " + calorific + ")";
    }
}
