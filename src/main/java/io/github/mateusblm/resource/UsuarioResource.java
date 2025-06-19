package io.github.mateusblm.resource;


import io.github.mateusblm.model.Usuario;
import io.github.mateusblm.service.UsuarioService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

@Path("usuarios")
@RequestScoped
public class UsuarioResource {

    @Inject
    UsuarioService usuarioService;

    @POST
    @Path("/create/{nome}/{tipoGrupo}")
    @Transactional
    public void createUsuario(@PathParam("nome") String nome, @PathParam("tipoGrupo") String tipoGrupo) {
        usuarioService.createUsuario(nome, tipoGrupo);
    }

    @GET
    @Path("/list/{tipoGrupo}")
    @Transactional
    public Usuario listUsuariosByGrupo(@PathParam("tipoGrupo") String tipoGrupo) {
        return usuarioService.listUsuariosByGrupo(tipoGrupo);
    }

    @DELETE
    @Path("/remove/{id}/{tipoGrupo}")
    @Transactional
    public void removeUsuarioFromGroup(@PathParam("id") Long id, @PathParam("tipoGrupo") String tipoGrupo) {
        usuarioService.removeUsuarioFromGroup(id, tipoGrupo);
    }

}
