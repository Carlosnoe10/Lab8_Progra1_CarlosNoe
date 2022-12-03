/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_progra1_carlos_noé;

/**
 *
 * @author cd507
 */
public class Lista {

    public String SuperName;
    public String Name;
    public String Origin;
    public String France;

 public Lista(String SuperName, String Name, String Origin, String France ){
     this.Name= Name;
     this.SuperName= SuperName;
     this.Origin= Origin;
     this.France= France;
}

    @Override
    public String toString() {
        return "Lista{" + "SuperName=" + SuperName + ", Name=" + Name + ", Origin=" + Origin + ", France=" + France + '}';
    }


    public String getSuperName() {
        return SuperName;
    }

    public void setSuperName(String SuperName) {
        this.SuperName = SuperName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public String getFrance() {
        return France;
    }

    public void setFrance(String France) {
        this.France = France;
    }
}