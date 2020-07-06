package com.ravi.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Supplier {
	
    @Id
    @NotNull
    @Column(name="supplier_Id")
	private Long supplierId;
    
    @NotEmpty
    @Column(name="supplier_Name")
	private String supplierName;
}
