package com.sergio.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sergio.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
