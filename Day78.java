public class day78 {
     public static void main(String[] args) {
        String kata = "   nama tasya   ";

        System.out.println("Panjang string: " + kata.length());
        System.out.println("Huruf besar: " + kata.toUpperCase());
        System.out.println("Huruf kecil: " + kata.toLowerCase());
        System.out.println("Substring : " + kata.substring(8));
        System.out.println("String mengganti kata   : " + kata.replace("tasya", "auliaa"));
        System.out.println("String tanpa spasi di awal dan akhir: " + kata.trim());
        System.out.println("Apakah string mengandung 'nama'? " + kata.contains("nama "));
        System.out.println("String kosong : " + kata.isEmpty());
    }
}
