package com.example1.demoSpring;

import java.util.ArrayList;
import java.util.List;

import com.example1.demoSpring.TigreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ZooService {

    @Autowired

    TigreRepository tigreRepository;
    private List<Tigre> tousLesTigres = new ArrayList<Tigre>();
    public List<Tigre> getTigres(){
        return tigreRepository.findAll() ;
    }
    public void addTigre(Tigre nouveauTigre) {
        tigreRepository.save(nouveauTigre);
    }


}
