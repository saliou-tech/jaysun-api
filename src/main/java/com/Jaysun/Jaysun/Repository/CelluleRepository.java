package com.Jaysun.Jaysun.Repository;

import com.Jaysun.Jaysun.Entity.Cellule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CelluleRepository extends JpaRepository<Cellule, Long> {

}
