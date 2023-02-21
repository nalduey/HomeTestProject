package com.sealed.parkinglot.repository;

import com.sealed.parkinglot.model.SpotControlActivity;
import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

@Repository
public interface SpotControlActivityRepository extends JpaRepository<SpotControlActivity, Long> {

}
