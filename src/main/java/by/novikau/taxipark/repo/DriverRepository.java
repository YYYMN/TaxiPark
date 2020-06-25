package by.novikau.taxipark.repo;

import by.novikau.taxipark.entity.Driver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

    @Override
    Page<Driver> findAll(Pageable pageable);
}
