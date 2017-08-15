/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.arthurmp.model;

/**
 *
 * @author pixels
 */
public class Cartesian3D {
    private Cartesian2D xy;
    private double z;

    public Cartesian3D(double x, double y, double z) {
        xy = new Cartesian2D(x, y);
        this.z = z;
    }

    public double getX() {
        return xy.getX();
    }

    public void setX(double x) {
        xy.setX(x);
    }

    public double getY() {
        return xy.getY();
    }

    public void setY(double y) {
        xy.setY(y);
    }
    
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return xy.toString() + ", z=" + z;
    }
}
