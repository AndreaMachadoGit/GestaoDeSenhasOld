package br.com.andrea.senha.service;

import br.com.andrea.senha.model.Senha;
import br.com.andrea.senha.model.SenhaHistorico;
import br.com.andrea.senha.model.TipoSenha;

import java.util.List;

public interface SenhaHistoricoService {

    List<SenhaHistorico> findAll();

    List<SenhaHistorico> findByTipoSenha(TipoSenha tipoSenha);

    List<SenhaHistorico> findLastCalledSenhas(Integer numeroSenhas);

    List<SenhaHistorico> findFaltaChamar();

    SenhaHistorico save(SenhaHistorico senhaHistorico);

    SenhaHistorico update(SenhaHistorico senhaHistorico);


}
