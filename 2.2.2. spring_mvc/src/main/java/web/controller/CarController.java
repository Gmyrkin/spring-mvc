package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService service;

    @GetMapping("/cars")
    public String printCars(ModelMap model, @RequestParam(required = false) Integer count) {
        List<Car> cars;
        if (count==null){
            cars = service.getCars(5);
        } else if (count>5) {
            cars = service.getCars(5);
        } else {
            cars = service.getCars(count);
        }
        model.addAttribute("carsFromList", cars);

        return "cars";
    }

}
