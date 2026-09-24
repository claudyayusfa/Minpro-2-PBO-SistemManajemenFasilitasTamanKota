# Sistem Manajemen Fasilitas Taman Kota ˚˖𓍢ִִ໋🌼🧺˚˖𓍢ִ🌿˚.

- Nama      : Claudya Yusfa Ariyani
- NIM       : 2509116043
- Kelas     : B2025

## 1. Deskripsi Program 📃

**Sistem Manajemen Fasilitas Taman Kota** adalah program berbasis Java yang digunakan untuk mengelola data fasilitas pada taman kota. Program ini merupakan pengembangan dari Mini Project 1 dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO). 

Program menyediakan fitur **CRUD (Create, Read, Update, Delete)** untuk menampilkan, menambahkan, memperbarui, dan menghapus data fasilitas yang berada di taman kota.

Fasilitas pada program dibagi menjadi dua jenis, yaitu:
- **Fasilitas Umum** seperti gazebo, tempat duduk, tempat sampah, dan fasilitas umum lainnya.
- **Fasilitas Olahraga** seperti lapangan basket, lapangan voli, dan fasilitas olahraga lainnya.

## 2. Struktur Program 🗂️
Program dibagi menjadi beberapa package sebagai berikut:

<img width="738" height="542" alt="image" src="https://github.com/user-attachments/assets/77361da6-99c8-419d-907e-4a3b24ac1eeb" />

Penjelasan masing-masing package, yaitu:
- **`models`** berisi class yang mewakili data fasilitas yaitu `Fasilitas`, `FasilitasUmum`, dan `FasilitasOlahraga`.
- **`view`** berisi `FasilitasView` yang menangani tampilan program dan input dari pengguna.
- **`controller`** berisi `FasilitasController` yang menangani proses CRUD dan pengelolaan data fasilitas.
- **`helper`** berisi `InputHelper` yang membantu proses input dan validasi input.
- **`main`** berisi `Main` sebagai entry point untuk menjalankan program.

## 3. Penjelasan Alur Program 🛝

Ketika program dijalankan, class 'Main' membuat objek `FasilitasView` dan `FasilitasController`. Pada saat `FasilitasController` dibuat, program secara otomatis memasukkan dummy data ke dalam `ArrayList`.

Setelah itu, program menampilkan menu utama:

<img width="564" height="352" alt="image" src="https://github.com/user-attachments/assets/b5e61d53-dc20-44c4-a5e0-b53dc16ea8b5" />

Alur dari setiap menu adalah:

1. **Tampilkan Fasilitas**
   Menampilkan seluruh data fasilitas yang tersimpan di dalam `ArrayList`.
2. **Tambah Fasilitas**
   Pengguna memasukkan ID, nama, jenis fasilitas, kondisi, dan jumlah fasilitas. Pengguna dapat memilih antara Fasilitas Umum dan Fasilitas Olahraga.
3. **Hapus Fasilitas**
   Pengguna memasukkan ID fasilitas. Jika ID ditemukan, data fasilitas akan dihapus dari `ArrayList`.
4. **Update Fasilitas**
   Pengguna memasukkan ID fasilitas yang akan diperbarui. Program kemudian meminta nama, kondisi, dan jumlah fasilitas baru.
5. **Keluar dari Program**
   Program berhenti dan menampilkan pesan bahwa program telah selesai.

## 4. Dokumentasi Running Program ⚡︎

### 4.1 Menu Utama
Ketika program pertama kali dijalankan, sistem manampilkan lima pilihan menu yang dapat dipilih oleh pengguna.

<img width="562" height="354" alt="image" src="https://github.com/user-attachments/assets/9731928b-5cab-484d-9514-01dfae4319b0" />

---

### 4.2 Menampilkan Data Fasilitas (Read)
Pada menu **1. Tampilkan Fasilitas**, program menampilkan seluruh data fasilitas yang tersimpan di dalam `ArrayList`.
Program telah memiliki dummy data awal berupa **Gazebo** sebagai Fasilitas Umum dan **Lapangan Basket** sebagai Fasilitas  Olaharaga. Oleh karena itu, data dapat langsung ditampilkan tanpa melakukan penambahan data terlebih dahulu.

<img width="550" height="668" alt="image" src="https://github.com/user-attachments/assets/1005a347-e2b8-454e-aa5e-64a8ba702ce4" />

---

### 4.3 Menambahkan Data Fasilitas Umum (Create)
Pada menu **2. Tambah Fasilitas**, pengguna dapat menambahkan fasilitas baru. Untuk Fasilitas Umum, pengguna memasukkan:

- ID Fasilitas
- Nama Fasilitas
- Memilih `1. Fasilitas Umum`
- Kondisi Fasilitas
- Jumlah Fasilitas
- Jenis Fasilitas Umum
  
