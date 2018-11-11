public class Perpustakaan1 {
    String dataString;
    int a = 0;
    int dataBulat;
    String Nomor_Anggota, Nama, TanggalPinjaman;
    int bulan_pinjam = 0, bayar = 0, denda = 0, jumlah = 0, tanggal_bayar = 0, lama = 0, tarif = 0;
    public void menu(){
        System.out.println("\n");
        System.out.println("-------------------");
        System.out.println("Menu Utama");
        System.out.println("-------------------");
        System.out.println("1. Daftar Buku");
        System.out.println("2. Daftar Peminjaman");
        System.out.println("3. Daftar Pengembalian");
        System.out.println("4. Exit");
        System.out.println("--------------------");
        System.out.println("\n");
        System.out.println("Masukkan menu pilihan anda :");
        dataString = inputkeyboard.inputString();
        manu = integer.valueOf(dataString).intValue();
        
        switch(menu){
            case 1 :
            daftarBuku();
            break;
            
            case 2 :
            peminjaman();
            break;
            
            case 3 :
            pengembalian();
            break;
            
            case 4 :
            System.out.println("terima kasih");
            System.exit(0);
            
            default :
                System.out.print("Maaf, pilihan yang anda masukkan salah!");
                pilihMenu();
                //manggil method pilih menu
        }
    }
    public void pilihMenu(){
    int pilihMenu = 0;
    System.out.print("1. kembalikan ke menu Utama 2. Keluar");
    System.out.print("Masukkan menu pilihan anda :");
    dataString = InputKeyboard.inputString();
    pilihMenu = Integer.parseInt(dataString);
    switch(pilihMenu){
        case 1 :
            menu();
            break;
        case 2 :
            System.out.println("Terima kasih");
            System.exit(0);
            
            default :
                System.out.print("Maaf, pilihan yang anda masukkan salah!");
                pilihMenu();
                //manggil method pilih menu        
        }     
    }
    public void daftarBuku(){
        System.out.println("n");
        System.out.println("DAFTAR BUKU");
        System.out.println("----------------------------------------------------");
        System.out.println("|No|Jenis|Judul|Penerbit|Tahun|");
        System.out.println("|1.|Kamus|Kamus Bahasa Inggris - Indonesia|Balai Pustaka|2009");
        System.out.println("|2.|Kamus|Kamus Fasih Berbahasa Indonesia |Erlangga|1995");
        System.out.println("|3.|Kamus|Kamus Kamus Pinyin |Puspa Swara|2000");
        System.out.println("|4.|Majalah|Komputex|Elex Media|2009");
        System.out.println("|5.|Majalah|Cempaka|Suara merdeka Pr|2009");
        System.out.println("|6.|Textbook|Pemrograman Delphi|Setia Kawan Pres|2006");
        System.out.println("|7.|Textbook|Pendidikan Kewarganegaraan 2|Erlangga|2006");
        System.out.println("|8.|Textbook|IPS terpadu 2|Erlangga|2007");
        System.out.println("|9.|Komik|Buku Harian Terkutuk|Mizan Publishing|2017");
        System.out.println("|10.|Komik|Peter Pen|Gramedia Widiasarana Indonesia|2018");
        System.out.println("----------------------------------------------------");
        pilihMenu();
    }
    Public void peminjaman(){
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("PEMINJAMAN BUKU");
        System.out.println("------------------------------");
        System.out.println("Tarif Peminjaman Per Minggu");
        System.out.println("1. jenis Buku Majalah = Rp.1000,-");
        System.out.println("2. jenis Buku Textbook = Rp.2000,-");
        System.out.println("3. jenis Buku kamus = Rp.3000");
        System.out.println("4. jenis Buku Komik = Rp.4000");
        System.out.println("------------------------------");
        System.out.println("1. Tanggal Pinjam : ");
        tanggalPinjam = inputKeyboard.inputString();
        System.out.println("2. Nomor Anggota : ");
        nomorAnggota = inputKeyboard.inputString();
        System.out.println("3. Nama Anggota : ");
        namaAnggota = inputKeyboard.inputString();
        System.out.println("4. Jenis Buku : ");
        String dataStrigJenisBuku = inputKeyboard.inputString();
        System.out.println("5. Jumlah Buku :");
        String dataStringJumlahBuku = inputKeyboard.inputString();
        int jumlahBuku = Integer.parseInt(dataStringJumlahBuku);
        String dataStringJenisBuku = null;
        int jenisBuku = Integer.parseInt(dataStringJenisBuku);
        
        if (jenisBuku == 1){
            tarif = 1000;
        }
        if (jenisBuku == 2){
            tarif = 2000;
        }
        if (jenisBuku == 3){
            tarif = 3000;
        }
        if (jenisBuku == 4){
            tarif = 4000;
        }
        
       System.out.println("------------------------------");
       System.out.println("Biaya Peminjaman = "+ (jumlahBuku*tarif));
       System.out.println("------------------------------");
       pilihMenu();
        }
    public void pengembalian(){
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("PENGEMBALIAN BUKU");
        System.out.println("Denda keterlambatan Rp.500 per hari");
        System.out.println("------------------------------");
        System.out.println("1. Tanggal Kembali = ");
        tanggalKembali = inputKeyboard.inputString();
        System.out.println("2. Nomor Anggota = ");
        nomorAnggota = inputKeyboard.inputString();
        System.out.println("3. Nama Anggota = ");
        namaAnggota = inputKeyboard.inputString();
        System.out.println("4. Jumlah Buku :");
        String dataStringJumlahBuku = inputKeyboard.inputString();
        System.out.println("5. Jumlah Hari :");
        String dataStringJumlahHari = inputKeyboard.inputString();
        
        int jumlahBuku = Integer.parseInt(dataStringJumlahBuku);
        int jumlahHari = Integer.parseInt(dataStringJumlahHari);
        
        if (jumlahHari > 7){
            denda = jumlahHari - 7;
        }
        System.out.println("------------------------------");
        int totalDenda = denda * 500 * jumlahBuku;
        System.out.println("Total Denda = Rp "+ totalDenda);
        System.out.println("");
        pilihMenu();
        }
    }
