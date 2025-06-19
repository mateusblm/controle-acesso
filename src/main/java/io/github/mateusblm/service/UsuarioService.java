package io.github.mateusblm.service;

import io.github.mateusblm.enumeration.TipoGrupo;
import io.github.mateusblm.model.Usuario;
import io.github.mateusblm.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UsuarioService {

    @Inject
    UsuarioRepository usuarioRepository;

    public void createUsuario(String nome, String tipoGrupo) {
        usuarioRepository.persist(new Usuario(nome, TipoGrupo.valueOf(tipoGrupo)));
    }

    public Usuario listUsuariosByGrupo(String tipoGrupo) {
        TipoGrupo grupo = TipoGrupo.valueOf(tipoGrupo); // converte String para enum
        return usuarioRepository.listByGrupo(grupo);
    }



}
