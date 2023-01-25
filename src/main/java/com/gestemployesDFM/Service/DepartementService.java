package com.gestemployesDFM.Service;

import com.gestemployesDFM.entity.Departement;
import com.gestemployesDFM.repository.DepartementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementService {
    @Autowired
    private DepartementRepo drepo;

    public List<Departement> listAll() {

        return drepo.findAll();
    }
}