package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.Size;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 20)
    private String location;

    @OneToMany
    @JoinColumn(name = "employer")
    private List<Job> jobs = new ArrayList<>();


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
}
