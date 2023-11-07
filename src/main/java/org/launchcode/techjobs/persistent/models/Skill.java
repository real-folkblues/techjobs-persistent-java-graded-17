package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min = 1)
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }
    public Skill(String description){

    }


}
