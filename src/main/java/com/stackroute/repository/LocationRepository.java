package com.stackroute.repository;

import com.stackroute.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface LocationRepository extends JpaRepository<Location,Long> {
}
