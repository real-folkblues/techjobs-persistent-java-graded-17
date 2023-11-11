package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Cannot be blank")
    @Size(max = 20, message = "Limited to 20 characters")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer")
    private List<Job> jobs = new ArrayList<>();


    public Employer(String location){
        this.location = location;
    }

    public Employer(){

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    //@Override public String toString() {return location;}
}
