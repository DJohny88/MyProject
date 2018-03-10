package Present;

/**
 * Create by Zubritskiy Dmitriy on 10.03.2018
 * @author Zubritskiy Dmitriy
 *
 */

public class Jellybean extends Present {
    private String type;

    public Jellybean(String name, Double weight, Double price, String type) {
        super(name, weight, price);
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Jellybean (" + super.toString() + ", type: " + type + ")";
    }
}
