package com.example.demo.payload.response;

import com.example.demo.entity.UmRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UmUserResponse {
    private Long userId;
    private String firstName;
    private String lastName;
    private String mobile;
    private String roleName;

    public UmUserResponse() {
    }
}
