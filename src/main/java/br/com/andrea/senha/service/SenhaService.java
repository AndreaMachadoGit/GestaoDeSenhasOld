package br.com.andrea.senha.service;

import br.com.andrea.senha.model.Senha;
import br.com.andrea.senha.model.TipoSenha;

import java.util.List;

public interface SenhaService {

    List<Senha> findAll();

    Senha findByTipoSenha(TipoSenha tipoSenha);

    Senha save(Senha senha);

    Senha update(Senha senha);

}
