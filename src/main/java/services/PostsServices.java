package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import blogFormation.models.Formation;
import blogFormation.models.Student;

public class PostsServices {
	
	private static PostsServices instances = null;
	private List<Student> students = new ArrayList<Student>();
	private List<Formation> formations = new ArrayList<Formation>();
	
	private PostsServices() {
		for (int i = 1; i < 5; i++) {
    		formations.add(new Formation("Titre" + i, "Programme" + i ,20 +i));
    	}
    	
    	for (int i = 0; i <10; i++) {
    		//int nombre = new Random().nextInt(students.size());
    		//students.add(new Student("Nom"+i,"Prenom"+i,20,10+i,formations.get(nombre)));
    		students.add(new Student("Nom"+i,"Prenom"+i,20,10+i,formations.get(1)));
    	}	
	}
	
	public static PostsServices getInstance() {
		if (PostsServices.instances == null) {
			PostsServices.instances = new PostsServices();
		}
		return instances;
	}
	
	public List<Formation> getFormations() {
		return this.formations; 
	}
	
	public Formation getFormationByName(String title) {
		Formation response = null;
		for (Formation formation : formations) {
			if (formation.getTitle().equals(title)) {
				response = formation;
				break;
			}
		}
		return response;
	}

}