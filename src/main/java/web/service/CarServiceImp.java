package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    private static int ID;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++ID, "Car1", "colour1"));
        cars.add(new Car(++ID, "Car2", "colour2"));
        cars.add(new Car(++ID, "Car3", "colour3"));
        cars.add(new Car(++ID, "Car4", "colour4"));
        cars.add(new Car(++ID, "Car5", "colour5"));

    }

    @Override
    public List<Car> show(int count) {
        return count >= 5 ? cars : cars.stream().limit(count).collect(Collectors.toList());
    }
}
