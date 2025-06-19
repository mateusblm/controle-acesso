package io.github.mateusblm.model;

import io.github.mateusblm.enumeration.TipoGrupo;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Usuario extends PanacheEntity {

    @SequenceGenerator(name = "usuario_seq", sequenceName = "Usuario_Seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    public Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoGrupo tipoGrupo;

    public Usuario() {
    }
    public Usuario(String nome, TipoGrupo tipoGrupo) {
        this.nome = nome;
        this.tipoGrupo = tipoGrupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoGrupo getTipoGrupo() {
        return tipoGrupo;
    }

    public void setTipoGrupo(TipoGrupo tipoGrupo) {
        this.tipoGrupo = tipoGrupo;
    }
}
