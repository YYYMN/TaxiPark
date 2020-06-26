package by.novikau.taxipark.controller;

import by.novikau.taxipark.entity.Driver;
import by.novikau.taxipark.service.driver.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> getAllDrivers() {

		var allDrivers = driverService.getAllDrivers();
		return ResponseEntity.ok(allDrivers);
	}

//	@GetMapping("{id}")
//	public Driver getDriverById(@PathVariable("id") Integer id) {
//
//		Optional<Driver> optionalDriver = driverService.getDriverById(id);
//		return optionalDriver.orElseThrow(() -> new NotFoundException("Driver not found for id " + id));
//	}
//
//	@PostMapping
//	public Driver createDriver(@RequestBody Driver driver) {
//
//		return driverService.createDriver(driver);
//	}
//
//	@PutMapping("{id}")
//	public Driver updateDriver(@PathVariable("id") Driver driverFromDB, @PathVariable("id") Integer id, @RequestBody Driver driver) {
//
//		if (driverFromDB == null) {
//			throw new NotFoundException("Driver not found for id " + id);
//		}
//		BeanUtils.copyProperties(driver, driverFromDB, "id");
//		return driverService.updateDriver(driverFromDB);
//	}
//
//	@DeleteMapping("{id}")
//	public void deleteDriver(@PathVariable("id") Integer id) {
//
//		if (!driverService.getDriverById(id).isPresent()) {
//			throw new NotFoundException("Driver not found for id " + id);
//		}
//		driverService.deleteDriverById(id);
//	}
//
//	@GetMapping("/pagination/{page}/{size}")
//	public Page<Driver> getPaginationDrivers(@PathVariable Integer page, @PathVariable Integer size) {
//
//		return driverService.paginationFindAll(PageRequest.of(page, size));
//	}
}
