package com.weatherapp.ciudades.repositories;

import com.weatherapp.ciudades.models.CiudadesModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadesRepository extends MongoRepository<CiudadesModel, String> {

}
