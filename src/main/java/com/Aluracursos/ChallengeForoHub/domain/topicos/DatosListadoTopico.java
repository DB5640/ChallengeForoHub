package com.Aluracursos.ChallengeForoHub.domain.topicos;

import java.time.LocalDateTime;

public record DatosListadoTopico(Long id,
                                 String titulo,
                                 String mensaje,
                                 String autor,
                                 String curso,
                                 String respuesta,
                                 LocalDateTime fechaDeCreacion) {
    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getAutor(), topico.getCurso(), topico.getRespuesta(), topico.getFechaDeCreacion());
    }
}
