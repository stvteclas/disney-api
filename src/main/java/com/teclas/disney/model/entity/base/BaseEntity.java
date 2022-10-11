package com.teclas.disney.model.entity.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity extends AuditedEntity {

    @NotBlank( message = "Image cannot be blank" )
    @Size( max = 500, message = "Image url has maximum of 500 characters" )
    protected String imageUrl;
}

