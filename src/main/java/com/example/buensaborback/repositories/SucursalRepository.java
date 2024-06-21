package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.Sucursal;

import java.util.List;

public interface SucursalRepository extends BaseRepository<Sucursal,Long> {
    List<Sucursal> findByEmpresaId(Long empresaId);
//    @Query("SELECT p FROM Provincia p WHERE p.pais.id = ?1")
//    List<Provincia> getProvinciasPorPais(Long id);
}
