package com.example.sacola.repository;

import com.example.sacola.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SacolaRepository extends JpaRepository<Sacola,Long> {
}
