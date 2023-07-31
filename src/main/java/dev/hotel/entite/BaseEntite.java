package dev.hotel.entite;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
@MappedSuperclass
/*
 * Une classe annotée @MappedSuperClass est aussi une classe "persistante", mais
 * ce ne n'est pas une entité, et à ce titre, on ne peut donc pas faire de
 * requêtes dessus. Ses champs sont enregistrés en base, et sont associés aux
 * champs de toutes les entités des sous-classes de cette classe.
 */
public abstract class BaseEntite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;
}
