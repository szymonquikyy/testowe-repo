package spokko.schemas.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spokko.schemas.entity.Bomb;
import spokko.schemas.enums.BombEnum;
import spokko.schemas.repo.BombRepository;

import java.util.List;

@Configuration
public class DatabaseInputOnStartUp {

    @Autowired
    private BombRepository bombRepository;

    @Bean
    CommandLineRunner commandLineRunner(BombRepository bombRepository) {
        return args -> {
            Bomb bombBasic = Bomb.builder()
                    .name("Basic Bomb")
                    .slug("bomb_basic")
                    .firstDamageType(BombEnum.KINETIC)
                    .firstDamageValue(1000)
                    .secondDamageType(BombEnum.SILVER)
                    .secondDamageValue(500)
                    .build();

            Bomb bombMoondust = Bomb.builder()
                    .name("Moondust Bomb")
                    .slug("bomb_moondust")
                    .firstDamageType(BombEnum.SILVER)
                    .firstDamageValue(1200)
                    .secondDamageType(BombEnum.FIRE)
                    .secondDamageValue(700)
                    .build();

            Bomb bombGrapeshot = Bomb.builder()
                    .name("Grapeshot Bomb")
                    .slug("bomb_grapeshot")
                    .firstDamageType(BombEnum.STEEL)
                    .firstDamageValue(900)
                    .secondDamageType(BombEnum.KINETIC)
                    .secondDamageValue(500)
                    .build();

            Bomb bombDancingStar = Bomb.builder()
                    .name("Dancingstar Bomb")
                    .slug("bomb_dancingstar")
                    .firstDamageType(BombEnum.FIRE)
                    .firstDamageValue(1500)
                    .secondDamageType(BombEnum.STEEL)
                    .secondDamageValue(300)
                    .build();

            bombRepository.saveAll(List.of(bombBasic, bombMoondust, bombGrapeshot, bombDancingStar));
        };
    }
}
