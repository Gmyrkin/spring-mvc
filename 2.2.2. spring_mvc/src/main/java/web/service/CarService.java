package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    List<Car> cars = List.of(
            new Car("Opel", "red", 1),
            new Car("Volvo", "dark", 2),
            new Car("VAZ", "blue", 3),
            new Car("BMW", "yellow", 4),
            new Car("Honda", "white", 5)
    );

    public List<Car> getCars (int num){
        List<Car> numcar = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            numcar.add(cars.get(i));
        }
        return numcar;
    }


}
