package com.alencar.propostaapp.service;

import com.alencar.propostaapp.dto.PropostaRequestDto;
import com.alencar.propostaapp.dto.PropostaResponseDto;
import com.alencar.propostaapp.entity.Proposta;
import com.alencar.propostaapp.mapper.PropostaMapper;
import com.alencar.propostaapp.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;

@Service
public class PropostaService {
    @Autowired
    private PropostaRepository propostaRepository;

    @Transient
    public PropostaResponseDto criar (PropostaRequestDto requestDto) {
        Proposta proposta = PropostaMapper.INSTANCE.convertDtoToProposta(requestDto);
        System.out.println(proposta.toString());
        propostaRepository.save(proposta);
        return PropostaMapper.INSTANCE.convertPropostaToDto(proposta);
    }
}
