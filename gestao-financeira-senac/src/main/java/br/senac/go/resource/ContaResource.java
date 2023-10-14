package br.senac.go.resource;

import br.senac.go.Service.ContaService;
import br.senac.go.interfaces.IResource;
import br.senac.go.model.Conta;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



@Slf4j //fazer log das requisicoes
@RestController("api/conta")
@RequestMapping(path = "/api/conta")
@Tag(name = "conta", description = "documentação ao resource conta")



public class ContaResource implements IResource<Conta,Integer> {

    @Autowired //forma 01
    ContaService contaService;


    @Operation(
            summary = "Criar uma conta",
            description = "Metodo responsavel para criar uma conta no sistema",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Conta create(@Valid @RequestBody Conta entity) throws Exception {
        log.info("Executado metodo create");
        log.debug(String.format("Executado metodo create ContaResource.create | valores:", entity.toString()));

        Conta conta = contaService.create((entity));
        return conta;
    }


    @Operation(
            summary = "Recupera uma conta",
            description = "Metodo responsavel para recuperar uma conta no sistema",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @GetMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Conta read(@Valid @RequestBody Conta entity) throws Exception {
        log.info("Executado metodo read");
        log.debug(String.format("Executado metodo read ContaResource.read | valores:", entity.toString()));

        Conta conta = contaService.read((entity));
        return conta;
    }

    @Operation(
            summary = "Recupera uma conta com identificador",
            description = "Metodo responsavel para recuperar uma conta no sistema com identificador",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    @Override
    @GetMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Conta readById(@PathVariable Integer id) throws Exception {
        log.info("Executado metodo create");
        log.debug(String.format("Executado metodo create ContaResource.create | valores:", id.toString()));

        Conta conta = contaService.readById((id));
        return conta;
    }

    @Operation(
            summary = "Atualizar parcial uma conta",
            description = "Metodo responsavel para Atualizar parcial uma conta no sistema",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PatchMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Conta updatePart(@PathVariable Integer id, @Valid @RequestBody Conta entity) throws Exception {
        log.info("Executado metodo updatePart");
        log.debug(String.format("Executado metodo updatePart ContaResource.updatePart | valores:", id, entity.toString()));

        Conta conta = contaService.updatePart(entity, id);
        return conta;
    }


    @Operation(
            summary = "Atualizar total uma conta",
            description = "Metodo responsavel para Atualizar total uma conta no sistema",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PutMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Conta updateFull(@PathVariable Integer id, @Valid @RequestBody Conta entity) {
        log.info("Executado metodo updateFull");
        log.debug(String.format("Executado metodo updateFull ContaResource.updateFull | valores:", id, entity.toString()));


        Conta conta = contaService.updateFull(entity, id);
        return conta;
    }


    @Operation(
            summary = "Atualizar uma conta",
            description = "Metodo responsavel para Atualizar uma conta no sistema",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PutMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Conta update(@Valid @RequestBody Conta entity) {
        log.info("Executado metodo update");
        log.debug(String.format("Executado metodo update ContaResource.update | valores:", entity.toString()));

        Conta conta = contaService.update((entity));
        return conta;
    }

    @Operation(
            summary = "Deletar uma conta",
            description = "Metodo responsavel para deletar uma conta no sistema",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Executado metodo delete");
        log.debug(String.format("Executado metodo delete ContaResource.delete | valores:", id.toString()));

        contaService.deleteById(id);
    }

    @Operation(
            summary = "Deletar com identificador uma conta",
            description = "Metodo responsavel para deletar uma conta no sistema com identificador",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public void deleteByEntity(@Valid @RequestBody Conta entity) {
        log.info("Executado metodo deleteByEntity");
        log.debug(String.format("Executado metodo deleteByEntity ContaResource.deleteByEntity | valores:", entity.toString()));

        contaService.delete(entity);
    }
}
