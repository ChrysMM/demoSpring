package com.example1.demoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetController {

    @Autowired
    ZooService zooService;

    @GetMapping("afficheTigres")

    //public List<Tigre> Tigre(){
    //Tigre lola = new Tigre();
    //lola.setNom("lola");
    //lola.setAge(5);
    //lola.setCouleur("blanc");
    //lola.setVaccin(false);

    //Tigre mike = new Tigre();
    //mike.setNom("mike");
    //mike.setAge(4);
    //mike.setCouleur("roux");
    //mike.setVaccin(true);

    //ArrayList<Tigre> tigres = new ArrayList<Tigre>();
    //tigres.add(mike);
    //tigres.add(lola);
    //return tigres;

    //}

    public List<Tigre> afficherLesTigres() {

        return zooService.getTigres();
    }

    @PostMapping("tigrePost")
    public void createTigre(@RequestBody Tigre nouveauTigre) {
        zooService.addTigre(nouveauTigre);
    }
}

