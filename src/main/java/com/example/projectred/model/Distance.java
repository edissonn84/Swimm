package com.example.projectred.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Distance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long distanceID;

    @Column(nullable = false)
    private Integer lenghtDistance;

    public Distance() {
    }

    public Distance(Long distanceID, Integer lenghtDistance) {
        this.distanceID = distanceID;
        this.lenghtDistance = lenghtDistance;
    }

    public Long getDistanceID() {
        return distanceID;
    }

    public void setDistanceID(Long distanceID) {
        this.distanceID = distanceID;
    }

    public Integer getLenghtDistance() {
        return lenghtDistance;
    }

    public void setLenghtDistance(Integer lenghtDistance) {
        this.lenghtDistance = lenghtDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance = (Distance) o;
        return distanceID.equals(distance.distanceID) && lenghtDistance.equals(distance.lenghtDistance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distanceID, lenghtDistance);
    }
}
