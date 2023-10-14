package br.senac.go.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data //faz os métodos get,set,tostring, hascode, equals
@Entity//Esta anotacao o ORM faz o controle de estado desta classe
@Table(name = "TIPO_INVESTIMENTO")
public class TipoInvestimento extends Conta{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Indica que sera auto incrimental
    private Integer id;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "DATA_INICIO", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;

    @Column(name = "TEM_RISCO")
    private Boolean temRisco;


}
