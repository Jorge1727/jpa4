package org.iesvdm.tutorial.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "socio", schema = "jpa4")
public class Socio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String dni;
    private String nombre;
    private String apellidos;

    @OneToOne(mappedBy = "socio")//variable que esta en tarjeta y es bidireccional
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Tarjeta tarjeta;
}
