package dev.hotel.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import lombok.*;

@Entity

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Reservation extends BaseEntite {

    private LocalDate dateDebut;
    private LocalDate dateFin;

    @ManyToOne
    @JoinColumn
    private Client client;

    @ManyToMany
    @JoinTable(name = "res_ch", joinColumns = @JoinColumn(name = "ID_RES", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "ID_CH", referencedColumnName = "id"))
    private Set<Chambre> chambres;
}
