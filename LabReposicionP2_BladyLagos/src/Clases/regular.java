/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Gerardo Lagos
 */
public class regular {
    
    public int codigo,nivel,num;

    public regular() {
    }
    
    
     public regular(int codigo, int nivel, int num) {
        this.codigo = codigo;
        this.nivel = nivel;
        this.num = num;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return  "codigo=" + codigo ;
    }
}
