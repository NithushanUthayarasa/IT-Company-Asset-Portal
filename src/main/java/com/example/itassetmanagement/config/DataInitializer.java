package com.example.itassetmanagement.config;

import com.example.itassetmanagement.model.Employee;
import com.example.itassetmanagement.model.enums.EmployeeStatus;
import com.example.itassetmanagement.model.enums.Role;
import com.example.itassetmanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepo;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public DataInitializer(EmployeeRepository employeeRepo, PasswordEncoder passwordEncoder) {
        this.employeeRepo = employeeRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DATA INITIALIZATION STARTED...");

        // Only run ONCE when DB is completely empty (first ever run)
        if (employeeRepo.count() == 0) {

            Employee admin = Employee.builder()
                    .email("admin@company.com")
                    .fullName("System Administrator")
                    .password(passwordEncoder.encode("ChangeMe123!"))  // Stronger default
                    .role(Role.ADMIN)
                    .department("IT")
                    .status(EmployeeStatus.APPROVED)
                    .build();

            employeeRepo.save(admin);

            System.out.println("DEFAULT ADMIN CREATED");
            System.out.println("Email   : admin@company.com");
            System.out.println("Password: ChangeMe123!");
            System.out.println("CHANGE THIS PASSWORD IMMEDIATELY AFTER FIRST LOGIN!");
        }

        System.out.println("DATA INITIALIZATION COMPLETED");
    }
}