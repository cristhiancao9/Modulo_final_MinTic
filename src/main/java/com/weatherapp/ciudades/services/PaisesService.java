package com.weatherapp.ciudades.services;

import java.util.List;

import com.weatherapp.ciudades.models.PaisesModel;
import com.weatherapp.ciudades.repositories.PaisesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PaisesService {
    @Autowired // Instancia del repositorio
    PaisesRepository paisesRepository; // Variable que hace referencia al repositorio

    // Metodo para guardar datos del pais
    public void guardarPaises(PaisesModel paises) {
        this.paisesRepository.save(paises);
    }

    // Método para listar los paises
    public List<PaisesModel> obtenerPaises() {
        return this.paisesRepository.findAll();
    }
}
