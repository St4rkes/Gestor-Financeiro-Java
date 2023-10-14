package br.senac.go.resource;


import br.senac.go.Service.ContaService;
import br.senac.go.Service.InvestimentoService;
import br.senac.go.interfaces.IResource;
import br.senac.go.model.Conta;
import br.senac.go.model.Investimento;
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
@RestController("api/Investimento")
@RequestMapping(path = "/api/Investimento")
@Tag(name = "Investimento", description = "documentação ao resource Investimento")


public class InvestimentoResource implements IResource<Investimento, Integer> {

    @Autowired //forma 01
    InvestimentoService investimentoService;


    @Operation(
            summary = "Criar um Investimento",
            description = "Metodo responsavel para criar um Investimento no sistema",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Investimento create(@Valid @RequestBody Investimento entity) throws Exception {
        log.info("Executado metodo create");
        log.debug(String.format("Executado metodo create InvestimentoResource.create | valores:", entity.toString()));

        Investimento investimento = investimentoService.create((entity));
        return investimento;
    }


    @Operation(
            summary = "Recupera um Investimento",
            description = "Metodo responsavel para recuperar um Investimento no sistema",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @GetMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Investimento read(@Valid @RequestBody Investimento entity) throws Exception {
        log.info("Executado metodo read");
        log.debug(String.format("Executado metodo read InvestimentoResource.read | valores:", entity.toString()));

        Investimento investimento = investimentoService.read((entity));
        return investimento;
    }

    @Operation(
            summary = "Recupera um Investimento com identificador",
            description = "Metodo responsavel para recuperar um Investimento no sistema com identificador",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    @Override
    @GetMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Investimento readById(@PathVariable Integer id) throws Exception {
        log.info("Executado metodo create");
        log.debug(String.format("Executado metodo create InvestimentoResource.create | valores:", id.toString()));

        Investimento investimento = investimentoService.readById((id));
        return investimento;
    }

    @Operation(
            summary = "Atualizar parcial um Investimento",
            description = "Metodo responsavel para Atualizar parcial um Investimento no sistema",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PatchMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Investimento updatePart(@PathVariable Integer id, @Valid @RequestBody Investimento entity) throws Exception {
        log.info("Executado metodo updatePart");
        log.debug(String.format("Executado metodo updatePart InvestimentoResource.updatePart | valores:", id, entity.toString()));

        Investimento investimento = investimentoService.updatePart(entity, id);
        return investimento;
    }


    @Operation(
            summary = "Atualizar total um Investimento",
            description = "Metodo responsavel para Atualizar total um Investimento no sistema",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PutMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Investimento updateFull(@PathVariable Integer id, @Valid @RequestBody Investimento entity) {
        log.info("Executado metodo updateFull");
        log.debug(String.format("Executado metodo updateFull InvestimentoResource.updateFull | valores:", id, entity.toString()));


        Investimento investimento = investimentoService.updateFull(entity, id);
        return investimento;
    }


    @Operation(
            summary = "Atualizar um Investimento",
            description = "Metodo responsavel para Atualizar um Investimento no sistema",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @PutMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public Investimento update(@Valid @RequestBody Investimento entity) {
        log.info("Executado metodo update");
        log.debug(String.format("Executado metodo update InvestimentoResource.update | valores:", entity.toString()));

        Investimento investimento = investimentoService.update((entity));
        return investimento;
    }

    @Operation(
            summary = "Deletar um Investimento",
            description = "Metodo responsavel para deletar um Investimento no sistema",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Executado metodo delete");
        log.debug(String.format("Executado metodo delete InvestimentoResource.delete | valores:", id.toString()));

        investimentoService.deleteById(id);
    }

    @Operation(
            summary = "Deletar com identificador um Investimento",
            description = "Metodo responsavel para deletar uma cont Investimento com identificador",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @Override
    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public void deleteByEntity(@Valid @RequestBody Investimento entity) {
        log.info("Executado metodo deleteByEntity");
        log.debug(String.format("Executado metodo deleteByEntity InvestimentoResource.deleteByEntity | valores:", entity.toString()));

        investimentoService.delete(entity);
    }
}


