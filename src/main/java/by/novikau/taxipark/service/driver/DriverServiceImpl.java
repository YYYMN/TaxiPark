package by.novikau.taxipark.service.driver;

import by.novikau.taxipark.entity.Driver;
import by.novikau.taxipark.repo.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

	private final DriverRepository driverRepository;

	@Autowired
	public DriverServiceImpl(DriverRepository driverRepository) {

		this.driverRepository = driverRepository;
	}

	@Override
	public Page<Driver> paginationFindAll(Pageable pageable) {

		return driverRepository.findAll(pageable);
	}

	@Override
	public List<Driver> getAllDrivers() {

		return driverRepository.findAll();
	}

	@Override
	public Optional<Driver> getDriverById(int id) {

		return driverRepository.findById(id);
	}

	@Override
	public Driver createDriver(Driver driver) {

		return driverRepository.save(driver);
	}

	@Override
	public Driver updateDriver(Driver driver) {

		return driverRepository.save(driver);
	}

	@Override
	public void deleteDriverById(int id) {

		driverRepository.deleteById(id);
	}
}
