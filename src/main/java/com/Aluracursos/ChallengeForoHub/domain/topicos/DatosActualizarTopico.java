package com.Aluracursos.ChallengeForoHub.domain.topicos;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarTopico(@NotNull
                                    Long id,
                                    String titulo,
                                    String mensaje,
                                    LocalDateTime fechaDeCreacion) {
    public DatosActualizarTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion());
    }
}
