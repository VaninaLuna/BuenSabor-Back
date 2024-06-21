package com.example.buensaborback.services;

import com.example.buensaborback.domain.entities.Sucursal;

import java.util.List;

public interface SucursalService extends BaseService<Sucursal,Long> {
    List<Sucursal> findByEmpresa(Long empresaId);
}
