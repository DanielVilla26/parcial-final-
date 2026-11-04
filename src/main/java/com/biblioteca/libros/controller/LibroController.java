package com.biblioteca.libros.controller;

import com.biblioteca.libros.entity.Libro;
import com.biblioteca.libros.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public ResponseEntity<Libro> crear(@RequestBody Libro libro) {
        Libro libroGuardado = libroService.guardar(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(libroGuardado);
    }

    @GetMapping
    public ResponseEntity<List<Libro>> listar() {
        List<Libro> libros = libroService.listar();
        return ResponseEntity.ok(libros);
    }
}
