package br.com.dev.entity;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion champion){

        int attack = attackToArmor(champion.getAttack());

        this.life = this.life - attack;

        if(this.life < 0){
            this.life = 0;
        }
    }

    private int attackToArmor(int championAttack) {

        int attack = championAttack - this.armor;

        if (attack <= 0)
            return 1;

        return attack;
    }

    public String status(){

        String morreu = this.life > 0 ? "" : " (morreu)";

        return this.name + " : " + this.life + " de vida" + morreu;
    }


}
