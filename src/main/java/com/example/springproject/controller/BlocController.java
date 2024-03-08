package com.example.springproject.controller;

import com.example.springproject.models.Bloc;
import com.example.springproject.service.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/bloc")
public class BlocController {

    IBlocService blocService;

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        return listBlocs;

    }

    @GetMapping("/retrieve-blocs/{blocs-id}")
    public Bloc retrieveBloc(@PathVariable("blocs-id") Long blocsId) {
        return blocService.retrieveBloc(blocsId);
    }

    @PostMapping("/add-blocs")
    public Bloc addBloc(@RequestBody Bloc e) {
        Bloc blocs = blocService.addBloc(e);
        return blocs;
    }

    @DeleteMapping("/delete-blocs/{blocs-id}")
    public void removeBloc(@PathVariable("blocs-id") Long blocsId){
        blocService.removeBloc(blocsId);
    }

    @PutMapping("/update-blocs")
    public Bloc updateBloc(@RequestBody Bloc e){
        Bloc blocs = blocService.updateBloc(e);
        return blocs;
    }
}
