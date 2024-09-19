package com.gcorporation.cruddemoAdvancedMapping;

import com.gcorporation.cruddemoAdvancedMapping.dao.AppDAO;
import com.gcorporation.cruddemoAdvancedMapping.entity.Instructor;
import com.gcorporation.cruddemoAdvancedMapping.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.awt.*;

@SpringBootApplication
public class CruddemoAdvancedMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoAdvancedMappingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {

		return runner -> {
			//createInstructor(appDAO);
			//findInstructor(appDAO);
			deleteInstructor(appDAO);
		};
	}

	private void deleteInstructor(AppDAO appDAO) {

		int theId = 1;
		System.out.println("Deleting instructor id: " + theId);

		appDAO.deleteInstructorById(theId);
		System.out.println("Done!");
	}

	private void findInstructor(AppDAO appDAO) {

		int theId = 2;
		System.out.println("Finding instructor id: " + theId);

		Instructor tempInstructor = appDAO.findinstructorById(theId);

		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("the associated instructorDetail only: " + tempInstructor.getInstructorDetail());
	}

	private void createInstructor(AppDAO appDAO) {
		/*
		// create the instructor
		Instructor tempInstructor = new Instructor("Chad", "Darby", "luv2code.com");


		// create the instructor detail

		InstructorDetail tempInstructorDetail =
				new InstructorDetail("Luv 2 code",
						"http://youtube");
		*/

		// create the instructor
		Instructor tempInstructor = new Instructor("Madhu", "Patel", "madhuluv2code.com");


		// create the instructor detail

		InstructorDetail tempInstructorDetail =
				new InstructorDetail("Play Guitar",
						"http://youtube");

		// associate the objects

		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// save the instructor
		//
		// NOTE: this will ALSO save the details object
		// because of CascadeType.ALL
		//

		System.out.println("Saving instructor: " + tempInstructor);
		appDAO.save(tempInstructor);

		System.out.println("Done!");
	}

}
