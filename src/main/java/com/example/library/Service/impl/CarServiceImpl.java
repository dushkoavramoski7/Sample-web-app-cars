package com.example.library.Service.impl;

import com.example.library.Model.Car;
import com.example.library.Repository.CarRepository;
import com.example.library.Service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAll() {
        List<Car> cars = this.carRepository.findAll();
        return  cars;
    }
}