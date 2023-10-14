package br.senac.go.Service;

import br.senac.go.interfaces.IService;
import br.senac.go.model.Conta;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class ContaService implements IService<Conta, Integer> {

    @Override
    public Conta create(Conta entity) {
        log.info("Metodo ContaService.create executado");
        log.debug(String.format("Metodo ContaService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public Conta readById(Integer id) throws Exception {
        log.info("Metodo ContaService.create executado");
        log.debug(String.format("Metodo ContaService.create executado com objeto: %&", id.toString()));
        return null;
    }

    @Override
    public Conta read(Conta entity) throws Exception {
        log.info("Metodo ContaService.create executado");
        log.debug(String.format("Metodo ContaService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public Conta updatePart(Conta entity, Integer id) throws Exception {
        log.info("Metodo ContaService.create executado");
        log.debug(String.format("Metodo ContaService.create executado com objeto: %&",id, entity.toString()));
        return null;
    }

    @Override
    public Conta updateFull(Conta entity, Integer id) {
        log.info("Metodo ContaService.create executado");
        log.debug(String.format("Metodo ContaService.create executado com objeto: %&",id, entity.toString()));
        return null;
    }

    @Override
    public Conta update(Conta entity) {
        log.info("Metodo ContaService.create executado");
        log.debug(String.format("Metodo ContaService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public Conta deleteById(Integer id) {
        log.info("Metodo ContaService.create executado");
        log.debug(String.format("Metodo ContaService.create executado com objeto: %&", id.toString()));
        return null;
    }

    @Override
    public Conta delete(Conta entity) {
        log.info("Metodo ContaService.create executado");
        log.debug(String.format("Metodo ContaService.create executado com objeto: %&", entity.toString()));
        return null;
    }
}
