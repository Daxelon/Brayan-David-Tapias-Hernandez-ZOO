/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologicoo;

/**
 *
 * @author braya
 */
public class ClienteDeudor extends Cliente{
    private int cuaotas;
    private float deuda, cantidadCuaota;

    public ClienteDeudor() {
    }

    public ClienteDeudor(int cuaotas, float deuda, float cantidadCuaota) {
        this.cuaotas = cuaotas;
        this.deuda = deuda;
        this.cantidadCuaota = cantidadCuaota;
    }

    public ClienteDeudor(int cuaotas, float deuda, float cantidadCuaota, int cc, int canVisitas, String name, String plan, float total) {
        super(cc, canVisitas, name, plan, total);
        this.cuaotas = cuaotas;
        this.deuda = deuda;
        this.cantidadCuaota = cantidadCuaota;
    }

    public int getCuaotas() {
        return cuaotas;
    }

    public void setCuaotas(int cuaotas) {
        this.cuaotas = cuaotas;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public float getCantidadCuaota() {
        return cantidadCuaota;
    }

    public void setCantidadCuaota(float cantidadCuaota) {
        this.cantidadCuaota = cantidadCuaota;
    }
    
}
