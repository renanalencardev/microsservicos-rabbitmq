package com.alencar.propostaapp.mapper;

import com.alencar.propostaapp.dto.PropostaRequestDto;
import com.alencar.propostaapp.entity.Proposta;
import com.alencar.propostaapp.entity.Usuario;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-20T16:38:03-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
public class PropostaMapperImpl implements PropostaMapper {

    @Override
    public Proposta convertDtoToProposta(PropostaRequestDto propostaRequestDto) {
        if ( propostaRequestDto == null ) {
            return null;
        }

        Proposta proposta = new Proposta();

        proposta.setUsuario( propostaRequestDtoToUsuario( propostaRequestDto ) );
        proposta.setValorSolicitado( propostaRequestDto.getValorSolicitado() );
        proposta.setPrazoPagamento( propostaRequestDto.getPrazoPagamento() );

        return proposta;
    }

    protected Usuario propostaRequestDtoToUsuario(PropostaRequestDto propostaRequestDto) {
        if ( propostaRequestDto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setNome( propostaRequestDto.getNome() );
        usuario.setSobrenome( propostaRequestDto.getSobrenome() );
        usuario.setCpf( propostaRequestDto.getCpf() );
        usuario.setTelefone( propostaRequestDto.getTelefone() );
        usuario.setRenda( propostaRequestDto.getRenda() );

        return usuario;
    }
}
