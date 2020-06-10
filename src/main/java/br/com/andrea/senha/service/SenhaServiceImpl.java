package br.com.andrea.senha.service;

import br.com.andrea.senha.model.Senha;
import br.com.andrea.senha.model.TipoSenha;
import br.com.andrea.senha.repository.SenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenhaServiceImpl implements SenhaService {

    @Autowired
    private SenhaRepository senhaRepository;

    @Override
    public List<Senha> findAll() {
        return this.senhaRepository.findAll();
    }

    @Override
    public Senha findByTipoSenha(TipoSenha tipoSenha) {
        return this.senhaRepository.findByTipoSenha(tipoSenha);
    }

    @Override
    public Senha save(Senha senha) {
        senha.setProximoNumero(senha.getProximoNumero()+1);
        return this.senhaRepository.save(senha);
    }

    @Override
    public Senha update(Senha senha) {
        senha.setProximoNumero(1L);
        return this.senhaRepository.update(senha);
    }
}
