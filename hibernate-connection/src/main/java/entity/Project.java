package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "project_mapping_table")
public class Project {
	@Id
	@Column(name = "p_id")
	private int pid;
	
	@Column(name = "project_name")
	private String projectName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Employee> employees;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Project(int pid, String projectName, List<Employee> employees) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.employees = employees;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
