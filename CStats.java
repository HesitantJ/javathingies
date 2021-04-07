
import javax.swing.JSpinner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class CStats {

    String name;
    String race;
    int PD;
    int strength;
    int dexterity;
    int speed;
    int endurance;
    int smarts;
    int psyche;
    int senses;
    
    int movement;
    int health;
    int talentPD;
    int sanity;
    int deckOfFortune;
    int actionPoints;
    int durability;
    int maxPD;
    int mana;
    int dmgreduction;
    
    /**
     * 
     * @param name imię
     * @param race rasa
     * @param PD punkty doświadczenia
     * @param strength
     * @param dexterity
     * @param speed
     * @param endurance
     * @param smarts
     * @param psyche
     * @param senses
     * @param movement
     * @param health
     * @param talentPD
     * @param sanity
     * @param deckOfFortune
     * @param actionPoints
     * @param durability
     * @param maxPD
     * @param mana
     * @param dmgreduction 
     */
    CStats(String name, String race, int PD, int strength, int dexterity, int speed, int endurance, int smarts, int psyche, int senses, int movement, int health, int talentPD,
            int sanity, int deckOfFortune, int actionPoints, int durability, int maxPD, int mana, int dmgreduction)
    { 
        this.name = name;
        this.race = race;
        this.PD=PD;
        this.strength=strength;
        this.dexterity=dexterity;
        this.speed=speed;
        this.endurance=endurance;
        this.smarts=smarts;
        this.psyche=psyche;
        this.senses=senses;
        this.movement=movement;
        this.health=health;
        this.talentPD=talentPD;
        this.sanity=sanity;
        this.deckOfFortune=deckOfFortune;
        this.actionPoints=actionPoints;
        this.durability=durability;
        this.maxPD=maxPD;
        this.mana=mana;
        this.dmgreduction=dmgreduction;
    }
    
    public static int ChangeStat(boolean positive, JSpinner statSpinner, int PD)    
{
    int tmp=(int)statSpinner.getValue();
    if(positive==true)
    {       
        if(tmp==1)
        {
            PD=PD+10;
        }
        else if(tmp==2)
        {
            PD=PD+20;
        }
        else if(tmp==3)
        {
            PD=PD+40;
        }
        else if(tmp==4)
        {
            PD=PD+60;
        }
        else if(tmp==5)
        {
            PD=PD+80;
        }
        else if(tmp==6)
        {
            PD=PD+120;
        }
        else if(tmp==7)
        {
            PD=PD+160;
        }
        else if(tmp==8)
        {
            PD=PD+200;
        }
        else if(tmp>8)
        {
            int tmp2=tmp-8;
            PD=PD+200+tmp2*100;
        }
        statSpinner.setValue(tmp+1);
    }
    else{
        if(tmp==2)
        {
            PD=PD-10;
            statSpinner.setValue(tmp-1);
        }
        else if(tmp==3)
        {
            PD=PD-20;
            statSpinner.setValue(tmp-1);
        }
        else if(tmp==4)
        {
            PD=PD-40;
            statSpinner.setValue(tmp-1);
        }
        else if(tmp==5)
        {
            PD=PD-60;
            statSpinner.setValue(tmp-1);
        }
        else if(tmp==6)
        {
            PD=PD-80;
            statSpinner.setValue(tmp-1);
        }
        else if(tmp==7)
        {
            PD=PD-120;
            statSpinner.setValue(tmp-1);
        }
        else if(tmp==8)
        {
            PD=PD-160;
            statSpinner.setValue(tmp-1);
        }
        else if(tmp==8)
        {
            PD=PD-200;
            statSpinner.setValue(tmp-1);
        }
        else if(tmp>8)
        {
            int tmp2=tmp-9;
            PD=PD-200-tmp2*100;
            statSpinner.setValue(tmp-1);
        }
        
    }
    return PD;
}

public static int ChangeSkill(boolean positive, JSpinner skillSpinner, int PD)
{
        int tmp=(int)skillSpinner.getValue();
    if(positive==true)
    {    
        if(tmp<3)
        {
            PD=PD+5*(tmp+1);
            skillSpinner.setValue(tmp+1);
        }
        else if(tmp<5)
        {
            PD=PD+15+10*(tmp-2);
            skillSpinner.setValue(tmp+1);
        }
        else if(tmp<9)
        {
            PD=PD+45+20*(tmp-5);
            skillSpinner.setValue(tmp+1);
        }
        else if(tmp==9)
        {
            PD=PD+145;
            skillSpinner.setValue(tmp+1);
        }
        
    }
    else if(tmp>0)
    {
        if(tmp<4)
        {
            PD=PD-5*(tmp);
            skillSpinner.setValue(tmp-1);
        }
        else if(tmp<6)
        {
            PD=PD-15-10*(tmp-3);
            skillSpinner.setValue(tmp-1);
        }
        else if(tmp<10)
        {
            PD=PD-45-20*(tmp-6);
            skillSpinner.setValue(tmp-1);
        }
        else if(tmp==10)
        {
            PD=PD-145;
            skillSpinner.setValue(tmp-1);
        }
    }
    return PD;
}

}
