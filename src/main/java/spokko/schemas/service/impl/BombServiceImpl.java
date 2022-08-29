package spokko.schemas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spokko.schemas.entity.Bomb;
import spokko.schemas.repo.BombRepository;
import spokko.schemas.service.BombService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BombServiceImpl implements BombService {

    @Autowired
    private BombRepository bombRepository;

    @Override
    public List<Bomb> getBombs() {
        return bombRepository.findAll();
    }

    @Override
    public void addBomb(Bomb bomb) {
        bombRepository.save(bomb);
    }

    @Override
    public Bomb getBomb(Long id) {
        return bombRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void editBomb(Bomb bomb) {
        Bomb bombDB = bombRepository.findById(bomb.getId()).get();

        if(!bombDB.equals(bomb.getName())){
            bombDB.setName(bomb.getName());
        }

        bombRepository.save(bombDB);
    }
}
