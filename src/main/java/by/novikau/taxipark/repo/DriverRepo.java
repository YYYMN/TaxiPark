package by.novikau.taxipark.repo;

import by.novikau.taxipark.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface DriverRepo extends JpaRepository<Driver, Integer> {
}
