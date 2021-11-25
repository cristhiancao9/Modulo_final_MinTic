package com.weatherapp.ciudades.services;

import java.util.List;

import com.weatherapp.ciudades.models.CiudadesModel;
import com.weatherapp.ciudades.repositories.CiudadesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CiudadesService {
    @Autowired
    CiudadesRepository ciudadesRepository;

    public void guardarCiudades(CiudadesModel ciudades) {
        this.ciudadesRepository.save(ciudades);

    }

    public List<CiudadesModel> traerTodos() {
        return this.ciudadesRepository.findAll();
    }

}
