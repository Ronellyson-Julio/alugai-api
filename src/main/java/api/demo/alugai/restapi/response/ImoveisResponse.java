package api.demo.alugai.restapi.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImoveisResponse {
    private String nome;
    private String descricao;
    private String tipo;
    private String endereco;
    private String cidade;
    private String estado;
    private String valor;
    //TODO: verificar se esses atributos são todos necessários
}
