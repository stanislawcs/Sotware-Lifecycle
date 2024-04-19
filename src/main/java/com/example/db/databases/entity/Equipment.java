package com.example.db.databases.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "equipments")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "serialNumber")
public class Equipment {
    @Id
    private String serialNumber;
    private String type;
    private String state;
    private int yearOfRelease;
    private String name;
    @ManyToMany(mappedBy = "equipments")
    @ToString.Exclude
    private List<Service> services = new ArrayList<>();
}
