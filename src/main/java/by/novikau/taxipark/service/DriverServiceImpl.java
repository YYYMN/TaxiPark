package by.novikau.taxipark.service;

import by.novikau.taxipark.entity.Driver;
import by.novikau.taxipark.repo.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService{

    private final DriverRepo driverRepo;

    @Autowired
    public DriverServiceImpl(DriverRepo driverRepo) {
        this.driverRepo = driverRepo;
    }

    @Override
    public Page<Driver> paginationFindAll(Pageable pageable) {
        return driverRepo.findAll(pageable);
    }

    @Override
    public List<Driver> getAllDrivers() {
        return  driverRepo.findAll();

    }

    @Override
    public Optional<Driver> getDriverById(int id) {
        return driverRepo.findById(id);
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
