package utilities

import com.kms.katalon.core.annotation.Keyword
import java.util.Random

public class MyUtilities { // Gunakan nama kelas yang unik dan diawali huruf kapital

@Keyword
    def generateRandomEmail(int length) {
        // Daftar karakter yang diperbolehkan untuk username email (huruf kecil & angka)
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789"
        Random rand = new Random()
        StringBuilder sb = new StringBuilder()
        
        // Loop untuk membuat string acak sepanjang 'length'
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())))
        }
        
        // Tambahkan domain @gmail.com di akhir
        String fullEmail = sb.toString() + "@gmail.com"
        
        return fullEmail
    }
}