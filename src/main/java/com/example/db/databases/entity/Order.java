package com.example.db.databases.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "orders")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Order {
    @Id
    @GeneratedValue
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    private UUID id;
    private LocalDateTime date;
    private BigDecimal amount;
    private String status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "client_id",
            foreignKey =
            @ForeignKey(name = "fk_orders_users")
    )
    @ToString.Exclude
    private Client client;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "orders_services",
            foreignKey =
            @ForeignKey(name = "fk_orders_services_orders"),
            inverseForeignKey =
            @ForeignKey(name = "fk_orders_services_services")
    )
    @ToString.Exclude
    private List<Service> services = new ArrayList<>();
}
