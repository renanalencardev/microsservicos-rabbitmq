package com.alencar.propostaapp.mapper;

import com.alencar.propostaapp.dto.PropostaRequestDto;
import com.alencar.propostaapp.dto.PropostaResponseDto;
import com.alencar.propostaapp.entity.Proposta;
import com.alencar.propostaapp.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-12T11:07:03-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
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

    @Override
    public PropostaResponseDto convertPropostaToDto(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }

        PropostaResponseDto propostaResponseDto = new PropostaResponseDto();

        propostaResponseDto.setNome( propostaUsuarioNome( proposta ) );
        propostaResponseDto.setSobrenome( propostaUsuarioSobrenome( proposta ) );
        propostaResponseDto.setTelefone( propostaUsuarioTelefone( proposta ) );
        propostaResponseDto.setCpf( propostaUsuarioCpf( proposta ) );
        propostaResponseDto.setRenda( propostaUsuarioRenda( proposta ) );
        propostaResponseDto.setId( proposta.getId() );
        propostaResponseDto.setPrazoPagamento( proposta.getPrazoPagamento() );
        propostaResponseDto.setAprovada( proposta.getAprovada() );
        propostaResponseDto.setObservacao( proposta.getObservacao() );

        propostaResponseDto.setValorSolicitadoFmt( setValorSolicitadoFmt(proposta) );

        return propostaResponseDto;
    }

    @Override
    public List<PropostaResponseDto> convertListEntityToListDto(Iterable<Proposta> propostas) {
        if ( propostas == null ) {
            return null;
        }

        List<PropostaResponseDto> list = new ArrayList<PropostaResponseDto>();
        for ( Proposta proposta : propostas ) {
            list.add( convertPropostaToDto( proposta ) );
        }

        return list;
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

    private String propostaUsuarioNome(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }
        Usuario usuario = proposta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String nome = usuario.getNome();
        if ( nome == null ) {
            return null;
        }
        return nome;
    }

    private String propostaUsuarioSobrenome(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }
        Usuario usuario = proposta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String sobrenome = usuario.getSobrenome();
        if ( sobrenome == null ) {
            return null;
        }
        return sobrenome;
    }

    private String propostaUsuarioTelefone(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }
        Usuario usuario = proposta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String telefone = usuario.getTelefone();
        if ( telefone == null ) {
            return null;
        }
        return telefone;
    }

    private String propostaUsuarioCpf(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }
        Usuario usuario = proposta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String cpf = usuario.getCpf();
        if ( cpf == null ) {
            return null;
        }
        return cpf;
    }

    private Double propostaUsuarioRenda(Proposta proposta) {
        if ( proposta == null ) {
            return null;
        }
        Usuario usuario = proposta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        Double renda = usuario.getRenda();
        if ( renda == null ) {
            return null;
        }
        return renda;
    }
}
