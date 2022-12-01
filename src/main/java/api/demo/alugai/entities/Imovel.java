package api.demo.alugai.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "imovel")
public class Imovel {
    @Id()
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "imovel_id")
    private Long imovelId;
    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
    @Column(name = "valor")
    private String valor;
}
