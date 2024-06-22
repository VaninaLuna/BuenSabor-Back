package com.example.buensaborback.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class ImagenPromocion extends Base{
    private String url;

    @ManyToOne
    @JoinColumn(name = "promocion_id")
    @JsonBackReference
    private Promocion promocion;
}
