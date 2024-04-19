package com.example.db.databases.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "specialization")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id", "name"})
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String duties;
    private String name;
    @OneToMany(mappedBy = "specialization")
    @ToString.Exclude
    private List<Employee> employees;
}
