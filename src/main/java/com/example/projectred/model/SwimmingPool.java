package com.example.projectred.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class SwimmingPool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long poolID;

    @Column(nullable = false)
    private Integer trackLenght;

    public SwimmingPool() {
    }

    public SwimmingPool(Long poolID, Integer trackLenght) {
        this.poolID = poolID;
        this.trackLenght = trackLenght;
    }

    public Long getPoolID() {
        return poolID;
    }

    public void setPoolID(Long poolID) {
        this.poolID = poolID;
    }

    public Integer getTrackLenght() {
        return trackLenght;
    }

    public void setTrackLenght(Integer trackLenght) {
        this.trackLenght = trackLenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SwimmingPool that = (SwimmingPool) o;
        return poolID.equals(that.poolID) && trackLenght.equals(that.trackLenght);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolID, trackLenght);
    }
}
