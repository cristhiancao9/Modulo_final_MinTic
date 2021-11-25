package com.weatherapp.ciudades.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.weatherapp.ciudades.exceptions.CustomException;
import com.weatherapp.ciudades.models.PaisesModel;
import com.weatherapp.ciudades.services.PaisesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Definimos que el controlador es de tipo REST
@RequestMapping("/api") // El Path principal
public class PaisesController {

    @Autowired // Instalacia del servicio
    PaisesService equipoService;

    @PostMapping("/paises") // Define la petición HTTP con la que ejecutará el método (POST) y El path
                            // (/api/ciudades)
    public ResponseEntity<Map<String, String>> guardar(@Valid @RequestBody PaisesModel paises, Errors error) {
        // Verificamos si existe un error
        if (error.hasErrors()) {
            throwError(error);
        }
        // Recibimos los datos por el body de la petición
        this.PaisesService.guardarPaises(paises); // Invocamos el metodo creado en el servicio
        Map<String, String> respuesta = new HashMap<>();// Creamos el map para la respuesta al cliente
        respuesta.put("mensaje", "Se agregó los paises correctamente"); // Se agrega la respuesta que se quiere enviar
        respuesta.put("estado", "true");
        return ResponseEntity.ok(respuesta); // Y se retorna esa respuesta
    }

    @GetMapping("/paises") // Define la petición HTTP con la que ejecutará el método (GET)
    public List<PaisesModel> mostrar() {
        // Invocamos el metodo creado en el servicio
        return this.PaisesService.obtenerPaises();
    }

    // Método para el manejo de errores
    public void throwError(Errors error) {
        String mensaje = "";
        int index = 0;
        for (ObjectError e : error.getAllErrors()) {
            if (index > 0) {
                mensaje += " | ";
            }
            mensaje += String.format("Parametro: %s - Mensaje: %s", e.getObjectName(), e.getDefaultMessage());
        }
        throw new CustomException(mensaje);
    }
}
