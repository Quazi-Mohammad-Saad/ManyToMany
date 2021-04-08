package com.mtm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project {
    @Id
    private int pid;
    @Column(name = "project_name")
    private String projecName;
    @ManyToMany(mappedBy = "projects")
    private List<Employee> employeeList;

    public Project() {
        super();
    }

    public Project(int pid, String projecName, List<Employee> employeeList) {
        this.pid = pid;
        this.projecName = projecName;
        this.employeeList = employeeList;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjecName() {
        return projecName;
    }

    public void setProjecName(String projecName) {
        this.projecName = projecName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
