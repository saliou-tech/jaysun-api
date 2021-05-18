package com.Jaysun.Jaysun.Controller;

import com.Jaysun.Jaysun.Entity.Cellule;
import com.Jaysun.Jaysun.Entity.Membre;
import com.Jaysun.Jaysun.Repository.MembreRepository;
import com.Jaysun.Jaysun.Service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/Jaysun")
public class MembreController {
    @Autowired
    private   MembreService membreService;
    @Autowired
    private  MembreRepository membreRepository;

    @PostMapping("/Addmembre")
    public Membre CreateMembre(@RequestBody Membre membre)  {
        return  membreService.SaveMembre(membre);
    }
    @GetMapping("AllMembre")
    public List<Membre> getAllMembre(){
        return  membreService.getAllMembre();
    }
}
