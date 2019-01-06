package com.comics.ComicsAPIRest.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comic {
	
		@Id
		@GeneratedValue
		public int id;
		public String nom;
		public String sexe;
		public String race;
		public String imageUrl;
		

		public Comic() {
			// TODO Auto-generated constructor stub
		}
		

		
		public Comic(int i, String string, String string2, String string3, String string4) {
			// TODO Auto-generated constructor stub
		}



		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String name) {
			this.nom = name;
		}
		public String getSexe() {
			return sexe;
		}
		public void setSexe(String joueDans) {
			this.sexe = joueDans;
		}
		public String getRace() {
			return race;
		}
		public void setRace(String race) {
			this.race = race;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		@Override
		public String toString() {
			return "Comic [id=" + id + ", nom=" + nom + ", sexe=" + sexe + ", race=" + race + ", imageUrl=" + imageUrl
					+ "]";
		}
		
		
}
