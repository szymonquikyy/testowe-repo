package spokko.schemas.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;
import spokko.schemas.enums.BombEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Builder
public class Bomb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String slug;
    private BombEnum firstDamageType;
    private int firstDamageValue;
    private BombEnum secondDamageType;
    private int secondDamageValue;


    public Bomb() {
    }

    public Bomb(String name, String slug, BombEnum firstDamageType, int firstDamageValue, BombEnum secondDamageType, int secondDamageValue) {
        this.name = name;
        this.slug = slug;
        this.firstDamageType = firstDamageType;
        this.firstDamageValue = firstDamageValue;
        this.secondDamageType = secondDamageType;
        this.secondDamageValue = secondDamageValue;
    }

    public Bomb(Long id, String name, String slug, BombEnum firstDamageType, int firstDamageValue, BombEnum secondDamageType, int secondDamageValue) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.firstDamageType = firstDamageType;
        this.firstDamageValue = firstDamageValue;
        this.secondDamageType = secondDamageType;
        this.secondDamageValue = secondDamageValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public BombEnum getFirstDamageType() {
        return firstDamageType;
    }

    public void setFirstDamageType(BombEnum firstDamageType) {
        this.firstDamageType = firstDamageType;
    }

    public int getFirstDamageValue() {
        return firstDamageValue;
    }

    public void setFirstDamageValue(int firstDamageValue) {
        this.firstDamageValue = firstDamageValue;
    }

    public BombEnum getSecondDamageType() {
        return secondDamageType;
    }

    public void setSecondDamageType(BombEnum secondDamageType) {
        this.secondDamageType = secondDamageType;
    }

    public int getSecondDamageValue() {
        return secondDamageValue;
    }

    public void setSecondDamageValue(int secondDamageValue) {
        this.secondDamageValue = secondDamageValue;
    }

}
