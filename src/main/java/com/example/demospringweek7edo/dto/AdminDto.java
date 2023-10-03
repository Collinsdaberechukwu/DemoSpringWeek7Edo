package com.example.demospringweek7edo.dto;

import com.example.demospringweek7edo.Enum.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminDto {
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private Roles category;
}
