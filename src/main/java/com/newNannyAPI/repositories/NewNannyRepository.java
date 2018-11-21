package com.newNannyAPI.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.newNannyAPI.domain.NewNannyApp;

public interface NewNannyRepository extends CrudRepository<NewNannyApp, Integer>{
	
	List<NewNannyApp> findByDay(String day);
	
	List<NewNannyApp> findByDayAndTime(String day, String time);

}
