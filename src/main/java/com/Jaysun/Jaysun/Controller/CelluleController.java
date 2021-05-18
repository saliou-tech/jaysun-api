package com.Jaysun.Jaysun.Controller;

import com.Jaysun.Jaysun.Entity.Cellule;
import com.Jaysun.Jaysun.Repository.CelluleRepository;
import com.Jaysun.Jaysun.Service.CelluleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/Jaysun")
public class CelluleController {
@Autowired
    private CelluleService celluleService;
@Autowired
    private CelluleRepository celluleRepository;

    @PostMapping("/Addcellule")
    public Cellule CreateCellule(@RequestBody Cellule cellule)  {
        return  celluleService.Savecellule(cellule);
    }
    @GetMapping("AllCellule")
    public List<Cellule> getAllcellule(){
        return  celluleService.getAllCellule();
    }
}
