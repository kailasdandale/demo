package com.jio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "Name is Required")
	private String name;
	@NotNull(message = "Please Enter Email")
	@Email(message = "Please Enter Valid Email")
	private String email;
	@Min(18)
	@Max(60)
	@NotNull
	private int age;
	@NotNull(message = "Please Enter MobileNumber")
	private String mobileNumber;
	
}
