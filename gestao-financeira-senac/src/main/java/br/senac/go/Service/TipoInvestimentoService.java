package br.senac.go.Service;

import br.senac.go.interfaces.IService;
import br.senac.go.model.TipoInvestimento;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
    public class TipoInvestimentoService implements IService<TipoInvestimento, Integer> {
        @Override
        public TipoInvestimento create(TipoInvestimento entity) {
            log.info("Metodo TipoInvestimentoService.create executado");
            log.debug(String.format("Metodo TipoInvestimentoService.create executado com objeto: %&", entity.toString()));
            return null;
        }

        @Override
        public TipoInvestimento readById(Integer id) throws Exception {
            log.info("Metodo TipoContaService.create executado");
            log.debug(String.format("Metodo TipoInvestimentoService.create executado com objeto: %&", id.toString()));
            return null;
        }

        @Override
        public TipoInvestimento read(TipoInvestimento entity) throws Exception {
            log.info("Metodo TipoInvestimentoService.create executado");
            log.debug(String.format("Metodo TipoInvestimentoService.create executado com objeto: %&", entity.toString()));
            return null;
        }

        @Override
        public TipoInvestimento updatePart(TipoInvestimento entity, Integer id) throws Exception {
            log.info("Metodo TipoInvestimentoService.create executado");
            log.debug(String.format("Metodo TipoInvestimentoService.create executado com objeto: %&",id, entity.toString()));
            return null;
        }

        @Override
        public TipoInvestimento updateFull(TipoInvestimento entity, Integer id) {
            log.info("Metodo TipoInvestimentoService.create executado");
            log.debug(String.format("Metodo TipoInvestimentoService.create executado com objeto: %&",id, entity.toString()));
            return null;
        }

        @Override
        public TipoInvestimento update(TipoInvestimento entity) {
            log.info("Metodo TipoInvestimentoService.create executado");
            log.debug(String.format("Metodo TipoInvestimentoService.create executado com objeto: %&", entity.toString()));
            return null;
        }

        @Override
        public TipoInvestimento deleteById(Integer id) {
            log.info("Metodo TipoInvestimentoService.create executado");
            log.debug(String.format("Metodo TipoInvestimentoService.create executado com objeto: %&", id.toString()));
            return null;
        }

        @Override
        public TipoInvestimento delete(TipoInvestimento entity) {
            log.info("Metodo TipoInvestimentoService.create executado");
            log.debug(String.format("Metodo TipoInvestimentoService.create executado com objeto: %&", entity.toString()));
            return null;
        }
    }