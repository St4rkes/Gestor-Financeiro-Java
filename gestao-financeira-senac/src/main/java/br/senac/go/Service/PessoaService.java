package br.senac.go.Service;

import br.senac.go.interfaces.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import br.senac.go.model.Pessoa;

@Slf4j
@Service
public class PessoaService implements IService<Pessoa, Integer> {

    @Override
    public Pessoa create(Pessoa entity) {
        log.info("Metodo PessoaService.create executado");
        log.debug(String.format("Metodo PessoaService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public Pessoa readById(Integer id) throws Exception {
        log.info("Metodo ContaPessoaServiceService.create executado");
        log.debug(String.format("Metodo PessoaService.create executado com objeto: %&", id.toString()));
        return null;
    }

    @Override
    public Pessoa read(Pessoa entity) throws Exception {
        log.info("Metodo PessoaService.create executado");
        log.debug(String.format("Metodo PessoaService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public Pessoa updatePart(Pessoa entity, Integer id) throws Exception {
        log.info("Metodo PessoaService.create executado");
        log.debug(String.format("Metodo PessoaService.create executado com objeto: %&",id, entity.toString()));
        return null;
    }

    @Override
    public Pessoa updateFull(Pessoa entity, Integer id) {
        log.info("Metodo PessoaService.create executado");
        log.debug(String.format("Metodo PessoaService.create executado com objeto: %&",id, entity.toString()));
        return null;
    }

    @Override
    public Pessoa update(Pessoa entity) {
        log.info("Metodo PessoaService.create executado");
        log.debug(String.format("Metodo PessoaService.create executado com objeto: %&", entity.toString()));
        return null;
    }

    @Override
    public Pessoa deleteById(Integer id) {
        log.info("Metodo PessoaService.create executado");
        log.debug(String.format("Metodo PessoaService.create executado com objeto: %&", id.toString()));
        return null;
    }

    @Override
    public Pessoa delete(Pessoa entity) {
        log.info("Metodo PessoaService.create executado");
        log.debug(String.format("Metodo PessoaService.create executado com objeto: %&", entity.toString()));
        return null;
    }
}
