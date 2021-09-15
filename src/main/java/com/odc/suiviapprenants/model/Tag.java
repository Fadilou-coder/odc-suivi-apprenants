package com.odc.suiviapprenants.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
@Data
public class Tag extends AbstractEntity {

    private String libelle;

    @ManyToMany
    private Collection<GroupeCompetence> groupeCompetences;

    @ManyToMany(mappedBy = "tags")
    private Collection<GroupeTag> groupeTags;
}
