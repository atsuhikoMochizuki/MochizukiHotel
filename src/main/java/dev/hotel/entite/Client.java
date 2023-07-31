package dev.hotel.entite;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Client extends BaseEntite {

    @Column(unique = true, nullable = false)
    private String numero;

    private String nom;

    private String prenoms;

    @OneToMany(mappedBy = "client")
    private Set<Reservation> reservation;
}
