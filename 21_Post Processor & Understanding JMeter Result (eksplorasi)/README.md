Post Processor

What is Post Processor ?
The test plan elements that are used to perform certain actions after processing of a sampler request. These post processors are usually used for extracting certain values from the response of a sampler request e.g. we can extract the value of session variables from an HTTP request and pass the session variable’s value to the subsequent request.

Post Processor :
Bagian dari test plan yang merupakan sebuah aksi yang berjalan ketika proses setelah dilakukan. Proses request itu sendiri ialah proses request ke suatu alamat web.

    Proses request tersebut pada umumnya, mengekstrak value yang didapatkan dari hasil mengakses halaman sebuah web, seperti data-data pada JSON.

    - Post processor yang bisa digunakan di JMeter adalah **JSON Extractor**
    - Di **JSON Extractor** terdapat **Json Path digunakan untuk ekstrak isi dari json response dari** nilai yang terdapat dari data JSON yang dihasilkan dari respons saat kita melakukan request.
