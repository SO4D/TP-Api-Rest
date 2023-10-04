package com.facu.restfake.RestfakeApplication.services;

import com.facu.restfake.RestfakeApplication.entities.Autor;
import com.facu.restfake.RestfakeApplication.repositories.persona.AutorRepository;
import com.facu.restfake.RestfakeApplication.repositories.persona.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

        @Autowired
        private AutorRepository autorRepositoryRepository;
        public  AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository ) {
            super((baseRepository));
            this.autorRepositoryRepository = autorRepository;
        }


}

