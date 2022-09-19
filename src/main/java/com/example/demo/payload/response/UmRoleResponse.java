package com.example.demo.payload.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class UmRoleResponse {
    private Integer roleId;
    private String name;
    private String status;
    private Collection<UmUserResponse> umUserCollection;

    public UmRoleResponse() {
    }
}
