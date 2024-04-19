package com.example.db.databases.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "clients")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "passportNumber")
public class Client {
    @Id
    private String passportNumber;
    @Column(name = "fullname")
    private String name;
    private int age;
    private String phoneNumber;
    @OneToMany(
            mappedBy = "client",
            fetch = FetchType.LAZY
    )
    @ToString.Exclude
    private List<Order> orders;
}
