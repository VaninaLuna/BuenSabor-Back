package com.example.buensaborback.services;

import com.example.buensaborback.domain.entities.Sucursal;
import com.example.buensaborback.repositories.SucursalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServiceImpl extends BaseServiceImpl<Sucursal, Long> implements SucursalService {

    private SucursalRepository sucursalRepository;

    public SucursalServiceImpl(SucursalRepository sucursalRepository) {
        super(sucursalRepository);
        this.sucursalRepository = sucursalRepository;
    }

    @Override
    public List<Sucursal> findByEmpresa(Long empresaId) {
        return sucursalRepository.findByEmpresaId(empresaId);
    }
}
