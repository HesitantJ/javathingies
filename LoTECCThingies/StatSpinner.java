/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoTECCThingies;

import javax.swing.JSpinner;

/**
 *
 * @author Lenovo
 */
public class StatSpinner extends JSpinner {


public int ChangeStat(boolean positive, JSpinner statSpinner, int PD)    
{
    int tmp=(int)statSpinner.getValue();
    if(positive==true)
    {       
        if(tmp==1)
        {
            PD=PD-10;
        }
        else if(tmp==2)
        {
            PD=PD-20;
        }
        else if(tmp==3)
        {
            PD=PD-40;
        }
        else if(tmp==4)
        {
            PD=PD-60;
        }
        else if(tmp==5)
        {
            PD=PD-80;
        }
        else if(tmp==6)
        {
            PD=PD-120;
        }
        else if(tmp==7)
        {
            PD=PD-160;
        }
        else if(tmp==8)
        {
            PD=PD-200;
        }
        else if(tmp>8)
        {
            int tmp2=tmp-8;
            PD=PD-200-tmp2*100;
        }     
    }
    else{
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
    }
    return PD;
}

public int ChangeSkill(boolean positive, JSpinner skillSpinner, int PD)
{
        int tmp=(int)skillSpinner.getValue();
    if(positive==true)
    {    
        if(tmp<3)
        {
            PD=PD-5*(tmp+1);
        }
        else if(tmp<5)
        {
            PD=PD-15-10*(tmp-2);
        }
        else if(tmp<9)
        {
            PD=PD-45-20*(tmp-5);
        }
        else
        {
            PD=PD-145;
        }
        
    }
    return PD;
}
}
