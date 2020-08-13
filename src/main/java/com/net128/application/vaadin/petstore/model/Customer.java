package com.net128.application.vaadin.petstore.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends Identifiable {
    private String firstName = "";
    private String lastName = "";
}
