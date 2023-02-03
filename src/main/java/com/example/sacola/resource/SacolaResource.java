package com.example.sacola.resource;

import com.example.sacola.model.Item;
import com.example.sacola.model.Sacola;
import com.example.sacola.resource.dto.ItemDto;
import com.example.sacola.service.SacolaService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Api(value="/ifood-devweek/sacolas")
@RestController
@RequestMapping("/ifood-devweek/sacolas")
@RequiredArgsConstructor
public class SacolaResource {

    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto){
        return sacolaService.incluirItemNaSacola(itemDto);
    }

    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long id){
        return sacolaService.verSacola(id);
    }

    @PatchMapping("/fechar/{SacolaId}")
    public Sacola fecharSacola(Long sacolaId,  @RequestParam("formaPagamento") int formaPagamento){
        return sacolaService.fecharSacola(sacolaId, formaPagamento);
    }
}
