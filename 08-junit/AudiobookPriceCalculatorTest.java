package put.io.testing.audiobooks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static put.io.testing.audiobooks.Customer.LoyaltyLevel.*;

class AudiobookPriceCalculatorTest {

    @Test
    public void test_sub_st() {

        Audiobook audiobook = new Audiobook("Noce_i_dnie", 100);
        Customer customer = new Customer("Edward", STANDARD, true);

        AudiobookPriceCalculator audiobookPriceCalculator = new AudiobookPriceCalculator();
        assertEquals(0, audiobookPriceCalculator.calculate(customer, audiobook));
    }

    @Test
    public void test_sub_sil() {
        Audiobook audiobook = new Audiobook("Noce_i_dnie", 100);
        Customer customer = new Customer("Edward", SILVER, true);

        AudiobookPriceCalculator audiobookPriceCalculator = new AudiobookPriceCalculator();
        assertEquals(0, audiobookPriceCalculator.calculate(customer, audiobook));
    }

    @Test
    public void test_sub_gold() {
        Audiobook audiobook = new Audiobook("Noce_i_dnie", 100);
        Customer customer = new Customer("Edward", GOLD, true);

        AudiobookPriceCalculator audiobookPriceCalculator = new AudiobookPriceCalculator();
        assertEquals(0, audiobookPriceCalculator.calculate(customer, audiobook));
    }

    @Test
    public void test_n_st() {
        Audiobook audiobook = new Audiobook("Noce_i_dnie", 100);
        Customer customer = new Customer("Edward", STANDARD, false);

        AudiobookPriceCalculator audiobookPriceCalculator = new AudiobookPriceCalculator();
        assertEquals(100, audiobookPriceCalculator.calculate(customer, audiobook));
    }

    @Test
    public void test_n_sil() {
        Audiobook audiobook = new Audiobook("Noce_i_dnie", 100);
        Customer customer = new Customer("Edward", SILVER, false);

        AudiobookPriceCalculator audiobookPriceCalculator = new AudiobookPriceCalculator();
        assertEquals(90, audiobookPriceCalculator.calculate(customer, audiobook));
    }

    @Test
    public void test_n_gold() { //Ścieżka, gdzie Adam nie jest subskrybentem i ma loyality = standard
        Audiobook audiobook = new Audiobook("Noce_i_dnie", 100);
        Customer customer = new Customer("Edward", GOLD, false);

        AudiobookPriceCalculator audiobookPriceCalculator = new AudiobookPriceCalculator();
        assertEquals(80, audiobookPriceCalculator.calculate(customer, audiobook));
    }

}