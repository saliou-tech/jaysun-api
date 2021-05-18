package com.Jaysun.Jaysun.Service;

import com.Jaysun.Jaysun.Entity.Membre;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MembreService {
    Membre SaveMembre(Membre membre);
    public List<Membre> getAllMembre();
}
