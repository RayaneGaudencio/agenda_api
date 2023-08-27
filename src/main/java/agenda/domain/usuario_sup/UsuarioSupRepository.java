package agenda.domain.usuario_sup;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioSupRepository extends JpaRepository<UsuarioSup, Long> {

     Page<UsuarioSup> findBy(Pageable paginacao);
}
