package spokko.schemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spokko.schemas.entity.Bomb;
import spokko.schemas.repo.BombRepository;
import spokko.schemas.service.BombService;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class BombController {

    @Autowired
    private BombRepository bombRepository;

    @Autowired
    private BombService bombService;

    @GetMapping(path = "/bombs")
    public List<Bomb> getBombs(){
        return bombService.getBombs();
    }


    @GetMapping(path = "/bombs/view/{id}")
    public Bomb getBomb(@PathVariable ("id") Long id){
        return bombService.getBomb(id);
    }

    @PostMapping(path = "/bombs")
    public void addBomb(@RequestBody Bomb bomb) {
        bombService.addBomb(bomb);
    }

    @PostMapping(path = "/bombs/edit")
    public void editBomb(@RequestBody Bomb bomb){
        bombService.editBomb(bomb);
    }

    @DeleteMapping(path = "/bombs/delete/{id}")
    public void deleteBomb(@PathVariable ("id") Long id){
        bombRepository.delete(bombRepository.findById(id).get());
    }
}
