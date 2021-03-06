/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan19.saldotabungan;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi Program : Saldo Tabungan
 */
public class PBOIF210119082Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        int lama,i;
        float bunga;
        double saldoAwal,saldoAkhir;
        
        System.out.print("Saldo Awal : RP. ");
        saldoAwal = scanner.nextDouble();
        
        System.out.print("Bunga/Bulan(%) : ");
        bunga = scanner.nextFloat();
        
        System.out.print("Lama (bulan) : ");
        lama = scanner.nextInt();
        
        bunga = (float) (bunga/100);
        
        for  (i = 1; i <= lama ; i++) {
            saldoAkhir = (saldoAwal * 0.15) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldoAkhir));
            saldoAwal = saldoAkhir;
        }
        System.out.println("Developed by : Zainul Rifqi Muwaffaq");
    }
    
}
