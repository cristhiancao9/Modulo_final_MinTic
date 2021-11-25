package com.weatherapp.ciudades.repositories;

import com.weatherapp.ciudades.models.PaisesModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository // Etiqueta que asígna la interfaz como repositorio
public interface PaisesRepository extends MongoRepository<PaisesModel, String> {
    /*
     * La Clase MongoRepository contiene creados métodos de las funcione básica del
     * CRUD C - Crear o agregar datos R - Leer datos U - Actualizar D - Eliminar
     * datos
     */

}