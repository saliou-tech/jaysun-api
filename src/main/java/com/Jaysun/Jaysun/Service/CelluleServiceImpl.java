package com.Jaysun.Jaysun.Service;

import com.Jaysun.Jaysun.Entity.Cellule;
import com.Jaysun.Jaysun.Repository.CelluleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CelluleServiceImpl  implements  CelluleService{
    private  final  CelluleRepository celluleRepository;

    public CelluleServiceImpl(CelluleRepository celluleRepository) {
        this.celluleRepository = celluleRepository;
    }

    @Override
    public Cellule Savecellule(Cellule cellule) {
        return celluleRepository.save(cellule);
    }

    @Override
    public List<Cellule> getAllCellule() {
        return celluleRepository.findAll();
    }
}
