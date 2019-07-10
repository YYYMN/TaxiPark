package by.novikau.taxipark.service;

import by.novikau.taxipark.entity.Driver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DriverService {
    List<Driver> getAllDrivers();
    Driver getDriverById(int id);
    Driver createDriver(Driver driver);
    Driver updateDriver(Driver driver);
    void deleteDriverById(int id);
    Page<Driver> paginationFindAll(Pageable pageable);
}
