package com.devleonardo.crudclientes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FieldMessage {
    private String fieldName;
    private String message;
}