package com.example.buensaborback.controller;

import com.example.buensaborback.domain.entities.Sucursal;
import com.example.buensaborback.services.SucursalServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sucursal")
@CrossOrigin(origins = "*")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalServiceImpl> {

    @GetMapping("/empresa/{id}")
    public ResponseEntity<?> getSucursalesPorEmpresa(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(servicio.findByEmpresa(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
}
