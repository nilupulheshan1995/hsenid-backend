package com.example.demo.controller;

import com.example.demo.entity.UmRole;
import com.example.demo.payload.response.UmRoleResponse;
import com.example.demo.service.UmRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin
@RestController
@RequestMapping(path = "api/um")
public class UmController {

    @Autowired
    UmRoleService roleService;

    @GetMapping(path = "/getAll/roles")
    public ResponseEntity getAllRoles(){
        Collection<UmRoleResponse> allRoles = roleService.getAllRoles();
        return new ResponseEntity<>(allRoles, HttpStatus.OK);
    }
}
