package com.comics.ComicsAPIRest.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comic {
	
		@Id
		@GeneratedValue
		private int id;
		private String name;
		private String joueDans;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getJoueDans() {
			return joueDans;
		}
		public void setJoueDans(String joueDans) {
			this.joueDans = joueDans;
		}
		@Override
		public String toString() {
			return "Comic [id=" + id + ", name=" + name + ", joueDans=" + joueDans + "]";
		}
		
}
