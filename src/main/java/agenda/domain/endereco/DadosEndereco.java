package agenda.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco (
    @NotBlank
    String logradouro,
    @NotBlank
    String bairro,
    @NotBlank
    @Pattern(regexp = "\\d{8}") // digitos com 8 números
    String cep,
    @NotBlank
    String cidade,
    @NotBlank
    String uf,
    String complemento,
    @NotBlank
    String numero) {

}
