package com.neo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "Please Enter Name")
	private String name;
	@NotNull(message = "Please Enter Email")
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",message = "Enter valid Email")
	private String email;
	@NotNull(message = "Please Enter MobileNumber")
	private String mobilenmber;
	@Temporal(TemporalType.DATE)
	//@JsonFormat(pattern = "dd/mm/yyyy")
	@NotNull(message = "Please Enter Date of Birth")
	private Date dateofbirth;

		
}
