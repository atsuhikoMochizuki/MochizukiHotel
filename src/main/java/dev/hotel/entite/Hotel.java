package dev.hotel.entite;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
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
public class Hotel extends BaseEntite {

    @Column(unique = true, nullable = false)
    private String nom;

    private Integer nombreEtoiles;

    @OneToMany(mappedBy = "hotel")
    private Set<Chambre> chambres;

}
