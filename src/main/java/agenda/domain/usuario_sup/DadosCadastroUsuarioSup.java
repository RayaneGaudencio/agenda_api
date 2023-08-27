package agenda.domain.usuario_sup;

import agenda.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroUsuarioSup (
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{8,11}")
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{11,14}")
        String registro,

        @NotNull @Valid
        DadosEndereco endereco) {
}
