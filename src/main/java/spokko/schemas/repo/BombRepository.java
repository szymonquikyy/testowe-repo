package spokko.schemas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spokko.schemas.entity.Bomb;

@Repository
public interface BombRepository extends JpaRepository<Bomb, Long> {
}
