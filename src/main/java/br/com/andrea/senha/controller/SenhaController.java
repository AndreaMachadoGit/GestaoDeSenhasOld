package br.com.andrea.senha.controller;

import br.com.andrea.senha.model.Senha;
import br.com.andrea.senha.service.SenhaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/senha")
public class SenhaController {

    @Autowired
    private SenhaService senhaService;

    @PutMapping
    @ApiOperation("Zera o contador de senhas")
    @ApiResponse(value = {@ApiResponse(code=201, message="Contador de senha zerado com sucesso")})
    public ResponseEntity<Senha> update(@Valid @RequestBody Senha senha){
        return   new ResponseEntity<Senha>(this.senhaService.update(senha), HttpStatus.ACCEPTED);
    }


}
