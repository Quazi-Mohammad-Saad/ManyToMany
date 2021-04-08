package com.mtm;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int eid;
    private String name;
    @ManyToMany
    @JoinTable(name = "Emp_Pro", joinColumns = {@JoinColumn(name = "eid")},
            inverseJoinColumns = {@JoinColumn(name = "pid")})
    private List<Project> projects;

    public Employee() {
        super();
    }

    public Employee(int eid, String name, List<Project> projects) {
        super();
        this.eid = eid;
        this.name = name;
        this.projects = projects;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
