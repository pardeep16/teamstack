package site.techpryde.teamstack.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.techpryde.teamstack.models.Project;
import site.techpryde.teamstack.repository.IProjectDetlRepository;

@Service
public class ProjectDetlServicesImpl implements IProjectDetlServices {
	
 	/*@Autowired
	private IProjectDetlRepository projectDetlRepository;
	*/
 	
	@Override
	public List<Project> getAllProjects(){
		List<Project> arrayList=new ArrayList<>();
		arrayList.add(new Project(10123L,"SimpleApp","github.com/simpleapp","Spring"));
		//return projectDetlRepository.findAll();
		return arrayList;
		
	}

	@Override
	public Project getProject(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creatProject(Project project) {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public Project getProject(Long id) {
//		// TODO Auto-generated method stub
//		return projectDetlRepository.getOne(id);
//	}
//
//	@Override
//	public void creatProject(Project project) {
//		// TODO Auto-generated method stub
//		projectDetlRepository.save(project);
//		
//	}
}
