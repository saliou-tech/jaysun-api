package com.Jaysun.Jaysun.Repository;

import com.Jaysun.Jaysun.Entity.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Member;
import java.util.Optional;

public interface MembreRepository extends JpaRepository<Membre,Long> {
    Optional<Membre> findByNom(String nom);

}
