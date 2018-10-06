package site.techpryde.teamstack.controllers;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import site.techpryde.teamstack.models.Project;
import site.techpryde.teamstack.services.IProjectDetlServices;
import site.techpryde.teamstack.services.ProjectDetlServicesImpl;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectDetailsController extends ProjectDetlServicesImpl{
		
	@GetMapping
	 public List<Project> getProjectAll(){
		
		System.out.println("Print");
		return getAllProjects(); 
	}
	
	
	@GetMapping("/{id}")
	public Project get(@PathVariable("id") long id) {
		return getProject(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Project project) {
		create(project);
	}
	
}
