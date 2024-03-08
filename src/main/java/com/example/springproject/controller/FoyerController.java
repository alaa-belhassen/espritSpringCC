package com.example.springproject.controller;

import com.example.springproject.models.Foyer;
import com.example.springproject.service.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {

    @PutMapping("/addFoyerWithBloc")
    public Foyer addFoyerWithBloc(@RequestBody Foyer e){
        return foyerService.addFoyerWithBloc(e);

    }

    IFoyerService foyerService;

    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;

    }

    @GetMapping("/retrieve-foyers/{foyers-id}")
    public Foyer retrieveFoyer(@PathVariable("foyers-id") Long foyersId) {
        return foyerService.retrieveFoyer(foyersId);
    }

    @PostMapping("/add-foyers")
    public Foyer addFoyer(@RequestBody Foyer e) {
        Foyer foyers = foyerService.addFoyer(e);
        return foyers;
    }

    @DeleteMapping("/delete-foyers/{foyers-id}")
    public void removeFoyer(@PathVariable("foyers-id") Long foyersId){
        foyerService.removeFoyer(foyersId);
    }
    @PutMapping("/update-foyers")
    public Foyer updateFoyer(@RequestBody Foyer e){
        Foyer foyer = foyerService.updateFoyer(e);
        return foyer;
    }
}
