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
            logger.info("----------------Crear usuario---------------------");

            Rol rolAdmin = Rol.builder()
                    .rolName(RolName.ADMIN)
                    .build();
            var rolAdminS = rolRepository.save(rolAdmin);

            Cliente clienteAdmin = Cliente.builder()
                    .nombre("admin")
                    .email("admin@buensa.com")
                    .build();
            var clienteAdminS = clienteRepository.save(clienteAdmin);

            UsuarioCliente usuarioAdmin = UsuarioCliente.builder()
                    .nombreUsuario("admin")
                    .rol(rolAdminS)
                    .cliente(clienteAdminS)
                    .build();
            var usuarioAdminS = usuarioRepository.save(usuarioAdmin);

            clienteAdminS.setUsuario(usuarioAdminS);
            clienteRepository.save(clienteAdminS);
        };
    }
}