package es.jsomoza.onetoone;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LicenseRepository extends CrudRepository<License, Long> {
	List<License> findBySince(Date date);
	License findByBar(Bar bar);
}
