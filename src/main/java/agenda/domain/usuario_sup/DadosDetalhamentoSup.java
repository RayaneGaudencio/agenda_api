package agenda.domain.usuario_sup;

public record DadosDetalhamentoSup(Long id, String nome, String email, String registro, String telefone) {

    public DadosDetalhamentoSup(UsuarioSup usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getRegistro(), usuario.getTelefone());
    }
}
