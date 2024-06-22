package com.example.buensaborback.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class PromocionDetalle extends Base {

    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "promocion_id")
    @JsonBackReference
    private Promocion promocion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idArticulo")
    private Articulo articulo;
}
