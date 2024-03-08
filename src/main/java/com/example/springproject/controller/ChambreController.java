package com.example.springproject.controller;

import com.example.springproject.models.Chambre;
import com.example.springproject.models.TypeC;
import com.example.springproject.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/chambre")
public class ChambreController {
    IChambreService chambreService;

    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.retrieveAllChambres();
        return listChambres;

    }
    @GetMapping("/getChambreparNomBloc/{nomBloc}")
    public List<Chambre> getChambreparNomBloc(@PathVariable("nomBloc") String blocNom) {
        List<Chambre> listChambres = chambreService.getChmabresParNomBloc(blocNom);
        return listChambres;

    }

    @GetMapping("/nbrChambreByBlocType/{nomBloc}/{type}")
    public int nbrChambreByBlocType(@PathVariable("nomBloc") String nomBloc, @PathVariable("type")TypeC c) {
        return chambreService.nbrFindAllByBlocNomBlocAndTypechambre(nomBloc,c);

    }

    @GetMapping("/retrieve-chambres/{chambres-id}")
    public Chambre retrieveChambre(@PathVariable("chambres-id") Long chambresId) {
        return chambreService.retrieveChambre(chambresId);
    }

    @PostMapping("/add-chambres")
    public Chambre addChambre(@RequestBody Chambre e) {
        Chambre chambres = chambreService.addChambre(e);
        return chambres;
    }

    @DeleteMapping("/delete-chambres/{chambres-id}")
    public void removeChambre(@PathVariable("chambres-id") Long chambresId){
        chambreService.removeChambre(chambresId);
    }

    @PutMapping("/update-chambres")
    public Chambre updateChambre(@RequestBody Chambre e){
        Chambre chambres = chambreService.updateChambre(e);
        return chambres;
    }
}
