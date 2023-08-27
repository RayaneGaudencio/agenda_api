package agenda.domain.usuario_sup;


import agenda.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuario_sup")
@Entity(name = "UsuarioSup")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class UsuarioSup {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String registro; // CNPJ ou CPF
    private Endereco endereco;

    public  UsuarioSup(DadosCadastroUsuarioSup dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.registro = dados.registro();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }

}
