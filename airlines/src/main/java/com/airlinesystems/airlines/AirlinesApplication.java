package com.airlinesystems.airlines;

import com.airlinesystems.airlines.model.Admin;
import com.airlinesystems.airlines.service.AdminService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AirlinesApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(AirlinesApplication.class, args);
		Admin admin = (Admin) context.getBean(Admin.class);
		admin.setName("vitesh");
		admin.setEmail("vitesh@123");
		admin.setRole("analyst");
		admin.setPhone("987457123");
		AdminService adminService = context.getBean(AdminService.class);
		adminService.createAdmin(admin);
	}

}
