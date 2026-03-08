# Laporan Modul 1: Review Dasar Pemrograman Java
**Mata Kuliah:** Design Pattern   
**Nama:** [SALWA AZIZAH]  
**NIM:** [2024573010030]  
**Kelas:** [TI 2A]

## 1. Abstrak 
Pengenalan Java dan Lingkungan Pengembangan Java adalah bahasa pemrograman berorientasi objek yang populer dan banyak digunakan untuk pengembangan aplikasi desktop, web, dan mobile. Java menggunakan sintaks yang mirip dengan C++ tetapi dirancang untuk lebih mudah dipahami dan digunakan.
Untuk memulai pemrograman Java, Anda perlu:

  1. JDK (Java Development Kit): Berisi compiler dan tools untuk mengembangkan program Java.
  2. IDE (Integrated Development Environment): Seperti IntelliJ IDEA, Eclipse, atau NetBeans untuk menulis dan menjalankan kode.
 ## 2. Langkah Praktikum :
Pastikan JDK dan Intellij IDE Community Edition sudah terinstal. Jika belum, kunjungi url berikut untuk mengunduh JDK Amazon Correto dan Intellij
Buka IDE dan buat sebuah project baru dengan ketentuan seperti berikut:
 1. Name: ti_design_pattern
 2. Location: disesuaikan
 3. Build system: Intellij
 4. JDK: Amazon Correto
 5. Hilangkan centang pada bagian add sample code
 ## Contoh:
![img.png](img.png)
 6. Buat sebuah package baru di dalam folder src dengan cara klik kanan pada folder src kemudian pilih New -> Package. Beri nama modul_1.
 7. Buat Sebuah class didalam package modul_1 dengan cara klik kanan dan pilih New -> Java Class. Beri nama HelloWorld
### Praktikum 1 - Hello world
#### Dasar Teori
Program tersebut merupakan contoh program sederhana dalam bahasa pemrograman Java yang digunakan untuk menampilkan teks ke layar.

Dalam Java, setiap program harus berada di dalam class dan memiliki method main() sebagai titik awal eksekusi program. Perintah System.out.println() digunakan untuk menampilkan output berupa teks ke console.

Program Hello World biasanya digunakan sebagai latihan pertama untuk memahami struktur dasar program Java seperti package, class, method, dan output.
#### Langkah Praktikum
1. Buat sebuah package baru dengan nama Pratikum_1 
   2. Buat class Person sebagai superclass: java package Praktikum_1.HelloWorld
    ## Program
          public class HelloWorld {
          public static void main(String[] args) { System.out.println("Hello, world!"); }
          }
    ##  output
    ![img_1.png](img_1.png)

### Praktikum 2 - Variabel dan Tipe Data
#### Dasar Teori
Variabel digunakan untuk menyimpan data dalam program. Setiap variabel memiliki tipe data yang menentukan jenis nilai yang dapat disimpan. Tipe data dasar di Java:
 1. int: Bilangan bulat (contoh: 10, -5)
 2. double: Bilangan desimal (contoh: 3.14, -0.5)
 3. boolean: Nilai true atau false
 4. char: Karakter tunggal (contoh: 'A', '1')
 5. String: Teks (contoh: "Hello")
#### Langkah Praktikum
1. Didalam package Praktikum_1 Buat class Person Beri nama Variabel
2. Tulis Kode Berikut
package Praktikum_1;
## program

            public class Variable {
            public static void main(String[] args) {
            int umur = 20;
            double tinggi = 1.75;
            boolean isMahasiswa = true;
            char jenisKelamin = 'L';
            String nama = "Budi";

                System.out.println("Nama: " + nama);
                System.out.println("Umur: " + umur);
                System.out.println("Tinggi: " + tinggi);
                System.out.println("Mahasiswa: " + isMahasiswa);
                System.out.println("jenisKelamin: " + jenisKelamin);
            }
        }
## Output
![img_2.png](img_2.png)
## Latihan
Buatlah program untuk menampilkan data diri anda yang lengkap dengan attribut seperti berikut:
Nama Lengkap, Tempat Lahir, Tanggal Lahir, Golongan Darah, Umur,
Tinggi Badan, Jenis Kelamin, Agama, Pekerjaan.
Gunakan tipe data yang tepat untuk setiap variabel.
 ## Program
    package Praktikum_1.latihan;

    public class Latihan {
    public static void main(String[] args) {

        // Tipe data String
        String namaLengkap = "Salwa Azizah";
        String tempatLahir = "Tumpok Teugoh";
        String tanggalLahir = "2 Januari 2007";
        String golonganDarah = "A";
        String jenisKelamin = "Perempuan";
        String agama = "Islam";
        String pekerjaan = "Mahasiswa";

        // Tipe data int
        int umur = 19;
        int tinggiBadan = 160;

        // Output
        System.out.println("===== DATA DIRI =====");
        System.out.println("Nama Lengkap   : " + namaLengkap);
        System.out.println("Tempat Lahir   : " + tempatLahir);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Golongan Darah : " + golonganDarah);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Tinggi Badan   : " + tinggiBadan + " cm");
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Agama          : " + agama);
        System.out.println("Pekerjaan      : " + pekerjaan);
    }
    }
