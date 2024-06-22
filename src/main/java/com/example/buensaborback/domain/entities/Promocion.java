package com.example.buensaborback.domain.entities;

import com.example.buensaborback.domain.entities.enums.TipoPromocion;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class Promocion extends Base {

    private String denominacion;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaDesde;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
//    @Enumerated(EnumType.STRING)
    private String tipoPromocion;

    @OneToMany(mappedBy = "promocion", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    @JsonManagedReference
    protected Set<ImagenPromocion> imagenes = new HashSet<>();

    @ManyToMany(mappedBy = "promociones", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("promociones")
    @Builder.Default
    @JsonBackReference
    private Set<Sucursal> sucursales = new HashSet<>();

    @OneToMany(mappedBy = "promocion", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    @JsonManagedReference
    private List<PromocionDetalle> promocionDetalles = new ArrayList<>();
}
