/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author PC
 */
public class PlayerSet {
    private List<Bullet> set;
    
    public PlayerSet(){
        set = new ArrayList<>();
        Bullet Common = new Bullet("Common", 1, 1, 1); // no added effects
        Bullet Golden = new Bullet("Golden", 1, 1, 1); // if hit opposing player loses turn
        Bullet Tailed = new Bullet("Tailed", 1, 1, 1); // random hit zone, in any tile in the range of 5 from the one chosen
        Bullet Angry = new Bullet("Angry", 2, 1, 1); // if hit 2 times in a row with this one, next turn double damage
        Bullet Turbo = new Bullet("Turbo", 3, 1, 2); // no added effect
        Bullet Bomb = new Bullet("Bomb", 1, 9, 3); // hits chosen tile and the 8 surronding it
        Bullet Hammer = new Bullet("Hammer", 1, 5, 5); // hits 5 times, 1 in the chosen tile, 4 more in random surronding ones (in a range of 5 tiles)
        Bullet Ghost = new Bullet("Ghost", 1, 1, 3); // if hit, destroys it instantly, if fails loses player's turn
    }

    public List<Bullet> getSet() {
        return set;
    }
    
    public void destryedCanon(Bullet bullet){
        if(bullet.getResistance() == 0){
            set.remove(bullet);
        }
    }
    
    public void inflictDamage(int damage, Bullet bullet){
        int left = bullet.getResistance() - damage;
        bullet.setResistance(left);
    }
}
