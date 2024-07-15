package com.Aluracursos.ChallengeForoHub.domain.topicos;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id,
                                   String titulo,
                                   String mensaje,
                                   String autor,
                                   String curso,
                                   String respuesta,
                                   LocalDateTime fechaDeCreacion) {
}
