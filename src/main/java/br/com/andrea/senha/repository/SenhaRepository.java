package br.com.andrea.senha.repository;

import br.com.andrea.senha.model.Senha;
import br.com.andrea.senha.model.TipoSenha;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SenhaRepository extends CrudRepository<Senha, Long> {

    List<Senha> findAll();

    Senha findByTipoSenha(TipoSenha tipoSenha);

    Senha save(Senha senha);

    Senha update(Senha senha);

}
