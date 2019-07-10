package by.novikau.taxipark.service;

import by.novikau.taxipark.entity.Driver;
import by.novikau.taxipark.repo.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService{

    private final DriverRepo driverRepo;

    @Autowired
    public DriverServiceImpl(DriverRepo driverRepo) {
        this.driverRepo = driverRepo;
    }

    @Override
    public List<Driver> getAllDrivers() {
        return  driverRepo.findAll();

    }

    @Override
    public Driver getDriverById(int id) {
        return driverRepo.getOne(id);
    }

    @Override
    public Driver createDriver(Driver driver) {
        return driverRepo.save(driver);
    }

    @Override
    public Driver updateDriver(Driver driver) {
        return driverRepo.save(driver);
    }

    @Override
    public void deleteDriverById(int id) {
        driverRepo.deleteById(id);
    }
}
