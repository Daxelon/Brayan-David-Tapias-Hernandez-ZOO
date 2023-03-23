/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologicoo;

/**
 *
 * @author braya
 */
public class AnimalSalvaje extends Animal {
      private int nivelPeligrosidad; // 1 al 5 1 bajo 5 alto

    public AnimalSalvaje() {
    }

    public AnimalSalvaje(int nivelPeligrosidad, int id,int edad, String nameAnimal, String ownName, String habitat, char sex) {
        super(id,edad, nameAnimal, ownName, habitat, sex);
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public AnimalSalvaje(int nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public int getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(int nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }
 
  
    @Override
    public String toString() {
        return "AnimalSalvaje{" + "nivelPeligrosidad=" + nivelPeligrosidad + '}';
    }
}
