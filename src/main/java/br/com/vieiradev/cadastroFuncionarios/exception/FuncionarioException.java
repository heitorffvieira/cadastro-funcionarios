package br.com.vieiradev.cadastroFuncionarios.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FuncionarioException extends RuntimeException {
    public FuncionarioException() {
        super("Funcionário não encontrado.");
    }
}
