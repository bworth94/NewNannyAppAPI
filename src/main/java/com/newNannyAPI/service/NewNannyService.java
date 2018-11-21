package com.newNannyAPI.service;

import java.util.List;

import com.newNannyAPI.domain.NewNannyApp;

public interface NewNannyService {
List<NewNannyApp> findAll();
	
	List<NewNannyApp> findByDay(String day);
	
	List<NewNannyApp> findByDayAndTime(String day, String time);

	void saveOrUpdateTask(NewNannyApp nannyapp);
	
	void deleteTask(String id);
}
