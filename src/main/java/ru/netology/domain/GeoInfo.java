package ru.netology.domain;

public class GeoInfo {

    public String getTypeGeo() {
        return typeGeo;
    }

    public void setTypeGeo(String typeGeo) {
        this.typeGeo = typeGeo;
    }

    public String getCoordinatesGeo() {
        return coordinatesGeo;
    }

    public void setCoordinatesGeo(String coordinatesGeo) {
        this.coordinatesGeo = coordinatesGeo;
    }

    private String typeGeo; // тип места
    private String coordinatesGeo; // координаты места
}
