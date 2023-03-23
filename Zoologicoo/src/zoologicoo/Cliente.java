/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologicoo;

/**
 *
 * @author braya
 */
public class Cliente {
    private int cc, canVisitas;
    private String name, plan;
    private float total;

    public Cliente() {
    }

    public Cliente(int cc, int canVisitas, String name, String plan, float total) {
        this.cc = cc;
        this.canVisitas = canVisitas;
        this.name = name;
        this.plan = plan;
        this.total = total;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCanVisitas() {
        return canVisitas;
    }

    public void setCanVisitas(int canVisitas) {
        this.canVisitas = canVisitas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
