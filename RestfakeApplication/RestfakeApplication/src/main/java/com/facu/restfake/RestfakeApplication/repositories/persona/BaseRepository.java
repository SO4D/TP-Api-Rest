package com.facu.restfake.RestfakeApplication.repositories.persona;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.facu.restfake.RestfakeApplication.entities.Base;

@NoRepositoryBean
public interface BaseRepository <E extends Base, id extends Serializable> extends JpaRepository<E,id> {
    
}
