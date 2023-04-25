package com.neo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    private String userId;
    private String username;
    private long mobileNumber;
    private Integer age;
    private String email;
    private Address address;
}
