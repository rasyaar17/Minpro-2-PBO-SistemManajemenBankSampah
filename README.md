  <h1> SISTEM MANAJEMEN BANK SAMPAH </h1>

<table>
  <tr>
    <td width="150"><b>Nama</b></td>
    <td>: Rasya Aditya Ramadani </td>
  </tr>
  <tr>
    <td><b>NIM</b></td>
    <td>: 2509116082</td>
  </tr>
  <tr>
</table>

## <b>1. Deskripsi Singkat Tentang Program</b>

Sistem Manajemen Bank Sampah adalah aplikasi sederhana berbasis Java yang dibuat untuk membantu mengatur informasi yang berkaitan dengan kegiatan bank sampah. Data yang dikelola meliputi penyetor sampah, jenis dan berat sampah, serta petugas yang bertanggung jawab. Program ini berjalan melalui console dan memanfaatkan ArrayList untuk menyimpan data selama aplikasi sedang dijalankan.

Dalam pembuatannya, program menggunakan konsep Pemrograman Berorientasi Objek (PBO) dengan beberapa class yang memiliki tugas masing-masing, yaitu PenyetorSampah, Sampah, dan PetugasSampah. Pengguna dapat berinteraksi dengan program melalui menu yang tersedia.

Beberapa proses yang dapat dilakukan dalam program ini antara lain:

1. Menambahkan Data, untuk memasukkan informasi penyetor, sampah, dan petugas.

2. Melihat Data, untuk menampilkan informasi yang telah dimasukkan ke dalam program.

3. Menghapus Data Penyetor, untuk menghapus data penyetor berdasarkan ID.

4. Mengubah Berat Sampah, untuk memperbarui berat sampah yang sudah tersimpan.

5. Keluar dari Program, untuk mengakhiri penggunaan aplikasi.

Selain fungsi utama tersebut, program juga menerapkan beberapa konsep dasar PBO seperti access modifier, encapsulation, constructor, ArrayList, validasi input, percabangan, dan perulangan. Dengan penerapan tersebut, program dapat digunakan sebagai contoh sederhana pengelolaan data bank sampah sekaligus penerapan konsep PBO yang telah dipelajari.

## <b>2. Struktur Packages Program</b>

Sistem dirancang memakai konsep MVC (Model, View, Controller), di mana seluruh class didistribusikan ke beberapa package khusus. Pendekatan ini membuat susunan kode jadi lebih teratur dan memudahkan pembagian peran untuk masing-masing bagian

<img width="250" height="254" alt="Cuplikan layar 2026-09-24 193016" src="https://github.com/user-attachments/assets/e34e9f31-fb44-4402-96d2-26a775627598" />

 <b>Gambar 1. Struktur Package</b>

### <b>A. Package Main</b>

Package main memuat class Main.java yang berfungsi sebagai titik awal eksekusi (entry point) seluruh program. Class ini bertugas menginisialisasi alur awal agar komponen sistem Bank Sampah dapat saling terhubung dan mulai dijalankan.

### <b>B. Package Model</b>

Package model bertugas mendefinisikan struktur data, entitas, serta objek utama yang digunakan dalam sistem:

1. Class PenyetorSampah.java digunakan untuk menyimpan dan mengelola data milik nasabah atau masyarakat yang menyetorkan sampah

2. Class PetugasSampah.java digunakan untuk mencatat dan mengelola data identitas petugas yang melayani transaksi bank sampah

3. Class Sampah.java berperan sebagai superclass (induk) yang menyimpan atribut umum dari sampah

4. Class SampahAnorganik.java juga merupakan subclass (turunan dari Sampah.java) yang mengelola data khusus untuk jenis sampah anorganik

5. Class SampahOrganik.java merupakan subclass (turunan dari Sampah.java) yang menyimpan data khusus spesifik untuk jenis sampah organik

### <b>C. Package Controller</b>

Package controller berfungsi mengelola logika bisnis, manipulasi data, serta pemrosesan input dari pengguna:

1. Class SampahCRUD.java menangani seluruh operasi pengolahan data sampah, seperti penambahan, pembaruan, menampilkan, hingga penghapusan data

2. Class InputCek.java berfungsi melakukan validasi dan verifikasi terhadap data inputan agar sesuai dengan aturan sistem. Package ini bertindak sebagai jembatan yang menghubungkan data di model dengan antarmuka di

