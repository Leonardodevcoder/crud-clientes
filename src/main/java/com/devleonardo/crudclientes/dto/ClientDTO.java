package com.devleonardo.crudclientes.dto;

import jakarta.validation.constraints.*;
import lombok.Data;


import java.time.LocalDate;

@Data
public class ClientDTO {

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