package br.com.andrea.senha.repository;

import br.com.andrea.senha.model.SenhaHistorico;
import br.com.andrea.senha.model.TipoSenha;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  SenhaHistoricoRepository extends CrudRepository<SenhaHistorico, Long> {

    List<SenhaHistorico> findAll();

    List<SenhaHistorico> findByTipoSenha(TipoSenha tipoSenha);

    List<SenhaHistorico> findLastCalledSenhas(Integer numeroSenhas);

    List<SenhaHistorico> findFaltaChamar();

    SenhaHistorico save(SenhaHistorico senhaHistorico);

    SenhaHistorico update(SenhaHistorico senhaHistorico);

}
