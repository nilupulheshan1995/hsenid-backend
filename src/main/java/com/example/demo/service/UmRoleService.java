package com.example.demo.service;

import com.example.demo.entity.UmRole;
import com.example.demo.payload.response.UmRoleResponse;

import java.util.Collection;

public interface UmRoleService {
    Collection<UmRoleResponse> getAllRoles();
}
