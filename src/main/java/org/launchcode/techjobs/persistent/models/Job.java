package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Job extends AbstractEntity{

    @NotBlank(message = "Cannot be blank")
    private String skills;

   @ManyToOne
   private Employer employer;

    // Initialize the id and value fields.
    public Job(Employer employer, String someSkills) {
        super();
        this.employer = employer;
        this.skills = someSkills;
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

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    //@Override

}
