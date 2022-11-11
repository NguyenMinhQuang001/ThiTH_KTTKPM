package com.example.ShipperService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ShipperService.Model.ShipperOOD;

@Repository
public interface ShipperRepository extends JpaRepository<ShipperOOD, Integer>{

}
