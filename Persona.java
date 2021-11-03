/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esereditarita;

/**
 *
 * @author Paolo
 */
public class Persona {
    private String nome, cognome, indirizzo, cf;
    private int[] tel;

    public Persona(String nome, String cognome, String indirizzo, String cf, int tel) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.cf = cf;
        this.tel = new int[4];
        this.tel[0] = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }
    
    public boolean addTel(int tel){
        for(int i=0; i<this.tel.length;i++){
            if(this.tel[i] == 0){
                this.tel[i] = tel;
                return true;
            }
        }
        return false;
    }
    
    public boolean delTel(int tel){
        for(int i=0; i<this.tel.length;i++){
            if(this.tel[i] == tel){
                this.tel[i] = 0;
                return true;
            }
        }
        return false;
    }

    public String stampaPersona() {
        return "Persona{" + "nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", cf=" + cf + ", tel=" + tel + '}';
    }
}
