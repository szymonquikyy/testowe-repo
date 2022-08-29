package spokko.schemas.service;

import org.springframework.stereotype.Service;
import spokko.schemas.entity.Bomb;

import java.util.List;

@Service
public interface BombService {
    List<Bomb> getBombs();

    void addBomb(Bomb bomb);

    Bomb getBomb(Long id);

    void editBomb(Bomb bomb);
}
