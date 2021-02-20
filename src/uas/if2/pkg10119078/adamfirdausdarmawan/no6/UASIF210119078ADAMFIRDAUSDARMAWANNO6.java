/*
 * Nama    : Adam Firdaus Darmawan
 * Nim     : 10119078
 * Kelas   : IF2
 * Tanggal : 20/02/2021
 * No.Soal : 6
 */
package uas.if2.pkg10119078.adamfirdausdarmawan.no6;

/**
 *
 * @author ryzen
 */
public class UASIF210119078ADAMFIRDAUSDARMAWANNO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kalkulator calc = new Kalkulator();
       calc.setValue1(7);
       calc.setValue2(5);
        
       System.out.println("Value 1" + calc.getValue1());
       System.out.println("Value 2" + calc.getValue2());
       calc.multiplication(calc.getValue1(),calc.getValue2());
       
        
    }
    
}
