package com.delivery.inc.model.merchant;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

import java.util.List;


@Embeddable
public class BasicInfo {

    private String name;

    private String document;

    private String corporateName;

    private String description;

    private Double averageTicket;

    private Double averagePreparationTime;

    @Embedded
    private Price minOrderValue;

    @Pattern(regexp = "RESTAURANT")
    private String merchantType;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MerchantCategory> merchantCategories;

    @Embedded
    private Address address;

    @ElementCollection
    private List<String> contactEmails;

    @Embedded
    private ContactPhones contactPhones;

    @Embedded
    private Image logoImage;

    @Embedded
    private Image bannerImage;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private String createdAt;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AcceptedCard> acceptedCards;
}
