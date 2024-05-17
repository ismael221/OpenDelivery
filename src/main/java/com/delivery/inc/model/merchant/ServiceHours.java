package com.delivery.inc.model.merchant;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ServiceHours {
    private UUID id;
    @Enumerated(EnumType.STRING)
    private List<WeekHours> weekHours;
    private List<HolydayHours> holydayHours;
}
