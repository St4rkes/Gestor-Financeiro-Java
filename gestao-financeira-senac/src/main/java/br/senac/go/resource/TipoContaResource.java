package br.senac.go.resource;



import br.senac.go.Service.TipoContaService;
import br.senac.go.interfaces.IResource;
import br.senac.go.model.Conta;
import br.senac.go.model.TipoConta;
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
@RestController("/api/tipoConta")
@RequestMapping(path = "/api/tipoConta")
@Tag(name = "tipoConta", description = "documentação da classe tipoConta")


public class TipoContaResource implements IResource<TipoConta, Integer> {


        @Autowired //forma 01
        TipoContaService tipoContaService;



    @Operation(
            summary = "Criar uma conta",
            description = "Metodo responsavel para criar uma conta no sistema",
            tags = {"tipoConta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public TipoConta create(@Valid @RequestBody TipoConta entity) throws Exception {
        log.info("Executado metodo create");
        log.debug(String.format("Executado metodo create ContaResource.create | valores:", entity.toString()));

        TipoConta tipoConta = tipoContaService.create((entity));
        return tipoConta;
    }


    @Operation(
            summary = "Recupera uma conta",
            description = "Metodo responsavel para recuperar uma conta no sistema",
            tags = {"tipoConta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @GetMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public TipoConta read(@Valid @RequestBody TipoConta entity) throws Exception {
        log.info("Executado metodo read");
        log.debug(String.format("Executado metodo read ContaResource.read | valores:", entity.toString()));

        TipoConta tipoConta = tipoContaService.read((entity));
        return tipoConta;
    }

    @Operation(
            summary = "Recupera uma conta com identificador",
            description = "Metodo responsavel para recuperar uma conta no sistema com identificador",
            tags = {"tipoConta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    @Override
    @GetMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public TipoConta readById(@PathVariable Integer id) throws Exception {
        log.info("Executado metodo create");
        log.debug(String.format("Executado metodo create ContaResource.create | valores:", id.toString()));

        TipoConta tipoConta = tipoContaService.readById((id));
        return tipoConta;
    }

    @Operation(
            summary = "Atualizar parcial uma conta",
            description = "Metodo responsavel para Atualizar parcial uma conta no sistema",
            tags = {"tipoConta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PatchMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public TipoConta updatePart(@PathVariable Integer id, @Valid @RequestBody TipoConta entity) throws Exception {
        log.info("Executado metodo updatePart");
        log.debug(String.format("Executado metodo updatePart ContaResource.updatePart | valores:", id, entity.toString()));

        TipoConta tipoConta = tipoContaService.updatePart(entity, id);
        return tipoConta;
    }


    @Operation(
            summary = "Atualizar total uma conta",
            description = "Metodo responsavel para Atualizar total uma conta no sistema",
            tags = {"tipoConta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PutMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public TipoConta updateFull(@PathVariable Integer id, @Valid @RequestBody TipoConta entity) {
        log.info("Executado metodo updateFull");
        log.debug(String.format("Executado metodo updateFull ContaResource.updateFull | valores:", id, entity.toString()));


        TipoConta tipoConta = tipoContaService.updateFull(entity, id);
        return tipoConta;
    }


    @Operation(
            summary = "Atualizar uma conta",
            description = "Metodo responsavel para Atualizar uma conta no sistema",
            tags = {"tipoConta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PutMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public TipoConta update(@Valid @RequestBody TipoConta entity) {
        log.info("Executado metodo update");
        log.debug(String.format("Executado metodo update ContaResource.update | valores:", entity.toString()));

        TipoConta tipoConta = tipoContaService.update((entity));
        return tipoConta;
    }

    @Operation(
            summary = "Deletar uma conta",
            description = "Metodo responsavel para deletar uma conta no sistema",
            tags = {"tipoConta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Executado metodo delete");
        log.debug(String.format("Executado metodo delete ContaResource.delete | valores:", id.toString()));

        tipoContaService.deleteById(id);
    }

    @Operation(
            summary = "Deletar com identificador uma conta",
            description = "Metodo responsavel para deletar uma conta no sistema com identificador",
            tags = {"tipoConta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public void deleteByEntity(@Valid @RequestBody TipoConta entity) {
        log.info("Executado metodo deleteByEntity");
        log.debug(String.format("Executado metodo deleteByEntity ContaResource.deleteByEntity | valores:", entity.toString()));

        tipoContaService.delete(entity);
    }
}