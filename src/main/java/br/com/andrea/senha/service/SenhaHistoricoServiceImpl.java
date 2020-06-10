package br.com.andrea.senha.service;

import br.com.andrea.senha.model.SenhaHistorico;
import br.com.andrea.senha.model.TipoSenha;
import br.com.andrea.senha.repository.SenhaHistoricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SenhaHistoricoServiceImpl implements SenhaHistoricoService {

    @Autowired
    private SenhaHistoricoRepository senhaHistoricoRepository;

    @Override
    public List<SenhaHistorico> findAll() {
        return this.senhaHistoricoRepository.findAll();
    }

    @Override
    public List<SenhaHistorico> findByTipoSenha(TipoSenha tipoSenha) {
        return this.senhaHistoricoRepository.findByTipoSenha(tipoSenha);
    }

    @Override
    public List<SenhaHistorico> findLastCalledSenhas(Integer numeroSenhas) {
        return this.senhaHistoricoRepository.findLastCalledSenhas(numeroSenhas);
    }

    @Override
    public List<SenhaHistorico> findFaltaChamar() {
        return this.senhaHistoricoRepository.findFaltaChamar();
    }

    @Override
    public SenhaHistorico save(SenhaHistorico senhaHistorico) {
        senhaHistorico.setDataGeracao(LocalDateTime.now());
        return this.senhaHistoricoRepository.save(senhaHistorico);
    }

    @Override
    public SenhaHistorico update(SenhaHistorico senhaHistorico) {
        senhaHistorico.setDataChamada(LocalDateTime.now());
        return this.senhaHistoricoRepository.update(senhaHistorico);
    }

}
