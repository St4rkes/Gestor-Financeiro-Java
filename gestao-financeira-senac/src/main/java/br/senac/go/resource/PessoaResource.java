package br.senac.go.resource;

import br.senac.go.Service.ContaService;
import br.senac.go.Service.PessoaService;
import br.senac.go.interfaces.IResource;
import br.senac.go.model.Conta;
import br.senac.go.model.Pessoa;
import br.senac.go.model.TipoInvestimento;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j //fazer log das requisicoes
@RestController("api/pessoa")
@RequestMapping(path = "/api/pessoa")
@Tag(name = "pessoa", description = "documentação da classe pessoa")
public class PessoaResource implements IResource<Pessoa, Integer> {

    @Autowired //forma 01
    PessoaService pessoaService;


    @Operation(
            summary = "Criar uma conta",
            description = "Metodo responsavel para criar uma conta no sistema",
            tags = {"pessoa"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Pessoa.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Pessoa create(@Valid @RequestBody Pessoa entity) throws Exception {
        log.info("Executado metodo create");
        log.debug(String.format("Executado metodo create ContaResource.create | valores:", entity.toString()));

        Pessoa pessoa = pessoaService.create((entity));
        return pessoa;
    }


    @Operation(
            summary = "Recupera uma conta",
            description = "Metodo responsavel para recuperar uma conta no sistema",
            tags = {"pessoa"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Pessoa.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @GetMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Pessoa read(@Valid @RequestBody Pessoa entity) throws Exception {
        log.info("Executado metodo read");
        log.debug(String.format("Executado metodo read ContaResource.read | valores:", entity.toString()));

        Pessoa pessoa = pessoaService.read((entity));
        return pessoa;
    }

    @Operation(
            summary = "Recupera uma conta com identificador",
            description = "Metodo responsavel para recuperar uma conta no sistema com identificador",
            tags = {"pessoa"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Pessoa.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    @Override
    @GetMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Pessoa readById(@PathVariable Integer id) throws Exception {
        log.info("Executado metodo create");
        log.debug(String.format("Executado metodo create ContaResource.create | valores:", id.toString()));

        Pessoa pessoa = pessoaService.readById((id));
        return pessoa;
    }

    @Operation(
            summary = "Atualizar parcial uma conta",
            description = "Metodo responsavel para Atualizar parcial uma conta no sistema",
            tags = {"pessoa"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Pessoa.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PatchMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Pessoa updatePart(@PathVariable Integer id, @Valid @RequestBody Pessoa entity) throws Exception {
        log.info("Executado metodo updatePart");
        log.debug(String.format("Executado metodo updatePart ContaResource.updatePart | valores:", id, entity.toString()));

        Pessoa pessoa = pessoaService.updatePart(entity, id);
        return pessoa;
    }


    @Operation(
            summary = "Atualizar total uma conta",
            description = "Metodo responsavel para Atualizar total uma conta no sistema",
            tags = {"pessoa"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Pessoa.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PutMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Pessoa updateFull(@PathVariable Integer id, @Valid @RequestBody Pessoa entity) {
        log.info("Executado metodo updateFull");
        log.debug(String.format("Executado metodo updateFull ContaResource.updateFull | valores:", id, entity.toString()));


        Pessoa pessoa = pessoaService.updateFull(entity, id);
        return pessoa;
    }


    @Operation(
            summary = "Atualizar uma conta",
            description = "Metodo responsavel para Atualizar uma conta no sistema",
            tags = {"pessoa"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Pessoa.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PutMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Pessoa update(@Valid @RequestBody Pessoa entity) {
        log.info("Executado metodo update");
        log.debug(String.format("Executado metodo update ContaResource.update | valores:", entity.toString()));

        Pessoa pessoa = pessoaService.update((entity));
        return pessoa;
    }

    @Operation(
            summary = "Deletar uma conta",
            description = "Metodo responsavel para deletar uma conta no sistema",
            tags = {"pessoa"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Pessoa.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Executado metodo delete");
        log.debug(String.format("Executado metodo delete ContaResource.delete | valores:", id.toString()));

        pessoaService.deleteById(id);
    }

    @Operation(
            summary = "Deletar com identificador uma conta",
            description = "Metodo responsavel para deletar uma conta no sistema com identificador",
            tags = {"pessoa"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Pessoa.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public void deleteByEntity(@Valid @RequestBody Pessoa entity) {
        log.info("Executado metodo deleteByEntity");
        log.debug(String.format("Executado metodo deleteByEntity ContaResource.deleteByEntity | valores:", entity.toString()));

        pessoaService.delete(entity);
    }
}