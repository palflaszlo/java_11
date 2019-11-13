/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peksegoop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diak
 */
public class Pekseg {
    private List<Arlap> menu;
    
    public Pekseg(String fajlNev) {
        menu  = new ArrayList<>();
        try{
            FileReader f = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(f);
            
            String sor = br.readLine();
            while(sor != null){
                String[] st = sor.split(" ");
                if(st[0].equals("Pogacsa")){
                    menu.add(new Pogacsa(Double.parseDouble(st[1]), Double.parseDouble(st[2])));
                }
                else if(st[0].equals("Kave")){
                    menu.add(new Kave(st[1].equals("habos")));
                }
                
                sor = br.readLine();
            }
            
            br.close();
            f.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Nem található fájl!");
        }
        catch(IOException e){
            System.out.println("Hiba");
        }
        
    }
    
    public void etelLeltar(){
        for(Arlap arlap : menu){
            if(arlap instanceof Pogacsa){
                System.out.println(arlap);
            }
            /*
            if(arlap.getClass().equals(Pogacsa.class))
            */
        }
    }
}
