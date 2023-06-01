package com.example.adminuserjwt.user;

import com.example.adminuserjwt.token.Token;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Token> tokens;

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return role.getAuthorities();
//    }
//
//    @Override
//    public String getPassword() {return password;}
//
//    @Override
//    public String getEmail() { return email;}
//
//    @Override
//    public boolean isAccountNonExpired() {return true;}
//
//    @Override
//    public boolean isAccountNonLocked() {return true;}
//
//    @Override
//    public boolean isCredentialsNonExpired() {return true;}
//
//    @Override
//    public boolean isEnabled() {return true;}

}
