package com.airlinesystems.airlines.repo;

import com.airlinesystems.airlines.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {
}
