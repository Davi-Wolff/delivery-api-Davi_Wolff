package com.delivery_api.services;

import java.math.BigDecimal;
import java.util.List;

import com.delivery_api.entity.dto.request.ItemPedidoRequestDTO;
import com.delivery_api.entity.dto.request.PedidoRequestDTO;
import com.delivery_api.entity.dto.response.PedidoResponseDTO;
import com.delivery_api.enums.StatusPedido;



public interface PedidoService {

    PedidoResponseDTO criarPedido(PedidoRequestDTO dto);

    PedidoResponseDTO buscarPorId(Long id);

    List<PedidoResponseDTO> listarPedidosPorCliente(Long clienteId);

    PedidoResponseDTO atualizarStatusPedido(Long id, StatusPedido status);

    BigDecimal calcularValorTotalPedido(List<ItemPedidoRequestDTO> itens );

    PedidoResponseDTO cancelarPedido(Long id);

}