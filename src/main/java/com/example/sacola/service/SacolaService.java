package com.example.sacola.service;

import com.example.sacola.model.Item;
import com.example.sacola.model.Sacola;
import com.example.sacola.resource.dto.ItemDto;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
