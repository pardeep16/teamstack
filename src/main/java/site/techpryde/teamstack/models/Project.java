package site.techpryde.teamstack.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long projectId;
	
	private String projectName;
	private String projectRepo;
	private String projectType;
	
	
	

	public Project(Long projectId, String projectName, String projectRepo, String projectType) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectRepo = projectRepo;
		this.projectType = projectType;
	}
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectRepo() {
		return projectRepo;
	}
	public void setProjectRepo(String projectRepo) {
		this.projectRepo = projectRepo;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	
	
}
