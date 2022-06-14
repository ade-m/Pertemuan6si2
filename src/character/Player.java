package character;

import util.Poin;

public class Player {
    //hp, agi,stamina, attk, tinggi
    private int hp, agi,stamina, attk, tinggi;
    //posisi
    private Poin posisi;
    //uang
    private int uang=0;


    public Player(int hp, int agi, int stamina, int attk, int tinggi, Poin posisi, int uang) {
        this.hp = hp;
        this.agi = agi;
        this.stamina = stamina;
        this.attk = attk;
        this.tinggi = tinggi;
        this.posisi = posisi;
        this.uang = uang;
    }

    //ulti, jalan, lari, lompat, jongkok, serang
    public void jalan(){
        stamina +=(stamina>=100?0:3);
        posisi.setX(posisi.getX()+5);
        System.out.println("Player sedang berjalan");
    }
    public void lari(){
        if(stamina-5>0){
        this.stamina-=5;
        posisi.setX(posisi.getX()+10);
        System.out.println("Player sedang berlari");
        }
        else{
            System.out.println("Stamina habis, player tidak bisa berlari");
        }
    }
    public void lompat(){
        posisi.setY(posisi.getY()+10);
        System.out.println("Player sedang melompat");
    }
    public void jongkok(){}
    public void serang(){}
    public void ulti(){}

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAgi() {
        return this.agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getAttk() {
        return this.attk;
    }

    public void setAttk(int attk) {
        this.attk = attk;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public Poin getPosisi() {
        return this.posisi;
    }

    public void setPosisi(Poin posisi) {
        this.posisi = posisi;
    }

    public int getUang() {
        return this.uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

}
