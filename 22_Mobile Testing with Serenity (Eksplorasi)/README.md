Mobile Testing
Appium
• Appium adalah kerangka kerja otomatisasi seluler untuk menjalankan uji otomatisasi seluler.

• Appium mendukung banyak bahasa pemrograman seperti java, python. javascript. rubi, dll.

• Pustaka Appium dibuat di atas pustaka Selenium.

• Mendukung aplikasi Android, iOS, dan Windows.

Komponen Appium
\\\Di Appium, ada dua komponen utama yang kami gunakan :

1. Appium Server. Appium Server digunakan sebagai jembatan untuk mengontrol perangkat pengujian. Ada dua versi, kita dapat menggunakan desktop appium atau menginstal perintah appium menggunakan npm.
2. Appium Client. Pustaka ditulis dalam beberapa bahasa untuk membuat skrip pengujian sehingga kami dapat mengirim perintah ke server appium.

Part 2
\\ Appium basic action and cucumber

> Menambahkan File Fitur
> • File fitur digunakan untuk mendefinisikan kasus uji untuk fitur tertentu menggunakan sintaks gherkin

> Memetakan Setiap Langkah Skenario pada Kelas Langkah

> Menginisialisasi Appium
> • Kami membutuhkan kelas untuk memulai dan menghentikan sesi appium

> Menambahkan Kemampuan yang Diinginkan (Desired Capabilities)
> • Perlunya mengatur Kemampuan yang Diinginkan untuk memberi tahu appium fitur mana yang ingin Anda gunakan (misalnya menjalankan aplikasi android atau aplikasi los, file apk mana yang harus kita instal)

\\ Inisialisasi Appium
• Inisialisasi Appium dengan memanggil konstruktor.

\\Cucumber Hooks
• Hooks adalah blok kode yang dapat dijalankan di berbagai titik dalam siklus eksekusi Mentimun Mereka biasanya digunakan untuk pengaturan dan pembongkaran lingkungan sebelum dan sesudah setiap skenario.

• Kita dapat menggunakan Hook @Before untuk menjalankan kode sebelum skenario dijalankan atau Hook @After untuk menjalankan kode setelah skenario dijalankan.

\\\ Page Object Design Pattern
• Mewakili halaman web sebagai file kelas java tunggal

• Terdiri dari semua tindakan yang dapat dilakukan pada satu halaman web.

• Digunakan untuk mengurangi duplikasi kode

• Membantu kode pengujian lebih mudah dibaca dan dipahami

Part 3
\\\ Appium Complex Actions & Maximizing the Project Structure

Working With Wait : The Web driver Wait Object

• Webdriver Wait object digunakan untuk mengatur wait sampai elemen memenuhi kondisi. Ex tunggu sampai elemen terlihat, tunggu sampai elemen hilang, dll.

• Ini adalah bagian dari Explicit wait (Ini hanya berlaku untuk AndroidElement tertentu)

• Konstruktor itu sendiri memiliki 3 parameter:

• Parameter pertama untuk Objek Driver Android

• Parameter ke-2 untuk batas waktu (waktu maksimum yang kami tunggu untuk elemen memenuhi kondisi)

• Parameter ke-3 untuk waktu pemungutan suara (periksa setiap x milis)
• Objek ExpectedConditions menyimpan daftar kondisi yang didukung oleh appium.

\\\ Setting Up Implisit Wait

• Penantian implisit akan diterapkan untuk setiap AndroidElement yang kita buat menggunakan fungsi findElement().

• Anda dapat mengatur waktu tunggu implisit setelah Anda menginisialisasi Driver Android

\\\ The BasePageObject class
• Kelas BasePageObject bertujuan untuk membungkus semua fungsi appium untuk membantu kita menulis lebih sedikit kode di kelas halaman.

• Kita bisa menggunakan warisan. Jadi setiap kelas halaman harus memperluas kelas BasePageObject.

\\\ Performing complex actions
• Objek TouchAction digunakan untuk melakukan tindakan kompleks (gulir, atas dan tahan. dll).

• Ini menggunakan pola desain builder sehingga menggunakan metode chaining dan Anda dapat menggabungkannya untuk melakukan tindakan tertentu.
