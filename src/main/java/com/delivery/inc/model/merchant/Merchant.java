package com.delivery.inc.model.merchant;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Merchant {


    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private LocalDateTime lastUpdate;


    @Min(500)
    @Max(86400)
    private int TTL;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    private BasicInfo basicInfo;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Service> services;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Menu> menus;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Category> categories;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemOffers> itemOffers;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item> items;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Options> optionsGroups;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Availability> availabilities;


}
