package api.demo.alugai.restapi.service;

import api.demo.alugai.entities.Imovel;
import api.demo.alugai.restapi.repository.ImoveisRepository;
import api.demo.alugai.restapi.response.ImoveisResponse;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class ImovelService {
    private ImoveisRepository imoveisRepository;
    public void getImovelById(Long id){
        //TODO: implementar
    }
    public List<ImoveisResponse> getAllImoveis(Pageable pageable){
        Optional<List<Imovel>> imoveisResponseOpt = Optional.of(imoveisRepository.findAll());
        return //TODO: um adpter varrendo a lista de imoveis returnando o List<ImovelResponse>
    }
}
