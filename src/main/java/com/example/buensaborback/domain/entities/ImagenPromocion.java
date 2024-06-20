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
    @Lob
    @Column(name = "imagen", columnDefinition = "LONGBLOB")
    private byte[] imagen;
    private String imagenPath;

    @ManyToOne
    @JoinColumn(name = "promocion_id")
    @JsonBackReference(value = "imagen_promocion")
    private Promocion promocion;
}