### <b>D. Package View</b>

Package view berisi class Menu.java yang bertanggung jawab atas tampilan antarmuka interaktif (user interface) berbasis console. Class ini bertugas menampilkan pilihan menu, menerima input aksi dari pengguna, serta menyajikan informasi atau pesan respons hasil olahan dari controller.

---

## <b>3. Penjelasan Alur Program</b>

Awal mulanya, class Main bakal bikin objek Controller sama View dulu pas aplikasi baru jalan. Di sini, Controller langsung menyediakan data awal (dummy) untuk sampel sampah, jadi program nggak kosong dan datanya bisa langsung diakses tanpa harus diketik satu-satu dari awal

Setelah itu, sistem akan menampilkan antarmuka SISTEM MANAJEMEN BANK SAMPAH dan Menu Utama melalui class Menu (view).

1. Tambah Data Sampah

2. Tampilkan Data Sampah

3. Update Data Sampah

4. Hapus Data Sampah

5. Keluar

### <b>3.1 Alur Tambah Data Sampah</b>

<img width="301" height="221" alt="Cuplikan layar 2026-09-24 195156" src="https://github.com/user-attachments/assets/caaaf8e1-92ab-471d-b5ae-4167b75807ea" />

<b>Gambar 2. Memilih Menu 1 Yaitu "Tambah Data Sampah"</b>
Di menu pertama ini kita bakal memasukan ID Sampah, Jenis Sampahnya Apa, Berat Sampahnya Berapa, Apakah Sampah Ini Mudah Terurai

### <b>3.2 Alur Tampilkan Data Sampah</b>
 
<img width="228" height="393" alt="Cuplikan layar 2026-09-24 195227" src="https://github.com/user-attachments/assets/b15d462c-9cd4-46d8-8e9e-698662688288" />

<b>Gambar 3. Memilih Menu 2 "Tampilkan Data Sampah"</b>

Disini saya memilih menu 2 untuk melihat & memastikan apakah data yang sudah saya isi di menu 1 tadi itu sudah tercatat apa belum, dan bisa dilihat disini bahwasanya data tersebut sudah tercatat 

### <b>3.3 Alur Update Data Sampah</b>

<img width="254" height="263" alt="Cuplikan layar 2026-09-24 195309" src="https://github.com/user-attachments/assets/8fd4e4a0-1cf2-4144-aae3-a10c5e3184fe" />

<b>Gambar 4. Memilih Menu 3 "Update Data Sampah"</b>

Fitur Update Data Sampah pada menu nomor 3 diadakan untuk memfasilitasi perubahan data yang dinamis, seperti mengoreksi kesalahan input awal atau menyesuaikan berat sampah jika terjadi perubahan penimbangan

<img width="227" height="91" alt="Cuplikan layar 2026-09-24 195334" src="https://github.com/user-attachments/assets/42e7842a-f488-4170-a8b7-4d6cadc14a2b" />

<b>Gambar 5. Output dari "Update Data Sampah"</b>

Disini bisa kita lihat kembali bahwasanya data sampahnya akan terupdate 

### <b>3.4 Alur Hapus Data Sampah</b>

<img width="242" height="190" alt="Cuplikan layar 2026-09-24 195352" src="https://github.com/user-attachments/assets/b8628027-ed4d-4efa-b8d8-d9fd13a4ac80" />

<b>Gambar 6. Memilih Menu 4 "Hapus Data Sampah"</b>

Fitur Hapus Data Sampah pada menu nomor 4 disediakan agar pengelola dapat menghapus catatan sampah yang tidak lagi valid, salah diinput, atau dibatalkan dari sistem. Pada alurnya, pengguna cukup memasukkan ID sampah yang ingin dihapus (seperti ID 2), lalu controller akan menghapus objek tersebut dari penyimpanan hingga sistem menampilkan notifikasi "Data berhasil dihapus!"

<img width="226" height="319" alt="Cuplikan layar 2026-09-24 195406" src="https://github.com/user-attachments/assets/fe91483b-993b-4a23-a94d-f42616eea79b" />

<b>Gambar 7. Memilih Menu 2 "Tampilkan Data Sampah"</b>

Disini saya memilih menu 2 lagi untuk memastikan kembali kalo data sampah yang saya pilih tadi itu benar benar kehapus 

