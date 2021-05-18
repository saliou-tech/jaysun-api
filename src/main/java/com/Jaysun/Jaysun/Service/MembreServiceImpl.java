package com.Jaysun.Jaysun.Service;

import com.Jaysun.Jaysun.Entity.Cellule;
import com.Jaysun.Jaysun.Entity.Membre;
import com.Jaysun.Jaysun.Repository.MembreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MembreServiceImpl implements MembreService {
    private  final MembreRepository membreRepository;

    public MembreServiceImpl(MembreRepository membreRepository) {
        this.membreRepository = membreRepository;
    }

    @Override
    public Membre SaveMembre(Membre membre) {
        return membreRepository.save(membre);
    }

    @Override
    public List<Membre> getAllMembre() {
        return membreRepository.findAll();
    }
}
