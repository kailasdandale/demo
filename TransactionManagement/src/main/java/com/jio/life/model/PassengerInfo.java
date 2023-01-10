package com.jio.life.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerInfo {

	@Id
	@GeneratedValue
	private Long pId;
	private String name;
	private String email;
	private String source;
	private String Destination;
	@Temporal(TemporalType.DATE)
	private Date travelDate;
	private String pickupTime;
	private String arrivalTime;
	private double fare;
}
