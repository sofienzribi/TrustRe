package al.assu.trust.GestionImageSinistre.impl;

import java.util.List;

import javax.ejb.Local;

import al.assu.trust.GestionImageSinistre.domain.Project;
import al.assu.trust.GestionImageSinistre.domain.User;

@Local
public interface ProjectServicesLocal {

	public void NewProject(Project project);

	public List<Project> GetProjectsByUser(User user);
	public List<Project> GetProjectsByUserNonDistinct(User user);

	public Project GetProjectByName(String Name);

	public List<Project> GetAllProjects();

	public void DeleteProject(int project);

	public boolean Nameexist(String Name);

	public Project GetProjectById(int id);

	public void UpdateProject(Project project);

	public List<Project> GetAllDistinctProjects();

	public List<Project> GetProjectsByName(String Name);

}
