package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

//    @NotBlank(message = "Cannot be blank")
    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

   @ManyToOne
   private Employer employer;

    // Initialize the id and value fields.
    public Job(Employer employer) {
        this.employer = employer;
    }

    public Job() {
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }


}
