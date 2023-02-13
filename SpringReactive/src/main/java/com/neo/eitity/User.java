package com.neo.eitity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
public class User {

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private boolean is_active = Boolean.FALSE;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	private LocalDateTime create_date;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	private LocalDateTime update_date;
}
