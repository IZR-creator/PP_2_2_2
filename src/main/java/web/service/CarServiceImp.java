package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> ReturnOfCars(int numberOfCar) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "Toyota", "Camry"));
        carList.add(new Car(2, "Tesla", "Model5"));
        carList.add(new Car(3, "Volkswagen", "Beetle"));
        carList.add(new Car(4, "Citroën", "DS"));
        carList.add(new Car(5, "Ford", "ModelT"));
        if (numberOfCar >= 5) {
            return carList;
        } else {
            return carList.subList(0, numberOfCar);
        }
    }
}
