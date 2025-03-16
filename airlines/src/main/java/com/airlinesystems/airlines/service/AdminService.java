package com.airlinesystems.airlines.service;

import com.airlinesystems.airlines.model.Admin;
import com.airlinesystems.airlines.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepo adminRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll(); // No need to create new objects
    }

    public Optional<Admin> getAdminById(Long id) {
        return adminRepository.findById(id);
    }

    public Admin createAdmin(Admin adminDTO) {
        return adminRepository.save(adminDTO); // Directly save the DTO
    }

    public Admin updateAdmin(Long id, Admin adminDTO) {
        return adminRepository.findById(id).map(existingAdmin -> {
            existingAdmin.setName(adminDTO.getName());
            existingAdmin.setEmail(adminDTO.getEmail());
            existingAdmin.setPhone(adminDTO.getPhone());
            existingAdmin.setRole(adminDTO.getRole());
            return adminRepository.save(existingAdmin);
        }).orElseThrow(() -> new RuntimeException("Admin not found with id: " + id));
    }
}
