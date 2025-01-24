package com.javabase.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name="st")
	public Student s() {
		
		Student st=new Student();
		st.setName("Name Is Aditya");
		st.setAddr("Shahada");
		st.setRoll(1);
		
		return st;
	}
}
