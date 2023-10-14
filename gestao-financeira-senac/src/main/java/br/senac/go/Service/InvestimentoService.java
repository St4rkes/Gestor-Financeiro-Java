package br.senac.go.Service;

import br.senac.go.interfaces.IService;
import br.senac.go.model.Investimento;
import br.senac.go.model.Pessoa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class InvestimentoService implements IService<Investimento, Integer> {
    @Override
    public Investimento create(Investimento entity) {
        log.info("Metodo InvestimentoService.create executado");
        log.debug(String.format("Metodo InvestimentoService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public Investimento readById(Integer id) throws Exception {
        log.info("Metodo InvestimentoService.create executado");
        log.debug(String.format("Metodo InvestimentoService.create executado com objeto: %&", id.toString()));
        return null;
    }

    @Override
    public Investimento read(Investimento entity) throws Exception {
        log.info("Metodo InvestimentoService.create executado");
        log.debug(String.format("Metodo InvestimentoService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public Investimento updatePart(Investimento entity, Integer id) throws Exception {
        log.info("Metodo InvestimentoService.create executado");
        log.debug(String.format("Metodo InvestimentoService.create executado com objeto: %&",id, entity.toString()));
        return null;
    }

    @Override
    public Investimento updateFull(Investimento entity, Integer id) {
        log.info("Metodo InvestimentoService.create executado");
        log.debug(String.format("Metodo InvestimentoService.create executado com objeto: %&",id, entity.toString()));
        return null;
    }

    @Override
    public Investimento update(Investimento entity) {
        log.info("Metodo InvestimentoService.create executado");
        log.debug(String.format("Metodo InvestimentoService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public Investimento deleteById(Integer id) {
        log.info("Metodo InvestimentoService.create executado");
        log.debug(String.format("Metodo InvestimentoService.create executado com objeto: %&", id.toString()));
        return null;
    }

    @Override
    public Investimento delete(Investimento entity) {
        log.info("Metodo InvestimentoService.create executado");
        log.debug(String.format("Metodo InvestimentoService.create executado com objeto: %&", entity.toString()));
        return null;
    }
}