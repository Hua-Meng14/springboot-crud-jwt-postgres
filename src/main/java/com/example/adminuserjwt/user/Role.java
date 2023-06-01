package com.example.adminuserjwt.user;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.example.adminuserjwt.user.Permission.ADMIN_READ;
import static com.example.adminuserjwt.user.Permission.ADMIN_UPDATE;
import static com.example.adminuserjwt.user.Permission.ADMIN_CREATE;
import static com.example.adminuserjwt.user.Permission.ADMIN_DELETE;


@RequiredArgsConstructor
public enum Role {

//    USER(Collections.emplySet()),

    ADMIN(
            Set.of(
            ADMIN_READ,
            ADMIN_UPDATE,
            ADMIN_DELETE,
            ADMIN_CREATE
            )
    );

    @Getter
    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}

