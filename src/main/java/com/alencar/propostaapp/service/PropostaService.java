package com.alencar.propostaapp.service;

import com.alencar.propostaapp.dto.PropostaRequestDto;
import com.alencar.propostaapp.dto.PropostaResponseDto;
import com.alencar.propostaapp.entity.Proposta;
import com.alencar.propostaapp.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropostaService {
    @Autowired
    private PropostaRepository propostaRepository;

    public PropostaResponseDto criar (PropostaRequestDto requestDto) {
//        propostaRepository.save();
        return null;
    }
}
