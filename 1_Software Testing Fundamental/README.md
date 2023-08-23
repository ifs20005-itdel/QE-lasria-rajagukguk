BASIC SOFTWARE DEVELOPMENT

Software Testing Fundamental

    1. Defenisi Software testing

Menurut standar ANSI atau IEEE 1059
SOFTWARE TESTING adalah sebuah proses menganalisis item perangkat lunak untuk mendeteksi perbedaan antara kondisi yang sekarang dengan kondisi yang akan diperlukan untuk mengevaluasi fitur item perangkat lunak .

SEBERAPA PENTING SOFTWARE TESTING
2 cerita

1. pasa feb 2017 terdapat kegagalan pemakaian sehingga kehilangan uang dari rekening pelanggan.
2. 1985 bug yanb disebut race condition, seorang teknisi tidak sengaja dapat mengkonfirgurasi therac-25 sehingga berrkas elektron akan menembak dalam modus kekuasaan tinggi tanpa ,elindungi pasien yang tepat.

dari cerita diatas kita dapat simpulkan software testing kita dapat menghemat uang kita menjamin kualitas produk dan juga kepuasan konsumen atau pelanggan.

SOFTWARE BUG bisa sangat berbahaya dengan adanya bug didalam aplikasi atau software itu bisa menyebabkan krisis moneter maupun manusia

-TESTING PLATFORM
dibagi 4:

1. API -> pengembangan dari inovasi software yang memungkinkan berbagai aplikasi bertukar data dan fungsionalitas dengan mudah dan aman.

2. Web -> sebuah kumpulan halaman yang berisi informasi tertentu dan dapat diakses oleh banyak orang melalui internet.
   DAPAT DIBUKA dengan menuliskan URL atau alamat website di browser.
3. Mobile -> dibagi 2 yaitu android dan IOS bisa kita lihat aplikasi di android jika seperti telegram, instagram, gojek.
4. Desktop -> aplikasi yang ada di desktop seperti code editor, video [layer dan sebagainya.

-FUNCTIONAL TESTING -> Manual, Automate, etc
\> adalah jenis pengujian yang menverifikasi bahwa setiap fungsi aplikasi telah beroperasi sesuai dengan requirement specification.

MANUAL TESTING ATAU PENGUJIAN MANUAL -> adalah langkah untuk mencari cacat atau bug pada program perngkat lunak. dalam metode ini tester atau penguji memiliki peran penting sebagai pengguna akhir untuk pengecekan semua fitur aplikasi bekerja dengan benar, pengujikan melakukan pengecekan secara manual tanpa maenggunakan bantuan tools atau script.
TUJUAN untuk memastikan jika palikasi yang diuji bebas cacat dan aplikasi perangkat lunak dapat bekerja sesuai dengan harapkan.

AUTOMATION TESTING adalah metode pengujian software yang menggunakan suatu software testing dengan tujuan membandingkan antara output yang diprekdisikan dengan output yang dihasilkan oleh sistem.

-NON-FUNCTIONAL TESTING -> Performance Testing, etc
\> pengujian dari aspek non-functional suatu aplikasi seperti kinerja, keandalan, kegunaan, keamanan dan sebagainya. Non-Functional testing dilakukan setelah functional testing selesai.
\> dalam menerapkan ini kita dapat meningkatkan kualitas perangkat lunak hingga tingkat yang sangat tinggi
\> tetapi dengan non functionl testing kita mempunyao peluang untuk menjadikan perangkat lunak lebih baik.
\> PERFORMANCE TESTING -> jenis pengujian perangkat lunak yang bertujuan untuk memastikan aplikasi bekerja yang baik dibawah beban kerja yang diharapkan
// bebeapa concern yang dihadapkan dalam performance testing seperti
-SPEED -> menentukan kecepatan respon suatu aplikasi
-SCALABILITY -> menentukan maksimum userload yang dapat di handleoleh aplikasi. - STABILITY -> menentukan kestabilan aplikasi dalam berbagai jenis jumlah load
HASIL PERFORMANCE TESTING INILAH yang bisa sebagai pedoman bagian mana yang harus ditingkatkan.

-MAINTENANCE TESTING -> Regression, etc
\> dilakukan setelah semua aplikasi atau perangkat lunak dirilis ke konsumen atau user.
\>diperlukan untuk mempertahankan atau meningkatkan karakteristik kualitas non functional dari komponen atau sistem selama masa pakai terutama efisiensi kerja, kompetibilitas, keandalan, keamanan, portabilitas.

LEVELS OF TESTING

1.  Unit Testing
    \> merupakan sebuah pengujian perangkat lunak yang menguji setiap unit atau komponen dari sebuah perangkat lunak
    \> dilakukan saat masa development dari sebuah perangkat lunak oleh developer
    \> Unit testing dalah unit" dari perangkat lunak unit disini dapat berupa function, method, prosedur, modul maupun objek

        TUJUAN

    \> Untuk menvalidasi setiap unit dari kode perangkat lunak dapat berjalan seperti yang diharapkan

beberapa automation tools yang tersedia untuk melakukan unit testing diantaranya J Unit, N unit, J mokit, Emma, PHP unit, dll.

2. Integation Testing
   \> adalah pengujian dari hasil penggabungan unit-unit yang ada di dalam perangkat lunak
   \> bekerja sebagai suatu kombinasi bukan lagi sebagai unit yang individual
   \> dilakukan secara bertahap untuk menghindari kesulitan penelusuran jika terjadi kesalahan atau error atau bug.
   TUJUAN

\> memeriksa sebuah aplikasi atau software dapat berfungsi atau berjalan dengan baik
\> memeriksa kinerja dari sebuah aplikasi dan software
\> ngetes stuktur program yang sudah di rancang

3. Level Testing
   \> merupakan testing yang dilakukan pada satu keseluruhan sistem yang dilakukan tidak lain adalah end to end testing untuk menverifikasi semua skenario telah berjalan dengan baik.
   \> cakupan sistem testing mengetes aspek" fungsional dan non fungsional dari sebuah perangkatt lunak.

4. ACCEPTANCE TESTING
   \> digunakan untuk menentukan apakah sistem yang didevelope telah memenuhi kebutuhan pengguna
   \> dalam beberapa project, acceptance testing dilakukan pada tahap terakhir proses pengujian yaitu sebelum sistem diserahkan kepada pengguna.
   \> dilakukan setelah bebrapa rangkaian testing seperti unit testing, integrtion testing, dan sistem testing selesai.
