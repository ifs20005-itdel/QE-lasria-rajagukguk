package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class linkedinSteps {

    @Given("Saya membuka halaman LinkedIn")
    public void saya_membuka_halaman_linkedin() {
        System.out.println("Saya membuka halaman LinkedIn");
    }

    @When("Saya mengklik tombol \"Masuk\"")
    public void saya_mengklik_tombol_masuk() {
        System.out.println("Saya mengklik tombol Masuk");
    }

    @Then("Saya harus melihat halaman masuk LinkedIn")
    public void saya_harus_melihat_halaman_masuk_linkedin() {
        System.out.println();
    }

    @Given("Saya sudah masuk ke LinkedIn")
    public void linkedin() {
        System.out.println("Saya membuka halaman LinkedIn");
    }

    @When("Saya melakukan pencarian kontak dengan kata kunci {string}")
    public void saya_melakukan_pencarian_kontak_dengan_kata_kunci(String kataKunci) {
        System.out.println("Saya melakukan pencarian kontak dengan kata kunci {string}");
    }

    @Then("Saya harus melihat hasil pencarian kontak")
    public void saya_harus_melihat_hasil_pencarian_kontak() {
        System.out.println("Saya harus melihat hasil pencarian kontak");
    }
}
