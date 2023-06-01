package com.example.adminuserjwt.auth;

import com.example.adminuserjwt.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String username;
    private String lastname;
    private String email;
    private Role role;

}
