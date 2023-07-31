package dev.hotel.entite;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chambre extends BaseEntite {

    @Column(unique = true, nullable = false)
    private String code;

    private String numero;
    private Float surface;

    @ManyToOne
    @JoinColumn
    private Hotel hotel;

    @ManyToMany(mappedBy = "chambres")
    private Set<Reservation> reservations;

}
