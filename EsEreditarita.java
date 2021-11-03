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
public class EsEreditarita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Studente st = new Studente("sdr34d","sales","alessia","rossi","via ccc","asdw34asd34",3212654);
        System.out.println("tutti gli attributi di "+st.stampaPersona());
        System.out.println("solo gli attributi di Studente {matricola="+st.getMatricola() + " scuola="+st.getScuola()+"}");
        System.out.println("tutti gli attributi di "+st.stampaStudente());
    }
}
