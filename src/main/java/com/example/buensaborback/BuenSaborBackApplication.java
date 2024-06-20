package com.example.buensaborback;

import com.example.buensaborback.domain.entities.*;
import com.example.buensaborback.domain.entities.enums.RolName;
import com.example.buensaborback.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@SpringBootApplication
public class BuenSaborBackApplication {
    private static final Logger logger = LoggerFactory.getLogger(BuenSaborBackApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BuenSaborBackApplication.class, args);
    }



        @Bean
    CommandLineRunner init(UsuarioRepository usuarioRepository,
                           ClienteRepository clienteRepository,
                           RolRepository rolRepository
        ) {
        return args -> {
            logger.info("----------------Crear usuario Admin---------------------");

//            Rol rolAdmin = Rol.builder()
//                    .rolName(RolName.ADMIN)
//                    .build();
//            var rolAdminS = rolRepository.save(rolAdmin);
//
//            Cliente clienteAdmin = Cliente.builder()
//                    .nombre("admin")
//                    .email("admin@buensa.com")
//                    .build();
//            var clienteAdminS = clienteRepository.save(clienteAdmin);
//
//            UsuarioCliente usuarioAdmin = UsuarioCliente.builder()
//                    .nombreUsuario("admin")
//                    .rol(rolAdminS)
//                    .cliente(clienteAdminS)
//                    .build();
//            var usuarioAdminS = usuarioRepository.save(usuarioAdmin);
//
//            clienteAdminS.setUsuario(usuarioAdminS);
//            clienteRepository.save(clienteAdminS);

            logger.info("----------------Crear usuario Cajero---------------------");

//            Rol rolCajero = Rol.builder()
//                    .rolName(RolName.CAJERO)
//                    .build();
//            var rolCajeroS = rolRepository.save(rolCajero);
//
//            Cliente clienteCajero = Cliente.builder()
//                    .nombre("cajero")
//                    .email("cajero@buensa.com")
//                    .build();
//            var clienteCajeroS = clienteRepository.save(clienteCajero);
//
//            UsuarioCliente usuarioCajero = UsuarioCliente.builder()
//                    .nombreUsuario("cajero")
//                    .rol(rolCajeroS)
//                    .cliente(clienteCajeroS)
//                    .build();
//            var usuarioCajeroS = usuarioRepository.save(usuarioCajero);
//
//            clienteCajeroS.setUsuario(usuarioCajeroS);
//            clienteRepository.save(clienteCajeroS);

            logger.info("----------------Crear usuario Cocinero---------------------");

//            Rol rolCocinero = Rol.builder()
//                    .rolName(RolName.COCINERO)
//                    .build();
//            var rolCocineroS = rolRepository.save(rolCocinero);
//
//            Cliente clienteCocinero = Cliente.builder()
//                    .nombre("cocinero")
//                    .email("cocinero@buensa.com")
//                    .build();
//            var clienteCocineroS = clienteRepository.save(clienteCocinero);
//
//            UsuarioCliente usuarioCocinero = UsuarioCliente.builder()
//                    .nombreUsuario("cocinero")
//                    .rol(rolCocineroS)
//                    .cliente(clienteCocineroS)
//                    .build();
//            var usuarioCocineroS = usuarioRepository.save(usuarioCocinero);
//
//            clienteCocineroS.setUsuario(usuarioCocineroS);
//            clienteRepository.save(clienteCocineroS);

            logger.info("----------------Crear usuario Cliente---------------------");

//            Rol rolCliente = Rol.builder()
//                    .rolName(RolName.CLIENTE)
//                    .build();
//            var rolClienteS = rolRepository.save(rolCliente);
//
//            Cliente clienteCliente = Cliente.builder()
//                    .nombre("cliente")
//                    .email("cliente@buensa.com")
//                    .build();
//            var clienteClienteS = clienteRepository.save(clienteCliente);
//
//            UsuarioCliente usuarioCliente = UsuarioCliente.builder()
//                    .nombreUsuario("cliente")
//                    .rol(rolClienteS)
//                    .cliente(clienteClienteS)
//                    .build();
//            var usuarioClienteS = usuarioRepository.save(usuarioCliente);
//
//            clienteClienteS.setUsuario(usuarioClienteS);
//            clienteRepository.save(clienteClienteS);


        };
    }
}