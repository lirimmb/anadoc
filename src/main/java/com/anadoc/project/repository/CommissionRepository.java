package com.anadoc.project.repository;

import com.anadoc.project.models.Commission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommissionRepository extends JpaRepository<Commission,Integer> {
}
