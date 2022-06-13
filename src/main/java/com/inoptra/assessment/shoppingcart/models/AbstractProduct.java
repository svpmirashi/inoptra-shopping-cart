package com.inoptra.assessment.shoppingcart.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "tblAbstractProduct", schema = "ProductMs")
public abstract class AbstractProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private Category category;

    private LocalDate createdBy;

    @Column(name = "created_date", columnDefinition = "DATE", nullable = false)
    private LocalDate createdDate;

    private LocalDate modifiedBy;

    @Column(name = "modified_date", columnDefinition = "DATE", nullable = false)
    private LocalDate modifiedDate;
}