Data kemudian disimpan sebagai objek `FasilitasUmum` ke dalam `ArrayList`.

<img width="550" height="726" alt="image" src="https://github.com/user-attachments/assets/18cd3e32-9197-4003-884f-7d4a5bdff8c7" />

---

### 4.4 Menambahkan Data Fasilitas Olahraga (Create)
Pengguna juga dapat memilih **2. Fasilitas Olahraga** ketika menambahkan data. Data yang dimasukkan akan dibuat menjadi objek `FasilitasOlahraga` dan memiliki informasi tambahan seperti jenis olahraga.

<img width="550" height="722" alt="image" src="https://github.com/user-attachments/assets/9e430c1c-8145-4c3d-990b-cc2ccd4a9005" />

### 4.5 Hasil Setelah Menambahkan Data Fasilitas Baru
Setelah input data baru **Fasilitas Umum** dan **Fasilitas Olahraga**, dapat ditampilkan pada menu **1. Tampilkan Fasilitas**

<img width="556" height="450" alt="image" src="https://github.com/user-attachments/assets/bdb5a012-53e6-43d8-aaf9-ba8e26545afb" />

---

### 4.6 Hapus Data Fasilitas (Delete)
Pada menu **3. Hapus Fasilitas**, pengguna memasukkan ID fasilitas yang ingin dihapus. 
Program akan mencari fasilitas berdasarkan ID. Jika fasilitas ditemukan, data tersebut akan dihapus dari `ArrayList`.

<img width="554" height="512" alt="image" src="https://github.com/user-attachments/assets/7dc5aaaf-a7c5-4103-af91-737a3f1b5594" />

Setelah menghapus ID fasilitas, maka di menu tampilkan data fasilitas akan terhapus juga.

<img width="548" height="800" alt="image" src="https://github.com/user-attachments/assets/48af25c3-d24d-4e6f-8894-5990a5376d8b" />

### 4.5 Update Data Fasilitas (Update)
Pada menu **4. Update Fasilitas**, penguna memasukkan ID fasilitas yang ingin diperbarui datanya.
Jik ID ditemukan, pengguna dapat memperbarui:
- Nama Fasilitas
- Kondisi Fasilitas
- Jumlah Fasilitas
Setelah proses selesai, program menampilkan pesan
```text
Fasilitas berhasil diperbarui!
```
<img width="562" height="540" alt="image" src="https://github.com/user-attachments/assets/25ee1fce-eaca-4586-8cf5-734706f097e2" />

Setelah data diperbarui, pada menu tampilkan data fasilitas, data yang diperbarui berhasil diubah.

<img width="570" height="216" alt="image" src="https://github.com/user-attachments/assets/652e9c2f-f209-4c8a-9ae1-58e61ce75465" />

### 4.6 Validasi Input
Program menerapkan validasi input untuk mencegah pengguna memasukkan data yang tidak sesuai.
Beberapa validasi yang diterapkan antara lain:
- ID harus lebih dari 0.

  <img width="544" height="78" alt="image" src="https://github.com/user-attachments/assets/78a65a0b-d690-447f-8173-f56417f5c6f5" />

- ID fasilitas tidak boleh sama dengan ID yang sudah digunakan.

  <img width="536" height="76" alt="image" src="https://github.com/user-attachments/assets/0a3f3343-6424-4e4a-92c4-b9437260ade1" />
  
- Input String tidak boleh kosong.

  <img width="536" height="74" alt="image" src="https://github.com/user-attachments/assets/e6729c42-1867-4a6c-8c41-715d3f726b63" />

- Input angka tidak boleh berupa huruf.

  <img width="538" height="86" alt="image" src="https://github.com/user-attachments/assets/2c924d80-4141-4a8f-8d7d-f0011f425dcf" />

- Angka tidak boleh negatif.

  <img width="534" height="68" alt="image" src="https://github.com/user-attachments/assets/04545a3d-0d57-42bd-ac11-9cf44ed81ba5" />

- Kondisi fasilitas hanya dapat dipilih antara Baik, Cukup, dan Rusak.

  <img width="508" height="274" alt="image" src="https://github.com/user-attachments/assets/d3d0c345-74c8-42bb-b19e-8859e139bab9" />

---

### 4.7 Keluar dari Program
Ketika pengguna memilih menu **5**, perulangan program berhenti dan sistem menampilkan pesan:

<img width="696" height="84" alt="image" src="https://github.com/user-attachments/assets/c0cd45ad-161e-4100-8dea-42dfe860dce5" />

## 5. Penerapan Encapsulation
Konsep **encapsulation** diterapkan dengan membuat atribut pada class menggunakan access modifier `private`.
Contoh pada class `Fasilitas`:
```java
public class Fasilitas {
    private int id;
    private String nama;
    private String kondisi;
    private int jumlah;
```

