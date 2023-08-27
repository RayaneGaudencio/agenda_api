package agenda.controller;


import agenda.domain.usuario_sup.DadosCadastroUsuarioSup;
import agenda.domain.usuario_sup.DadosDetalhamentoSup;
import agenda.domain.usuario_sup.UsuarioSup;
import agenda.domain.usuario_sup.UsuarioSupRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario_sup")
public class UsuarioSupController {

    @Autowired
    private UsuarioSupRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroUsuarioSup dados) {
        var usuarioSup = new UsuarioSup(dados);

        repository.save(usuarioSup);
    }

    @GetMapping
    public Page<DadosDetalhamentoSup> listar(Pageable paginacao) {
        return repository.findBy(paginacao).map(DadosDetalhamentoSup::new);
    }

}