### <b>3.5 Alur Keluar Dari Program</b>

Jika pengguna memilih menu '5. Keluar', sistem akan menghentikan perulangan Menu Utama dan menampilkan pesan:

<img width="417" height="242" alt="Cuplikan layar 2026-09-24 195420" src="https://github.com/user-attachments/assets/44ea9db2-7c7f-43e8-b394-3b1e44ee6c3e" />

## <b>4. Penerapan Encapsulation</b>

Program menerapkan encapsulation dengan membuat atribut pada setiap class menggunakan access modifier private. Contohnya pada class PetugasSampah, atribut idPetugas, namaPetugas, dan jabatan tidak dapat diakses secara langsung dari class lain

Akses terhadap data dilakukan menggunakan method getter, sedangkan perubahan data dilakukan melalui setter. Setter juga dilengkapi dengan validasi sehingga data yang dimasukkan harus sesuai dengan aturan yang telah ditentukan

Beberapa contoh aturan validasi yang diterapkan adalah:

1. Nama petugas/penyetor: Tidak boleh berupa string kosong ("")
2. Jenis sampah: Tidak boleh kosong atau hanya berisi spasi (.trim().equals(""))
3. Status sampah organik/anorganik: Properti khusus seperti dapatDidaurUlang atau mudahTerurai wajib terisi dan tidak boleh kosong.

Atribut seperti idPetugas, idPenyetor, dan idSampah juga menggunakan keyword final karena ID tersebut bersifat unik dan tidak boleh berubah setelah objek dibuat.

<img width="960" height="600" alt="Cuplikan layar 2026-09-24 203343" src="https://github.com/user-attachments/assets/12d93d1b-64cb-4c88-a69d-a1fb28bfccdf" />

<b>Gambar 8. Penerapan Encapsulation pada "PetugasSampah.Java"</b>

## <b>5. Penerapan Inheritance</b>

Program menerapkan inheritance pada pengelolaan data sampah. Class Sampah digunakan sebagai superclass dan memiliki dua subclass, yaitu:

    Sampah Organik & Sampah Anorganik

Class SampahOrganik dan SampahAnorganik menggunakan keyword extends Sampah, sehingga keduanya mewarisi atribut dan method yang terdapat pada superclass Sampah

<img width="308" height="49" alt="Cuplikan layar 2026-09-24 205202" src="https://github.com/user-attachments/assets/22cdad7a-8085-4153-85ab-66ae63918ccb" />

<b>Gambar 9. Penerapan Inheritance pada "SampahAnorganik.Java"</b>

<img width="294" height="50" alt="Cuplikan layar 2026-09-24 205209" src="https://github.com/user-attachments/assets/4423f591-d0b6-472b-ab23-6c6b74d78e38" />

<b>Gambar 10. Penerapan Inheritance pada "SampahOrganik.Java"</b>

Data yang diwariskan antara lain:

1. ID Sampah (idSampah)
2. Jenis Sampah (jenisSampah)
3. Berat Sampah (berat)

Walaupun memiliki data dasar yang sama, kedua jenis sampah memiliki atribut khusus serta penanganan informasi yang berbeda pada masing-masing subclass:

1. Pada SampahOrganik, terdapat atribut tambahan mudahTerurai untuk mendokumentasikan tingkat kemudahan sampah membusuk/terurai
2. Sedangkan pada SampahAnorganik, terdapat atribut tambahan dapatDidaurUlang untuk menandai apakah sampah tersebut bisa diolah kembali atau tidak

Selain itu, kedua subclass melakukan override pada method tampilkanInfo() untuk menampilkan rincian data dasar beserta informasi khusus dari masing-masing kategori sampah

## <b>6. Penerapan Polymorphism dan Method Overriding</b>

Program juga menerapkan polymorphism dan method overriding pada pencetakan informasi detail data sampah. Pada superclass Sampah terdapat method tampilkanInfo() yang berfungsi untuk menampilkan informasi dasar seperti ID, jenis, dan berat sampah. Method tersebut kemudian di-override pada class SampahOrganik dan SampahAnorganik menggunakan anotasi @Override

Pada SampahOrganik, method tampilkanInfo() memanggil method milik superclass lalu menambahkan output informasi mengenai tingkat kemudahan pembusukan sampah (mudahTerurai). Sedangkan pada SampahAnorganik, method yang sama menampilkan output tambahan mengenai status kelayakan olah ulang sampah (dapatDidaurUlang)

