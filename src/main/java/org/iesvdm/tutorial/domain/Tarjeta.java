package org.iesvdm.tutorial.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tarjeta", schema = "jpa4")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long numero;
    private Date caducidad;

    @OneToOne
    @JsonIgnore
    @ToString.Exclude//Si no pongo esto se genera un bucle por el echo de ser bidireccional
    @JoinColumn(name = "id_socio", nullable = false,foreignKey = @ForeignKey(name = "FK_Socio"))
    Socio socio;
}
