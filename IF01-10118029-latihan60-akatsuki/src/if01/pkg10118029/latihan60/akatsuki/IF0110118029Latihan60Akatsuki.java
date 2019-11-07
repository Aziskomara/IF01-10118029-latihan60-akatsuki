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
public class IF0110118029Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cloth = "Black Red Cloud";
        String goal = "Gathering all Jinchuriki";
        
        memberakatsuki deidara = new memberakatsuki("Deidara", "Iwagakure", "Explosive Clay", "S-Rank Missing Ninja", "Explosive Release", "Killed in Battle by Chiyo", true, cloth, goal);
        memberakatsuki sasori = new memberakatsuki("Sasori", "Sunagakure", "Hiruko", "S-Rank Missing Ninja from Sunagakure's Puppet Brigade", "Puppet Mastery", "Killed in Battle by Sakura", true, cloth, goal);
        memberakatsuki kisame = new memberakatsuki("Kisame Hoshigaki", "Kirigakure", "Samehada", "S-Rank Missing Ninja", "Shark-o-mation", "Committed Suicide", true, cloth, goal);
        memberakatsuki itachi = new memberakatsuki("Itachi Uchiha", "Konohagakure", "Kunai", "Anbu Captain Missing Ninja", "Mangekyo Sharingan", "Killed by his own brother", true, cloth, goal);
        memberakatsuki orochimaru = new memberakatsuki("Orochimaru", "Konohagakure", "Snakes", "Konohagakure's Legendary Sannin", "Power of White Snake", "Killed & Revived by Sasuke", false, cloth, goal);
        
        System.out.println("Akatsuki Clan");
        System.out.println("=============");
        System.out.println();
        System.out.println("Cloth : " + deidara.getClothes());
        System.out.println("Goal : " + deidara.getGoals());
        System.out.println();
        
        deidara.displayMember();
        sasori.displayMember();
        kisame.displayMember();
        itachi.displayMember();
        orochimaru.displayMember();
    
    }
    
}
