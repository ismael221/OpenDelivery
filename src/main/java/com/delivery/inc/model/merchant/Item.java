package com.delivery.inc.model.merchant;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.util.UUID;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID id;

    private String name;

    private String description;

    private String externalCode;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Embedded
    private Image image;

    @Embedded
    private NutritionalInfo nutritionalInfo;

    private int serving;

    @Enumerated(EnumType.STRING)
    private Unit unit;

    private String ean;
}
