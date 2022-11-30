package tech.devinhouse.devgram.dto;

import lombok.Data;
import tech.devinhouse.devgram.model.Status;
import tech.devinhouse.devgram.validator.ValorDeEnum;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class PerfilRequest {

    @NotEmpty(message = "{campo.obrigatorio}")
    @Size(min = 4, max = 40, message = "{campo.invalido}")
    private String nome;

    @NotEmpty(message = "{campo.obrigatorio}")
    private String biografia;

    @NotNull(message = "{campo.obrigatorio}")
    @Past(message = "{campo.invalido}")
    private LocalDate dataNascimento;

    @NotEmpty(message = "{campo.obrigatorio}")
    @Size(min = 4, max = 20, message = "{campo.invalido}")
    private String profissao;

//    @NotNull(message = "{campo.obrigatorio}")
//    private Status status;

    @NotNull(message = "{campo.obrigatorio}")
    @ValorDeEnum(enumClass = Status.class, message = "{campo.invalido}")
    private String status;

}
