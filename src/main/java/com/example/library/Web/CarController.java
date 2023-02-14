package com.example.library.Web;

import com.example.library.Model.Car;
import com.example.library.Model.CarObjectDto;
import com.example.library.Repository.CarRepository;
import com.example.library.Service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;
    private final CarRepository carRepository;

    public CarController(CarService carService, CarRepository carRepository) {
        this.carService = carService;
        this.carRepository = carRepository;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("cars", this.carService.findAll());
        model.addAttribute("carObject", new CarObjectDto("", "", ""));
        return "cars";
    }

    @PostMapping("/add")
    public String submitForm(@ModelAttribute("carObject") CarObjectDto carObject, Model model) {
        this.carRepository.save(new Car(carObject.getName(), carObject.getModel(), carObject.getDescription()));
        return "redirect:/cars";
    }
}
