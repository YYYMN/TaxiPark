package by.novikau.taxipark.service.driver;

import by.novikau.taxipark.entity.Driver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface DriverService {

	List<Driver> getAllDrivers();

	Optional<Driver> getDriverById(int id);

	Driver createDriver(Driver driver);

	Driver updateDriver(Driver driver);

	void deleteDriverById(int id);

	Page<Driver> paginationFindAll(Pageable pageable);
}
