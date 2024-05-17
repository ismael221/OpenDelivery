package com.delivery.inc.model.merchant;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class ServiceTiming {

    @Enumerated(EnumType.STRING)
    private Timing timing;
    private Schedule schedule;

}
