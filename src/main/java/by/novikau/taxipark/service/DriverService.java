package by.novikau.taxipark.service;

import by.novikau.taxipark.entity.Driver;

import java.util.List;

public interface DriverService {
    List<Driver> getAllDrivers();
    Driver getDriverById(int id);
    Driver createDriver(Driver driver);
    Driver updateDriver(Driver driver);
    void deleteDriverById(int id);
}
