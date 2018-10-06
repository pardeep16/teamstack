package site.techpryde.teamstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.techpryde.teamstack.models.Project;

@Repository
public interface IProjectDetlRepository extends JpaRepository<Project,Long> {
	
}
