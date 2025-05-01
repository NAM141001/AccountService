

package com.example.AccountService.dto;

import java.util.Set;

import lombok.Data;

@Data
public class AccountDTO {
    private Long id;

    private String name;

    private String password;

    private String username;

    private Set<String> roles;
}