<img width="467" height="91" alt="Cuplikan layar 2026-09-24 210318" src="https://github.com/user-attachments/assets/b7461459-bcd1-4397-bd03-9032799a77ca" />

<b>Gambar 11. Penerapan Polymorphism dan Method Overriding pada "SampahAnorganik"</b>

<img width="414" height="101" alt="Cuplikan layar 2026-09-24 210335" src="https://github.com/user-attachments/assets/f84c1043-adac-4671-86fa-d95c470e6fe6" />

<b>Gambar 11. Penerapan Polymorphism dan Method Overriding pada "SampahOrganik"</b>

## <b>7. Penerapan Validasi Input</b>

Program menerapkan validasi input agar data yang dimasukkan pengguna sesuai dengan aturan sistem dan mengurangi kemungkinan kesalahan input. Validasi ditempatkan pada class yang sesuai dengan data yang dimiliki

Pada class PetugasSampah dan PenyetorSampah terdapat validasi:   
- Nama petugas dan nama penyetor tidak boleh berupa string kosong ("")

Pada class Sampah terdapat validasi:
- Jenis sampah tidak boleh kosong atau hanya berisi spasi (.trim().equals(""))

Pada class SampahOrganik dan SampahAnorganik terdapat validasi:  
- Sifat khusus sampah (mudahTerurai dan dapatDidaurUlang) wajib diisi dan tidak boleh berupa string kosong

Controller (seperti InputCek.java) juga melakukan pengecekan terhadap ketersediaan data dan tipe input pengguna untuk memastikan format yang dimasukkan sesuai (seperti memastikan data berupa angka atau teks yang valid)

View (pada class Menu.java) akan menampilkan pesan peringatan apabila input tidak sesuai dan meminta pengguna untuk memasukkan data kembali

<img width="292" height="206" alt="Cuplikan layar 2026-09-24 211405" src="https://github.com/user-attachments/assets/6e182ff3-fc8d-4d8f-884f-3243c8787787" />

<b>Gambar 12. Penerapan Validasi Input</b>

## <b>8. Penjelasan MVC dan Polymorphism</b>

### <b>8.1 Struktur MVC</b>

Program ini dirancang menggunakan pola arsitektur MVC (Model-View-Controller) untuk memisahkan tanggung jawab kode agar lebih terstruktur dan mudah dikembangkan:

1. Model (Folder model): Berfungsi menyimpan struktur data dan logika entitas. Terdiri dari class PetugasSampah, PenyetorSampah, Sampah, SampahOrganik, dan SampahAnorganik. Bagian ini menyimpan informasi data serta menerapkan enkapsulasi dan validasi setter

2. View (Folder view): Berfungsi sebagai antarmuka pengguna (user interface). Ditangani oleh class Menu yang bertugas menampilkan pilihan menu, menerima input pilihan dari pengguna, dan menampilkan output teks/informasi ke layar

3. Controller (Folder controller): Berfungsi sebagai jembatan antara Model dan View. Ditangani oleh class SampahCRUD (mengatur proses manipulasi data) dan InputCek (memeriksa kualifikasi/validasi data dari keyboard sebelum diproses)

### <b>8.2 Penerapan Polymorphism</b>

Polymorphism pada program ini diterapkan melalui mekanisme Method Overriding

Superclass Sampah menyediakan method dasar tampilkanInfo() untuk mencetak data umum sampah. Subclass SampahOrganik dan SampahAnorganik kemudian melakukan override (penimpaan) terhadap method tersebut menggunakan anotasi @Override

Saat method tampilkanInfo() dipanggil dari objek subclass, program secara dinamis mengeksekusi method versi subclass masing-masing—menampilkan detail khusus seperti mudahTerurai atau dapatDidaurUlang—tanpa merusak struktur data superclass Sampah

<img width="467" height="91" alt="Cuplikan layar 2026-09-24 210318" src="https://github.com/user-attachments/assets/f27ffe20-90b4-48d1-aaae-f297befd2cbe" />

<img width="414" height="101" alt="Cuplikan layar 2026-09-24 210335" src="https://github.com/user-attachments/assets/2e86d1fe-1945-40d6-a12d-f03c591a6f73" />

<b>Gambar 12. Penerapan Method Overriding</b>
