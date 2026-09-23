# Sistem Manajemen Fasilitas Taman Kota 🌳💟

## 1. Deskripsi Program

**Sistem Manajemen Fasilitas Taman Kota** adalah program berbasis Java yang digunakan untuk mengelola data fasilitas pada taman kota. Program ini merupakan pengembangan dari Mini Project 1 dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO). 

Program menyediakan fitur **CRUD (Create, Read, Update, Delete)** untuk menampilkan, menambahkan, memperbarui, dan menghapus data fasilitas yang berada di taman kota.

Fasilitas pada program dibagi menjadi dua jenis, yaitu:
- **Fasilitas Umum** seperti gazebo, tempat duduk, tempat sampah, dan fasilitas umum lainnya.
- **Fasilitas Olahraga** seperti lapangan basket, lapangan voli, dan fasilitas olahraga lainnya.

## 2. Struktur Program
Program dibagi menjadi beberapa package sebagai berikut:

<img width="738" height="542" alt="image" src="https://github.com/user-attachments/assets/77361da6-99c8-419d-907e-4a3b24ac1eeb" />

Penjelasan masing-masing package, yaitu:
- **`models`** berisi class yang mewakili data fasilitas yaitu `Fasilitas`, `FasilitasUmum`, dan `FasilitasOlahraga`.
- **`view`** berisi `FasilitasView` yang menangani tampilan program dan input dari pengguna.
- **`controller`** berisi `FasilitasController` yang menangani proses CRUD dan pengelolaan data fasilitas.
- **`helper`** berisi `InputHelper` yang membantu proses input dan validasi input.
- **`main`** berisi `Main` sebagai entry point untuk menjalankan program.

## 3. Penjelasan Alur Program

Ketika program dijalankan, class 'Main' membuat objek `FasilitasView` dan `FasilitasController`. Pada saat `FasilitasController` dibuat, program secara otomatis memasukkan dummy data ke dalam `ArrayList`.

Setelah itu, program menampilkan menu utama:

<img width="564" height="352" alt="image" src="https://github.com/user-attachments/assets/b5e61d53-dc20-44c4-a5e0-b53dc16ea8b5" />

