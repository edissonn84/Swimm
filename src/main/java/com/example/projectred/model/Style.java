package com.example.projectred.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Style {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long styleID;

    @Column(nullable = false, length = 50)
    private String nameStyle;

    public Style() {
    }

    public Style(Long styleID, String nameStyle) {
        this.styleID = styleID;
        this.nameStyle = nameStyle;
    }

    public Long getStyleID() {
        return styleID;
    }

    public void setStyleID(Long styleID) {
        this.styleID = styleID;
    }

    public String getNameStyle() {
        return nameStyle;
    }

    public void setNameStyle(String nameStyle) {
        this.nameStyle = nameStyle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Style style = (Style) o;
        return styleID.equals(style.styleID) && nameStyle.equals(style.nameStyle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(styleID, nameStyle);
    }
}
