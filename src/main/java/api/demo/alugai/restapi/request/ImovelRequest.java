package api.demo.alugai.restapi.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImovelRequest {
    private String nome;
    private String descricao;
    private String tipo;
    private String endereco;
    private String cidade;
    private String estado;
    private String valor;

}
