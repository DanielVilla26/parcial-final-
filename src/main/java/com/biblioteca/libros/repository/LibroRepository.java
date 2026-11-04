package com.biblioteca.libros.repository;

import com.biblioteca.libros.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
