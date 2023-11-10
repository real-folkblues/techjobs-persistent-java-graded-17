package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Job extends AbstractEntity{

    @NotBlank(message = "Cannot be blank")
    private String skills;

   @ManyToOne
   @NotBlank(message = "Cannot be blank")
    private String employer;


    // Initialize the id and value fields.
    public Job(String Employer, String someSkills) {
        super();
        this.employer = Employer;
        this.skills = someSkills;
    }

    public Job() {
    }

    // Getters and setters.


    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    //@Override public String toString() {return name;}

}
