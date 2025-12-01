package com.delivery_api.services;


import com.delivery_api.entity.dto.request.LoginRequestDTO;
import com.delivery_api.entity.dto.request.UsuarioRequestDTO;
import com.delivery_api.entity.dto.response.LoginResponseDTO;
import com.delivery_api.entity.dto.response.UsuarioResponseDTO;

public interface UsuarioService {

    UsuarioResponseDTO cadastrar(UsuarioRequestDTO dto);

    LoginResponseDTO login(LoginRequestDTO dto);

}