package com.alencar.propostaapp.service;

import com.alencar.propostaapp.dto.PropostaRequestDto;
import com.alencar.propostaapp.dto.PropostaResponseDto;
import com.alencar.propostaapp.entity.Proposta;
import com.alencar.propostaapp.mapper.PropostaMapper;
import com.alencar.propostaapp.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

@Service
public class PropostaService {
    @Autowired
    private PropostaRepository propostaRepository;
    @Autowired
    private PropostaMapper propostaMapper;

    public PropostaResponseDto criar (PropostaRequestDto requestDto) {
        Proposta proposta = propostaMapper.convertDtoToProposta(requestDto);
        propostaRepository.save(proposta);
        return propostaMapper.convertPropostaToDto(proposta);
    }

    public List<PropostaResponseDto> obterProposta() {
        return propostaMapper.convertListEntityToListDto(propostaRepository.findAll());
    }

}
