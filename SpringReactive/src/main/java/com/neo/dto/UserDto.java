package com.neo.dto;

import java.time.LocalDateTime;

import com.neo.eitity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private String status;
	private int id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private LocalDateTime create_date;
	private LocalDateTime update_date;

	public static UserDto entityToDto(User user) {
		UserDto dto = new UserDto();
		dto.setId(user.getId());
		dto.setFirstName(user.getFirstName());
		dto.setLastName(user.getLastName());
		dto.setAge(user.getAge());
		dto.setEmail(user.getEmail());
		dto.setCreate_date(user.getCreate_date());
		dto.setUpdate_date(user.getUpdate_date());
		dto.setStatus("activated !!!");
		return dto;
	}
}
