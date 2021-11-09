package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int limitPriceMax;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String name, int limitPriceMax) {
        this.name = name;
        this.limitPriceMax = limitPriceMax;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= limitPriceMax) {
            cars.add(car);
            return true;
        }
        else return false;
    }

    public double sumCarPrice() {
        double allCarsPrice = 0;
        for (Car actualCar : cars) {
            allCarsPrice += actualCar.getPrice();
        }
        return allCarsPrice;
    }

    public String getName() {
        return name;
    }

    public int getLimitPriceMax() {
        return limitPriceMax;
    }

    public List<Car> getCarsForSell() {
        return cars;
    }
}