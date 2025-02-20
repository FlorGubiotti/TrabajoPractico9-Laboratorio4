package com.example.TrabajoPractico9.controllers;


import com.example.TrabajoPractico9.entities.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends BaseEntity, ID extends Serializable> {

    ResponseEntity<?> getAll();
    ResponseEntity<?> getOne(@PathVariable ID id);

    ResponseEntity<?> save(@RequestBody E entity);

    ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);

    ResponseEntity<?> delete(@PathVariable ID id);
}