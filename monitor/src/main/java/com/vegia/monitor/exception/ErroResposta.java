package com.vegia.monitor.exception;

import java.time.LocalDateTime;

public record ErroResposta(
        LocalDateTime timestamp,
        Integer status,
        String erro,
        String mensagem,
        String caminho
) {}