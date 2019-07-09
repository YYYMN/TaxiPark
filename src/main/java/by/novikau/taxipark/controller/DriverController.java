package by.novikau.taxipark.controller;

import by.novikau.taxipark.entity.Driver;
import by.novikau.taxipark.repo.DriverRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("driver")
public class DriverController {

    private final DriverRepo driverRepo;

    @Autowired
    public DriverController(DriverRepo driverRepo) {
        this.driverRepo = driverRepo;
    }


    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverRepo.findAll();
    }

    @GetMapping("{id}")
    public Driver getDriverById(@PathVariable("id") Driver driver) {
        return driver;
    }


    @PostMapping
    public Driver createDriver(@RequestBody Driver driver) {

         return driverRepo.save(driver);
    }

    @PutMapping("{id}")
    public Driver updateDriver(
            @PathVariable("id") Driver driverFromDB,
            @RequestBody Driver driver) {
        BeanUtils.copyProperties(driver, driverFromDB,"id");

        return driverRepo.save(driver);
    }

    @DeleteMapping("{id}")
    public void deleteDriver(@PathVariable("id") Driver driver) {
        driverRepo.delete(driver);
    }
}