## Output
![img_3.png](img_3.png)

### Praktikum 3 - Operator dan Expressi
#### Dasar Teori
Operator adalah simbol yang digunakan untuk melakukan operasi pada variabel atau nilai dalam bahasa pemrograman Java.

1. Operator Aritmatika : Digunakan untuk operasi perhitungan matematika seperti + (tambah), - (kurang), * (kali), / (bagi), % (sisa bagi).
2. Operator Perbandingan : Digunakan untuk membandingkan dua nilai dan menghasilkan nilai true atau false, seperti ==, !=, >, <, >=, <=.
3. Operator Logika : Digunakan untuk menggabungkan atau membalikkan kondisi logika, seperti && (AND), || (OR), ! (NOT).
#### Langkah Praktikum
1. Buat sebuah class baru di dalam package modul_1 dan beri nama Operator
2. Tuliskan kode berikut:
   package Praktikum_1;
## Program
        public class Operator {
        public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
                System.out.println("a + b = " + (a + b));
                System.out.println("a > b?  " + (a + b));
                System.out.println("a == b?  " + (a + b));
            }
        }
## Output
![img_4.png](img_4.png)
 ## Latihan
Buat program untuk menghitung luas persegi panjang (panjang * lebar)
## Program
    package Praktikum_1.latihan;
    
    public class Latihan2 {
    public static void main(String[] args) {

        int panjang = 10;
        int lebar = 5;

        int luas = panjang * lebar;

        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Luas Persegi Panjang = " + luas);
    }
    }
## Output
![img_5.png](img_5.png)

### Praktikum 4 - Percabangan (If-Else dan Switch-Case)
#### Dasar Teori
Percabangan digunakan untuk mengambil keputusan berdasarkan kondisi.

If-Else:
        if (kondisi) {
        // Blok kode jika kondisi true
        } else {
        // Blok kode jika kondisi false
        }

Switch-Case:
        switch (variabel) {
        case nilai1:
        // Blok kode jika variabel == nilai1
        break;
        case nilai2:
        // Blok kode jika variabel == nilai2
        break;
        default:
        // Blok kode jika tidak ada case yang sesuai
        }
#### Langkah Praktikum
1. Buat sebuah class baru di dalam package Praktikum_1 dan beri nama Percabangan
2.  Tuliskan kode berikut:
    package Praktikum_1;
## Program
        public class Percabangan {
        public static void main(String[] args) {
        int nilai = 85;
        
                if (nilai>= 75) {
                    System.out.println("Anda lulus!");
                } else {
                    System.out.println("Anda tidak lulus.");
                }
            }
        }
## output
![img_6.png](img_6.png)
## Latihan
Buat program untuk menentukan apakah suatu bilangan genap atau ganjil.
package Praktikum_1.latihan;
## Program
        public class Latihan3 {
        public static void main(String[] args) {
        
                int angka = 10;  // Ganti angka sesuai keinginan
        
                if (angka % 2 == 0) {
                    System.out.println(angka + " adalah bilangan Genap");
                } else {
                    System.out.println(angka + " adalah bilangan Ganjil");
                }
        
            }
        }
## Output
![img_7.png](img_7.png)
### Praktikum 5 - Perulangan (For, While, Do-While)
#### Dasar Teori
Perulangan digunakan untuk mengulang blok kode.

For:
for (inisialisasi; kondisi; update) {
// Blok kode yang diulang
}

While:
while (kondisi) {
// Blok kode yang diulang
}

Do-While:
do {
// Blok kode yang diulang
} while (kondisi);
### Langkah Praktikum
1. Buat sebuah class baru di dalam package Praktikum_1 dan beri nama Perulangan
2. Tuliskan kode berikut:
   package Praktikum_1;
## Program
        public class Perulangan {
        public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
        System.out.println("iterasi ke-" + i);
        }
    }
    }
## Output
![img_8.png](img_8.png)
## Latihan
Buat program untuk mencetak bilangan ganjil dari 1 hingga 20. Buat 3 program dengan menggunakan for, while, do-while.
## Program
package Praktikum_1.latihan;

    public class Latihan4 {
    public static void main(String[] args) {

        // ===== FOR =====
        System.out.println("Bilangan ganjil (for):");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        // ===== WHILE =====
        System.out.println("Bilangan ganjil (while):");
        int a = 1;
        while (a <= 20) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
            a++;
        }

        System.out.println("\n");

        // ===== DO WHILE =====
        System.out.println("Bilangan ganjil (do-while):");
        int b = 1;
        do {
            if (b % 2 != 0) {
                System.out.print(b + " ");
            }
            b++;
        } while (b <= 20);

    }
    }
## Output
![img_9.png](img_9.png)

### Praktikum 6 - Practice Problem dan Solusinya
### Dasar teori
Praktikum ini bertujuan untuk melatih pemahaman dasar pemrograman menggunakan Java, terutama dalam penggunaan perulangan (loop), percabangan (if-else), dan operasi matematika.

