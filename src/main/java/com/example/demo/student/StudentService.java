package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
public class StudentService {

    @GetMapping
	public List<Student> validateConnection() {
		return List.of(
				new Student(
					    1L,
						"Jheison",
						20,
						LocalDate.of(2024, Month.MARCH,
								21),
						"json@misena.edu.co")
						);
	}
}
