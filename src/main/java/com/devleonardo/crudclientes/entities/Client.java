package com.devleonardo.crudclientes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;


import java.time.LocalDate;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Não pode ser vazio")
    private String name;

    @Size(min = 11, message = "Descrição miníma de 11 caracteres")
    @NotBlank(message = "Campo requerido")
    private String cpf;

    @PositiveOrZero(message = "A renda deve ser zero ou positiva")
    private Double income;

    @PastOrPresent(message = "Não pode ser data futura")
    private LocalDate birthDate;

    @PositiveOrZero(message = "A contagem de crianças precisa ser zero ou positiva")
    private Integer children;
}