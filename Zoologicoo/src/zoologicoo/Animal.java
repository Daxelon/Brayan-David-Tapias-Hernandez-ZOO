/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologicoo;

/**
 *
 * @author braya
 */
public class Animal {
    private int id,edad;
    private String nameAnimal, ownName, habitat;
    private char sex;

    public Animal() {
    }

    public Animal(int id,int edad, String nameAnimal, String ownName, String habitat, char sex) {
        this.id = id;
        this.edad = edad;
        this.nameAnimal = nameAnimal;
        this.ownName = ownName;
        this.habitat = habitat;
        this.sex = sex;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getOwnName() {
        return ownName;
    }

    public void setOwnName(String ownName) {
        this.ownName = ownName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", edad=" + edad + ", nameAnimal=" + nameAnimal + ", ownName=" + ownName + ", habitat=" + habitat + ", sex=" + sex + '}';
    }

   
    
    
}

