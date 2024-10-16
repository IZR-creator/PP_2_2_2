package web.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String webTableCar(@RequestParam(defaultValue="5") Integer count, ModelMap model) {
		CarService carService = new CarServiceImp();
		List<Car> carsList1 = carService.ReturnOfCars(count);
		model.addAttribute("carsList1", carsList1);
		return "cars";
    }
}
