package com.example.ApiMongo.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data // Lombok generará automáticamente los getters y setters
@Document(collection = "player")
public class Player {

    @Id
    @Schema(description = "ID único del jugador", example = "67a3af56d41661b5ce072fe5")
    private String id;

    @Schema(description = "Nombre del jugador", example = "Ash Lin")
    private String nombre;

    @Schema(description = "Nivel del jugador", example = "24")
    private int nivel;

    @Schema(description = "Equipo de Pokémon del jugador")
    private List<PokemonEquipo> equipo;

    @Schema(description = "Logros del jugador")
    private List<Logro> logros;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<PokemonEquipo> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<PokemonEquipo> equipo) {
        this.equipo = equipo;
    }

    public List<Logro> getLogros() {
        return logros;
    }

    public void setLogros(List<Logro> logros) {
        this.logros = logros;
    }

}
