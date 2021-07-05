package com.example1.demoSpring;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TigreRepository extends JpaRepository<Tigre, Long> {
    public List<Tigre> findAllByNom(String nom);

}
