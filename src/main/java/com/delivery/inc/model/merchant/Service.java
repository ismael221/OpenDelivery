package com.delivery.inc.model.merchant;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;

import javax.validation.constraints.NotNull;
import java.sql.Types;
import java.util.UUID;

@Data
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JdbcTypeCode(Types.VARCHAR)
    private UUID id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ServiceType serviceType;

    @Embedded
    private ServiceTiming serviceTiming;

    @NotNull
    @JdbcTypeCode(Types.VARCHAR)
    private UUID menuId;

    private String targetAppId;

    @Embedded
    private ServiceArea serviceArea;

    @Embedded
    private ServiceHours serviceHours;
}
