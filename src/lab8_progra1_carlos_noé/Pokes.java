/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_progra1_carlos_noé;

public class Pokes {
    public String Name;
    public int Hea;
    public int Apoints;
    public int luck;

 public Pokes(String Name, int Hea, int Apoints, int luck){
     this.Name= Name;
     this.Hea= Hea;
     this.Apoints= Apoints;
     this.luck= luck;    
 }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getHea() {
        return Hea;
    }

    public void setHea(int Hea) {
        this.Hea = Hea;
    }

    public int getApoints() {
        return Apoints;
    }

    public void setApoints(int Apoints) {
        this.Apoints = Apoints;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }
 
 
 
}