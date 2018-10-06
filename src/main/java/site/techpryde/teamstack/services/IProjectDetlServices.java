package site.techpryde.teamstack.services;

import java.util.List;

import site.techpryde.teamstack.models.Project;

public interface IProjectDetlServices {
	
	/*
	 * 
	 */
	List<Project> getAllProjects();
	
	/*
	 * 
	 */
	public Project getProject(Long id);
	
	/*
	 * 
	 */
	
	/*
	 * 
	 */
	
	public void creatProject(Project project);
	

}