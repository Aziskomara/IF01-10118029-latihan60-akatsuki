/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan60.akatsuki;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Akatsuki
 */
public class akatsuki {
    protected  String clothes;
    protected  String goals;

    public akatsuki(String clothes, String goals) {
        this.clothes = clothes;
        this.goals = goals;
        
        clothes = "Black Red Cloud";
        goals = "Gathering all Jinchuriki";
        
    }

    public String getClothes() {
        return clothes;
    }

    public String getGoals() {
        return goals;
    }
}
