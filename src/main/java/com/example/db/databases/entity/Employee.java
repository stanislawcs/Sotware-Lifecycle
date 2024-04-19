package com.example.db.databases.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "employees")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "passportNumber")
public class Employee {
    @Id
    private String passportNumber;
    private String name;
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(
            name = "specialization_id",
            foreignKey =
            @ForeignKey(name = "fk_employees_specializations")
    )
    @ToString.Exclude
    private Specialization specialization;
    @ManyToMany
    @JoinTable(
            name = "services_employees",
            foreignKey =
            @ForeignKey(name = "fk_services_employees_employees"),
            inverseForeignKey =
            @ForeignKey(name = "fk_services_employees_services")
    )
    @ToString.Exclude
    private List<Service> services = new ArrayList<>();
}
