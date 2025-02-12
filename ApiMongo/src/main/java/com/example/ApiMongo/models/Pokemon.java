package com.example.ApiMongo.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Pokemon")
public class Pokemon {
    @Id
    @Schema(description = "ID único del Pokemon", example = "67a3af56d41661b5ce072fe5")
    private String id;

    @Schema(description = "Nombre del Pokémon", example = "Pikachu")
    private String nombre;

    @Schema(description = "Tipo del Pokémon", example = "Eléctrico")
    private String tipo;

    @Schema(description = "Nivel del Pokémon", example = "30")
    private int nivel;

    @Schema(description = "Estadisticas del Pokémon")
    private Estadistica estadisticas;

    @Schema(description = "Lista de ataques del Pokémon")
    private List<Ataque> ataques;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    public Estadistica getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadistica estadisticas) {
        this.estadisticas = estadisticas;
    }
}
