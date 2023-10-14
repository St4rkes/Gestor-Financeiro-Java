package br.senac.go.Service;

import br.senac.go.interfaces.IService;
import br.senac.go.model.TipoConta;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TipoContaService implements IService<TipoConta, Integer> {
    @Override
    public TipoConta create(TipoConta entity) {
        log.info("Metodo TipoContaService.create executado");
        log.debug(String.format("Metodo TipoContaService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public TipoConta readById(Integer id) throws Exception {
        log.info("Metodo TipoContaService.create executado");
        log.debug(String.format("Metodo TipoContaService.create executado com objeto: %&", id.toString()));
        return null;
    }

    @Override
    public TipoConta read(TipoConta entity) throws Exception {
        log.info("Metodo TipoContaService.create executado");
        log.debug(String.format("Metodo TipoContaService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public TipoConta updatePart(TipoConta entity, Integer id) throws Exception {
        log.info("Metodo TipoContaService.create executado");
        log.debug(String.format("Metodo TipoContaService.create executado com objeto: %&",id, entity.toString()));
        return null;
    }

    @Override
    public TipoConta updateFull(TipoConta entity, Integer id) {
        log.info("Metodo TipoContaService.create executado");
        log.debug(String.format("Metodo TipoContaService.create executado com objeto: %&",id, entity.toString()));
        return null;
    }

    @Override
    public TipoConta update(TipoConta entity) {
        log.info("Metodo TipoContaService.create executado");
        log.debug(String.format("Metodo TipoContaService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public TipoConta deleteById(Integer id) {
        log.info("Metodo TipoContaService.create executado");
        log.debug(String.format("Metodo TipoContaService.create executado com objeto: %&", id.toString()));
        return null;
    }

    @Override
    public TipoConta delete(TipoConta entity) {
        log.info("Metodo TipoContaService.create executado");
        log.debug(String.format("Metodo TipoContaService.create executado com objeto: %&", entity.toString()));
        return null;
    }
}
