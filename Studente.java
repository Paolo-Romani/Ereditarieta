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
public class Studente extends Persona{
    private String matricola, scuola;

    public Studente(String matricola, String scuola, String nome, String cognome, String indirizzo, String cf, int tel) {
        super(nome, cognome, indirizzo, cf, tel);
        this.matricola = matricola;
        this.scuola = scuola;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getScuola() {
        return scuola;
    }

    public void setScuola(String scuola) {
        this.scuola = scuola;
    }

    
    public String stampaStudente() {
        return "Studente{" + "matricola=" + matricola + ", scuola=" + scuola + super.stampaPersona() +'}';
    }
}
