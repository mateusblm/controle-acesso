package io.github.mateusblm.repository;

import io.github.mateusblm.enumeration.TipoGrupo;
import io.github.mateusblm.model.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {
    public Usuario findByNome(String nome) {
        return find("nome", nome).firstResult();
    }

    public Usuario findByTipoGrupo(String tipoGrupo) {
        return find("tipoGrupo", tipoGrupo).firstResult();
    }

    public Usuario listByGrupo(TipoGrupo tipoGrupo) {
        return find("tipoGrupo", tipoGrupo).firstResult();
    }
}
