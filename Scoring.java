/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

import java.io.Serializable;

public class Scoring  implements Serializable {
    private int score;
    private String naam;

    public int getScore() {
        return score;
    }

    public String getNaam() {
        return naam;
    }

    public Scoring(String naam, int score) {
        this.score = score;
        this.naam = naam;
    }
}

