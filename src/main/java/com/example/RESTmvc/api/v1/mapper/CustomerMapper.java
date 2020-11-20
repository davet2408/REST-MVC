package com.example.RESTmvc.api.v1.mapper;

import com.example.RESTmvc.api.v1.model.CustomerDTO;
import com.example.RESTmvc.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
