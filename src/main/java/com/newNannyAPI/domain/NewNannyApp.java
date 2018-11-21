package com.newNannyAPI.domain;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;

public class NewNannyApp {
	
	@Id
		Integer id;
		
		String description;
		
		String notes;
		
		String day;
		
		String time;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getDay() {
			return day;
		}
		public void setDay(String day) {
			this.day = day;
		}


}
