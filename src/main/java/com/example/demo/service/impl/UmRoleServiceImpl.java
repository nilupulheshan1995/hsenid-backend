package com.example.demo.service.impl;

import com.example.demo.entity.UmRole;
import com.example.demo.entity.UmUser;
import com.example.demo.payload.response.UmRoleResponse;
import com.example.demo.payload.response.UmUserResponse;
import com.example.demo.repository.UmRoleRepository;
import com.example.demo.service.UmRoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UmRoleServiceImpl implements UmRoleService {

    @Autowired
    UmRoleRepository repository;

    @Override
    public Collection<UmRoleResponse> getAllRoles() {
        ModelMapper mapper = new ModelMapper();
        ArrayList<UmRoleResponse> roles = new ArrayList<>();

        List<UmRole> umRoles = repository.findAll();
        for (UmRole umRole : umRoles) {
            UmRoleResponse roleResponse = mapper.map(umRole, UmRoleResponse.class);
            ArrayList<UmUserResponse> users = new ArrayList<>();
            for (UmUser umUser : umRole.getUmUserCollection()) {
                UmUserResponse userResponse = mapper.map(umUser, UmUserResponse.class);
                users.add(userResponse);
            }
            roleResponse.setUmUserCollection(users);
            roles.add(roleResponse);
        }
        //return umRoles;
        return roles;
    }
}
