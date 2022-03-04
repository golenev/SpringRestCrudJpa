package project.repositories;

import project.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}