package br.com.andrea.senha.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class SenhaHistorico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private TipoSenha tipoSenha;
    private Long numero;

    @CreatedDate
    private LocalDateTime dataGeracao;

    private LocalDateTime dataChamada;



}
