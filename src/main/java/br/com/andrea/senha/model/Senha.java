package br.com.andrea.senha.model;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Senha {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private TipoSenha tipoSenha;

    private Long proximoNumero;

    public TipoSenha getTipoSenha() {
        return tipoSenha;
    }

    public void setTipoSenha(TipoSenha tipoSenha) {
        this.tipoSenha = tipoSenha;
    }

    public Long getProximoNumero() {
        return proximoNumero;
    }

    public void setProximoNumero(Long proximoNumero) {
        this.proximoNumero = proximoNumero;
    }


}
