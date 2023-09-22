package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class sepulsaSteps {
    @Given("User is on the Sepulsa homepage")
    public void user_is_on_the_Sepulsa_homepage() {
        // Implementasi aksi ketika pengguna berada di halaman awal Sepulsa.
    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        // Implementasi aksi saat pengguna melakukan login dengan kredensial valid.
    }

    @Then("User selects a product")
    public void user_selects_a_product() {
        // Implementasi aksi ketika pengguna memilih produk.
    }

    @Then("User chooses a payment method")
    public void user_chooses_a_payment_method() {
        // Implementasi aksi ketika pengguna memilih metode pembayaran.
    }

    @Then("User completes the transaction")
    public void user_completes_the_transaction() {
        // Implementasi aksi ketika pengguna menyelesaikan transaksi.
    }

    @Then("User should see a confirmation message")
    public void user_should_see_a_confirmation_message() {
        // Implementasi aksi ketika pengguna harus melihat pesan konfirmasi.
    }

}
