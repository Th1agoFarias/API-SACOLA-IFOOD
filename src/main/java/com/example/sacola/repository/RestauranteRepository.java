package com.example.sacola.repository;

import com.example.sacola.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository <Restaurante, Long> {
}
