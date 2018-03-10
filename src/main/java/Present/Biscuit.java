package Present;

/**
 * Create by Zubritskiy Dmitriy on 10.03.2018
 * @author Zubritskiy Dmitriy
 *
 */

public class Biscuit extends Present{
    private String filling;

    public Biscuit(String name, Double weight, Double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Biscuit (" + super.toString() + ", filling: " + filling + ")";
    }
}
