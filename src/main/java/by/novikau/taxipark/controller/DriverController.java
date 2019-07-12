package by.novikau.taxipark.controller;

import by.novikau.taxipark.entity.Driver;
import by.novikau.taxipark.exception.NotFoundException;
import by.novikau.taxipark.service.DriverService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("driver")
public class DriverController {

    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping("/pagination/{page}/{size}")
    public Page<Driver> getPaginationDrivers(@PathVariable Integer page, @PathVariable Integer size) {
        return driverService.paginationFindAll(PageRequest.of(page, size));
    }

    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }

    @GetMapping("{id}")
    public Driver getDriverById(@PathVariable("id") Integer id) {
        Optional<Driver> optionalDriver = driverService.getDriverById(id);
        return optionalDriver.orElseThrow(
                () ->
                new NotFoundException("Driver not found for id " + id));
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