1. Faktorial adalah hasil perkalian suatu bilangan dengan semua bilangan bulat positif yang lebih kecil atau sama dengannya. Perhitungan faktorial dalam program biasanya menggunakan perulangan (for atau while).

2. Bilangan prima adalah bilangan yang hanya memiliki dua pembagi, yaitu 1 dan dirinya sendiri. Untuk mengecek bilangan prima dalam program digunakan percabangan (if) dan perulangan untuk memeriksa apakah ada pembagi selain 1 dan bilangan tersebut.

3. Pola Segitiga adalah Pembuatan pola segitiga menggunakan karakter * bertujuan untuk melatih penggunaan perulangan bersarang (nested loop), yaitu perulangan di dalam perulangan, sehingga dapat membentuk pola tertentu pada output program.
### Langkah Praktikum
1. Buat sebuah class baru di dalam package Praktikumm_1 dan beri nama Factorial dan isikan kode berikut. Kemudian jalankan untuk melihat hasilnya.
## Program
    package Praktikum_1;
    
    public class Factorial {
    public static void main(String[] args) {
    int n = 5;
    int hasil = 1;
    for (int i = 1; i <= n; i++) {
    hasil *= i;
    }
    System.out.println("Faktorial dari " + n + " adalah " + hasil);
    }
    }
## Output
![img_10.png](img_10.png)
2. Buat sebuah class baru di dalam package Praktikum_1 dan beri nama Prima dan isikan kode berikut. Kemudian jalankan untuk melihat hasilnya.
## Program
    package Praktikum_1;

    public class Prima {
    public static void main(String[] args) {
    int n = 7;
    boolean isPrima = true;
    for (int i = 2; i <= n / 2; i++) {
    if (n % i == 0) {
    isPrima = false;
    break;
    }
    }
    System.out.println(n + (isPrima ? "adalah bilangan prima." : "bukan bilangan prima."));
    }
    }
## Output
![img_11.png](img_11.png)
3. Buat sebuah class baru di dalam package Praktikum_1 dan beri nama Segitiga dan isikan kode berikut. Kemudian jalankan untuk melihat hasilnya.
## Program
    package Praktikum_1;
    
    public class Segitiga {
    public static void main(String[] args) {
    int tinggi = 5;
    for (int i = 1; i <= tinggi; i++) {
    for (int j = 1; j <= i; j++) {
    System.out.print("*");
    }
    System.out.println();
    }
    }
    }
## Output

#### Analisa dan Pembahasan
1. Animal adalah superclass dengan method dasar eat() dan sleep().
2. Mammal mewarisi Animal. contoh multilevel inheritance dimulai.
3. Cat dan Dog sama-sama mewarisi Mammal ini membentuk hierarchical inheritance
    - Cat punya method tambahan meow() dan override eat().
    - Dog punya method bark() dan override eat().
4. InheritanceTypeTest menunjukkan:
    - Multilevel: Dog mewarisi Animal → Mammal → Dog (3 tingkat).
    - Hierarchical: Cat & Dog keduanya berasal dari Mammal (satu induk, banyak anak).
    - Polymorphism: Array Animal[] berisi Dog dan Cat, tapi eat() tetap memanggil versi masing-masing karena overriding.

---
## 3. Kesimpulan
Penerapan konsep pewarisan dalam pemrograman berorientasi objek menunjukkan bahwa subclass dapat mewarisi atribut dan metode dari superclass, sehingga kode dapat digunakan kembali dan pengembangan program menjadi lebih efisien. Melalui pewarisan ini, sebuah kelas turunan dapat menambahkan fitur baru maupun menyesuaikan perilaku tertentu tanpa harus menulis ulang fungsi dasar yang sudah tersedia pada kelas induk.
Konsep method overriding memberikan fleksibilitas bagi subclass untuk mengganti implementasi metode yang diwarisi, sehingga perilaku dapat disesuaikan dengan kebutuhan spesifik masing-masing kelas. Penggunaan kata kunci super memastikan bahwa metode milik superclass tetap dapat dipanggil apabila diperlukan. Selain itu, proses ini sekaligus memperlihatkan bagaimana polymorphism bekerja, di mana metode yang dijalankan selalu mengikuti objek sebenarnya, bukan tipe referensi yang digunakan.
Struktur pewarisan yang lebih kompleks seperti multilevel inheritance dan hierarchical inheritance menunjukkan bahwa konsep pewarisan tetap konsisten dan efektif meskipun kelas berada dalam rantai atau cabang pewarisan yang lebih luas. Setiap subclass dapat mengimplementasikan perilaku berbeda melalui overriding, sambil tetap mempertahankan fungsi dasar dari superclass. Secara keseluruhan, pemahaman terhadap pewarisan, overriding, penggunaan super, dan polymorphism menjadi fondasi penting dalam membangun program yang terstruktur, fleksibel, dan mudah dikembangkan.

---
## 4. Referensi
- w3school - https://www.w3schools.com/java/java_inheritance.asp
- petani code - https://www.petanikode.com/java-oop-inheritance/
------