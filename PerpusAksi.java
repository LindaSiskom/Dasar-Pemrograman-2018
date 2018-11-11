import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PerpusAksi {
    public static void main(String [] args){
        Perpus menuUtama = new Perpus();
        //membuat objek menu utama
        menuUtama.menu();
        //memanggil method menu()pada class Perpus
    }    
}
class PerpusSederhana{
    static void Terlambat;
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    String dataString = "", Kategori = "", Judul ="";
    static int Biaya = 3, BiayaPinjam = 0, lagi = 0, judul = ;
    static int Menu = 0;
    void HitungTerlambat(String TglAwal, String TglAkhir) throws java.text.ParseException{
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date Tgll = df.parse(TglAwal);
            Date Tgl2 =df.parse(TglAkhir);
            
            long Hari1 = Tgl1.getTime();
            long Hari2 = Tgl2.getTime();
            long diff = Hari2 - Hari1;
            long Terlambat = diff / (24*60*60*1000);
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
    void DataBuku(){
        System.out.println("DAFTAR BUKU");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Membangun Jaringan LAN ");
        System.out.println("2. Pengantar Jaringan Komputer");
        System.out.println("3. Dasar Pemrograman");
        System.out.println("4. Analisa Algoritma");
        System.out.println("5. Belajar OOP dengan java");
    }
    void DataKamus(){
        System.out.println("DAFTAR KAMUS");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Belajar Bahasa Mandarin - Indonesia");
        System.out.println("2. Belajar Bahasa Korea - Indonesia");
        System.out.println("3. Belajar Bahasa Inggris - Indonesia");
        System.out.println("4. English for Computer");
        System.out.println("5. English for Employe");
    }
    void DataMajalah(){
        System.out.println("DAFTAR MAJALAH");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Bisnis Komputer edisi Januari 2008");
        System.out.println("2. Pesona Muda edisi Februari 2009");
        System.out.println("3. Ilmu Komputer edisi Januari");
    }
    void DataKomik(){
        System.out.println("DAFTAR KOMIK");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Buku Harian terkutuk");
        System.out.println("2. Doraemon");
    }
    void Sirkulasi(int nJudul){
        while(lagi == 0){
            System.out.println("----------------------------------------------------");
            System.out.println("PERPUSTAKAAN SEDERHANA");
            System.out.println("----------------------------------------------------");
            System.out.println("Pilih Kategori : ");
            System.out.println("1. Buku Teks");
            System.out.println("2. Buku Kamus");
            System.out.println("3. Buku Majalah");
            System.out.println("4. Buku Komik");
            System.out.println("Kategori yang dipilih[1-3] : ");
            dataString = inputKeyboard.inputString();
            System.out.println("");
            int pilih = integer.valueOf(dataString).intValue();
            
            switch(pilih)
            {
                case 1 :
                Kategori = "Buku Teks";
                BiayaPinjam = 2000;
                PerpusSederhana CetakDataBuku = new PerpusSederhana();
                CetakDataBuku.DataBuku();
                System.out.print("Data Anda akan Pilih? :");
                dataString = inputKeyboard.inputString();
                nJudul = integer.valueOf(dataString).intValue();
            {
                if (nJudul == 1){
                    Judul = "Membangun Jaringan LAN";
                }
                else if (nJudul == 2){
                    Judul = "Pengantar Jaringan Komputer";
                }
                else if (nJudul == 3){
                    Judul = "Dasar Pemrograman";
                }
                else if (nJudul == 4){
                    Judul = "Analisa Algoritma";
                }
                else{
                    Judul = "Belajar OOP dengan java";
                }
            }
                break;
                case 2 :
                    Kategori = "Kamus";
                    BiayaPinjam = 3000;
                    PerpusSederhana CetakDataKamus = new PerpusSederhana();
                    CetakDataKamus.DataKamus();
                    System.out.print("Data Anda akan Pilih? :");
                dataString = inputKeyboard.inputString();
                nJudul = integer.valueOf(dataString).intValue(); 
            {
                if(nJudul == 1){
                    Judul ="Belajar Bahasa Mandarin - Indonesia";
                }
                else if (nJudul == 2){
                    Judul = "Belajar Bahasa Korea - Indonesia";
                }
                else if (nJudul == 3){
                    Judul = "Belajar Bahasa Inggris - Indonesia";
                }
                else if (nJudul == 4){
                    Judul = "English for Computer";
                }
                else{
                    Judul = "English for Employe";
                }
            }
                break;
                case 3 :
                    Kategori = "Majalah";
                    BiayaPinjam = 1000;
                    PerpusSederhana CetakDataMajalah = new PerpusSederhana();
                    CetakDataMajalah.DataMajalah();
                    System.out.print("Data Anda akan Pilih? :");
                dataString = inputKeyboard.inputString();
                nJudul = integer.valueOf(dataString).intValue(); 
        {
            if (nJudul == 1) {
                Judul = "Bisnis Komputer edisi Januari 2008";
            }
            else if (nJudul == 2){
                Judul = "Pesona Muda edisi Februari 2009";
            }
            else{
                Judul = "Ilmu Komputer edisi Januari";
            }
        }
                break;
               
                case 4 :
                    Kategori = "Komik";
                    BiayaPinjam = 4000;
                    PerpusSederhana CetakDataKomil = new PerpusSederhana();
                    CetakDataKomik.DataKomik();
                    System.out.print("Data Anda akan Pilih? :");
                dataString = inputKeyboard.inputString();
                nJudul = integer.valueOf(dataString).intValue();
                if (nJudul == 1){
                    Judul = "Buku Harian terkutuk";
                }
                else{
                    Judul = "Doraemon";
                }
                break;
                default :
                    System.out.println("Silahkan Pilih Kategori Koleksi Buku,Kamus, Majalah atau Komik");
            }
            System.out.print("Nama Anggota : ");
            dataString = inputKeyboard.inputString();
            String namaPeminjam = dataString;
            System.out.print("Tanggal Pinjam(dd/MM/yyyy) :");
            dataString = inputKeyboard.inputString();
            String tglPinjam = dataString;
            long Hari = 0;
            try{
                Date dateTglPinjam = df.parse(tglPinjam);
                Hari = dateTglPinjam.getTime()+604800000;
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
            Calender BatasTglKembali = Calender.getInstance();
            BatasTglkembali.setTimeMilis(Hari);
            String stringBatasTglPinjam = df.format("Batas waktu pinjam Anda : "+ stringBatasTglPinjam);
            System.out.print("Tanggal kembali(dd/MM/yyyy) : ");
            dataString = inputKeyboard.inputString();
            String tglKembali = dataString;
            PerpusSederhana jumlahHariTerlambat = new PerpusSederhana();
            jumlahHariTerlambat.HitungTerlambat(stringBatasTglPinjam, tglKembali);
            long lamaPinjam = Terlambat + 7;
            Terlambat = 0;
            int biayaDendaPerHari = 500;
            long denda = 0;
            long biayaHarusDibayar = BiayaPinjam;
            if (lamaPinjam>7);
            Terlambat = lamaPinjam - 7;
            denda = biayaDendaPerHari*Terlambat;
            biayaHarusDibayar = denda + BiayaPinjam;
        }
        System.out.print("");
        System.out.print("----------PERPUSTAKAAN SEDERHANA-----------");
        System.out.print("----------BUKTI PEMINJAMAN BUKU-----------");
        System.out.println("Nama Anggota : "+ namaPeminjam);
        if (pilih == 1){
        System.out.println("Judul : "+ Kategori +"Yang dipinjam : "+Judul);
        }
        else if (pilih == 2){
            System.out.println("Judul : "+ Kategori +"Yang dipinjam : "+Judul);
        }
        else{
           System.out.println("Judul : "+ Kategori +"Yang dipinjam : "+Judul);
        }
        System.out.println("Keterangan");
        System.out.println("Lama Pinjam : "+""+lamaPinjam+" hari"+""+"Terlambat : "+"hari");
        System.out.print("Biaya Pinjam : Rp. "+ BiayaPinjam +"/minggu"+""+"Denda/Hari : Rp. "+ biayaDendaPerHari);
        System.out.println("Biaya Denda : Rp. "+ denda);
        
System.out.println("");
System.out.println("Biaya Yang Harus dibayar : ");
System.out.print(""+"Total Biaya : Rp. "+ biayaHarusDibayar);
System.out.println("----------------------------------------------------");
System.out.println("");
System.out.println("Terima Kasih.......");
System.out.print("Coba Lagi ? [0 = Ya] : ");
dataString = inputKeyboard.inputString();
lagi = integer.valueOf(dataString).intValue();
System.out.println("");
System.out.println("Terima Kasih.......");
    }
}


        
        
    

