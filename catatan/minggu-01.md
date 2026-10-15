# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan

Pada minggu pertama, saya belajar tentang tiga paradigma pemrograman, yaitu prosedural, OOP, dan functional programming melalui proyek Aset-Pinjam. Saya juga mengecek Java dan Maven melalui PowerShell, lalu menjalankan `scripts/uji.ps1` untuk memastikan pengujian proyek berjalan dengan baik.

## Keputusan desain

Saya mengikuti struktur kode yang sudah tersedia di dalam proyek. Saya mempelajari perbedaan ketiga paradigma tersebut, mulai dari penggunaan method statis pada prosedural, class pada OOP, sampai fungsi atau lambda pada functional programming.

## Kendala


Awalnya, saya masih bingung membedakan cara penulisan kode dari ketiga paradigma tersebut, terutama perbedaan penggunaan method statis, class, dan fungsi atau lambda. Saya juga sempat kesulitan memahami alur kode yang sudah tersedia di dalam proyek.

Selain itu, saya mengalami kesulitan menyesuaikan keluaran program dengan hasil yang diminta oleh pengujian. Saya harus lebih teliti memperhatikan format teks dan hasil yang diharapkan agar pengujian bisa berjalan dengan benar.

Untuk mengatasinya, saya membaca kembali kode yang tersedia, memeriksa hasil pengujian melalui terminal, dan memperbaiki bagian yang belum sesuai. Saya juga memastikan Java dan Maven sudah dapat digunakan sebelum menjalankan pengujian kembali.

Setelah diperiksa, hasilnya menunjukkan lima tes tanpa kegagalan maupun kesalahan, dengan status `BUILD SUCCESS`. Dari praktikum ini, saya belajar bahwa memahami kode membutuhkan ketelitian dan pemahaman terhadap hasil yang diharapkan, bukan hanya membuat program bisa dijalankan.

## Penggunaan AI

- **Alat yang dipakai:** ChatGPT (GPT).
- **Bagian yang dibantu AI:** Memahami konsep dasar OOP dan implementasi class `HelloOOP` pada proyek Aset-Pinjam.
- **Prompt utama:** “Bantu saya memahami implementasi class `HelloOOP` pada proyek Java ini.”
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya memeriksa kembali saran yang diberikan dan menyesuaikannya dengan kode serta hasil pengujian proyek.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya mulai memahami perbedaan paradigma prosedural, OOP, dan functional programming serta cara penulisan kode pada masing-masing paradigma.

## Dokumentasi

### 1. Instalasi dan pemeriksaan environment

  mengecek Java dan Maven melalui PowerShell. Hasilnya menunjukkan Java versi 21.0.12 LTS dan Maven versi 3.10.0 sudah terbaca di terminal.

![Instalasi Environment](<Install Environment.png>)

### 2. Hasil pengujian proyek

Saya menjalankan `scripts/uji.ps1` melalui terminal Visual Studio Code. Hasilnya menunjukkan lima tes berhasil tanpa kegagalan maupun kesalahan. Proses build juga selesai dengan status `BUILD SUCCESS`.

![Hasil Pengujian]![alt text](<Test Run-1.png>)