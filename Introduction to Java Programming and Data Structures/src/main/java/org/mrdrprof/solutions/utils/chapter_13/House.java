package org.mrdrprof.solutions.utils.chapter_13;

import lombok.Getter;

import java.util.Date;

@Getter
public class House implements Cloneable, Comparable<House> {

    private final int id;
    private double area;
    private final Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    /**
     * Override the protected clone method defined in
     * the Object class, and strengthen its accessibility.
     * NOTE: as best practice it better to Remove this "clone" implementation; use a copy constructor or copy factory instead.
     */
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int compareTo(House o) {
        return Double.compare(area, o.area);
    }
}
