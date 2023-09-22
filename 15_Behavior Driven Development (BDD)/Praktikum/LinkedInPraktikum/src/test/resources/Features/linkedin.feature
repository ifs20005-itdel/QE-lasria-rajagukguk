Feature: Halaman Utama LinkedIn

  Scenario: Masuk ke LinkedIn
    Given Saya membuka halaman LinkedIn
    When Saya mengklik tombol "Masuk"
    Then Saya harus melihat halaman masuk LinkedIn

  Scenario: Cari Kontak
    Given Saya sudah masuk ke LinkedIn
    When Saya melakukan pencarian kontak dengan kata kunci "Nama Kontak"
    Then Saya harus melihat hasil pencarian kontak
