Fundamental Performance Test

-> Apa itu Performance Test?
Performance test merupakan teknik non-functional testing untuk menentukan parameter sistem dalam halresponsive dan stabilitas di bawah berbagai beban (load kerja). Performance testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan, dan penggunaan resources. Hasil pengujian biasanya berupa number of virtual users.

-> Tolak Ukur Performance Test ?

1. Performance suatu aplikasi sampai suatu batas tertentu.
2. Bukan merupakan functional-test
3. Bisa dalam berbagai macam bentuk untuk memahami reliability, stability dan availability pada environment-nya.

-> Mengapa Performance Test Jarang Dilakukan?
Pada umumnya performance testing cukup mahal untuk diaplikasikan dan dijalankan, namun dapat dijadikan tolak ukur apakah sistem tersebut dapat mengakomodasi traffic yang ada. Hal ini disebabkan karena pengujian memerlukan persiapan yang dimana beberapa kasus harus membuat environment terpisah dari production agar tidak tercampurnya data test dengan data production, Environment ini ada juga yang membuatnya di server cloud yang biayanya bisa lebih besar dari environment production.

-> How to determine the method test

1. Pilih berdasarkan kondisi sistem, apakah belum pernah diuji atau sudah
2. Selalu awali dengan load test untuk tahu kondisi awal sistem
3. Pilih berdasarkan situasi yang akan dihadapi

Tipe-tipe Performance Testing

1.  Smoke Testing
    Smoke Testing adalah sejenis software yang dilakukan setelah perangkat lunak di build untuk memastikan bahwa fungsi penting dari program ini bekerja dengan baik. Ini dijalankan “sebelum” setiap tes fungsional atau regresi rinci dijalankan pada perangkat lunak membangun. Tujuannya adalah untuk menolak aplikasi yang rusak parah, sehingga tim QA tidak membuang waktu menginstal dan menguji aplikasi perangkat lunak.

2.  Load Testing
    Load Testing adalah pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya.

Sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya, kita mengetahui jumlah traffic yang ada di prod sebagai nilai di load test.

3.  Table Tier
    **Table Tier** ini bisa dijadikan patokan ideal suatu sistem baru yang belum pernah masuk ke production.

4.  Stress Testing
    **Stress testing** digunakan untuk menguji stabilitas dan keandalan sistem. Tes ini dapat menentukan sistem pada ketahanan dan penanganan kesalahan dalam kondisi beban yang sangat berat sehingga memastikan bahwa sistem tidak akan crash di bawah situasi krisis.

5.  Spike Testing
    Seperti stress test, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk scale-out, disini tidak.

6.  Soak Testing
    Soak Testing adalah menjalankan sistem pada beban tinggi untuk jangka waktu yang lama. Tujuannya adalah untuk mengetahui reliability ketika dalam tekanan di bawah puncak dalam jangka panjang (>=1 jam) serta mengetahui apakah terdapat bug pada race condition, memory leaks, db connections, dll.
