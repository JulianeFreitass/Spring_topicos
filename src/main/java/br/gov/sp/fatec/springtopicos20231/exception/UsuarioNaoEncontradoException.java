package br.gov.sp.fatec.springtopicos20231.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoEncontradoException extends IllegalAccessException{
    public UsuarioNaoEncontradoException(String message){
        super(message);
    }
}
