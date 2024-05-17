package com.delivery.inc.model.merchant;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID id;

    private int index;

    private String name;

    private String description;

    @Embedded
    private Image image;

    private String externalCode;

    @Enumerated(EnumType.STRING)
    private Status status;

    private List<Item> availabilityId;

    private List<Item> itemOfferId;
}
