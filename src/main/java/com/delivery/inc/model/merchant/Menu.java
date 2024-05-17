package com.delivery.inc.model.merchant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;

import javax.validation.constraints.NotNull;
import java.sql.Types;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID id;

    @NotNull
    private String name;

    private String description;

    @NotNull
    private String externalCode;

    private String disclaimer;

    private String disclaimerURL;

    @NotNull
    private List<UUID> categoryId;
}
