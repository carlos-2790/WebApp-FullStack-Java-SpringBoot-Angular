package com.spring.boot.backend.apirest.models.dao;

import com.spring.boot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao  extends CrudRepository<Cliente,Long> {



}
