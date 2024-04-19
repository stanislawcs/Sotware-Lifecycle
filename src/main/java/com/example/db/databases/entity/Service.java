package com.example.db.databases.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "services")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String price;
    @ManyToMany(
            mappedBy = "services",
            fetch = FetchType.LAZY
    )
    @ToString.Exclude
    private List<Order> orders = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "services_equipments",
            foreignKey =
            @ForeignKey(name = "fk_services_equipments_services"),
            inverseForeignKey =
            @ForeignKey(name = "fk_services_equipments_equipments")
    )
    @ToString.Exclude
    private List<Equipment> equipments = new ArrayList<>();
}
