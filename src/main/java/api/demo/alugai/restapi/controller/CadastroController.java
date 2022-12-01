package api.demo.alugai.restapi.controller;

import api.demo.alugai.restapi.service.ImovelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CadastroController {

    private final ImovelService imovelService;

    @GetMapping("/imovel/consultar/{id}")
    public void consultarImovel(@PathVariable() Long id){
        imovelService.getImovelById(id);
    }
}
