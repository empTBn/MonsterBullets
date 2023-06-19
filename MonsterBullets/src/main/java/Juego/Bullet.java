/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author PC
 */
public class Bullet {
    private String type;
    private int range;
    private int damage;
    private int resistance;

    public Bullet(String type, int damage, int range, int resistance) {
        this.type = type;
        this.range = range;
        this.damage = damage;
        this.resistance = resistance;
    }

    public String getType() {
        return type;
    }

    public int getRange() {
        return range;
    }

    public int getDamage() {
        return damage;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }
    
    
    
    
}
