package com.example.EmpolyeeAddress.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Empolyee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String firstName;
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
