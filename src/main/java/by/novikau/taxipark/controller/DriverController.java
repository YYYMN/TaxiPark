package by.novikau.taxipark.controller;

import by.novikau.taxipark.entity.Driver;
import by.novikau.taxipark.service.DriverService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("driver")
public class DriverController {

    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }
    

    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }

    @GetMapping("{id}")
    public Driver getDriverById(@PathVariable("id") Integer id) {
        return driverService.getDriverById(id);
    }

    @PostMapping
    public Driver createDriver(@RequestBody Driver driver) {
        return driverService.createDriver(driver);
    }

    @PutMapping("{id}")
    public Driver updateDriver(
            @PathVariable("id") Driver driverFromDB,
            @RequestBody Driver driver) {
        BeanUtils.copyProperties(driver, driverFromDB, "id");
        return driverService.updateDriver(driverFromDB);
    }

    @DeleteMapping("{id}")
    public void deleteDriver(@PathVariable("id") Integer id) {
        driverService.deleteDriverById(id);
    }
}
