package com.ejemplo.ExamenParcial.model;
import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    
    @Column(name = "nota", precision = 5, scale = 2)
    private BigDecimal nota;
}