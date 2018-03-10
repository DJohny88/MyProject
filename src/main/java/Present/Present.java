package Present;

/**
 * Create by Zubritskiy Dmitriy on 10.03.2018
 * @author Zubritskiy Dmitriy
 *
 */

public abstract class Present {

    private String name;
    private Double weight;
    private Double price;

    public Present(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: " + name + ", weight: " + weight + ", price: " + price;
    }
}
