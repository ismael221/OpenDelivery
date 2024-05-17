package com.delivery.inc.model.merchant;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.util.UUID;

@Data
@Entity
public class ItemOffers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID id;

    private String itemId;

    private String index;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Embedded
    private Price price;

}
