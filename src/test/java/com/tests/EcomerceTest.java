package com.tests;

import com.hooks.HooksTest;
import com.pages.EcomercePage;

import org.junit.jupiter.api.Test;
import io.qameta.allure.Allure;

public class EcomerceTest extends HooksTest {
    private EcomercePage ecomercePage;

    // Teste para adicionar itens no carrinho
    @Test
    public void testAddItemsCart() {
        ecomercePage = new EcomercePage();
        Allure.step("Open the web page", () -> {
             ecomercePage.openPage(page);
        });
        Allure.step("Perform Login", () -> {
             ecomercePage.performLogin(page);
        });
        Allure.step("Add Items to Cart", () -> {
             ecomercePage.addItemsToCart(page);
        });
        Allure.step("Validate Items at Cart", () -> {
             ecomercePage.validateCart(page);
        });
    }

    @Test
    public void testCreateAccount() {
        ecomercePage = new EcomercePage();
        Allure.step("Open the web page", () -> {
             ecomercePage.openPage(page);
        });
        Allure.step("Create new account", () -> {
             ecomercePage.createNewUser(page);
        });
        Allure.step("Validate new account", () -> {
             ecomercePage.validateNewUser(page);
        });
    }
}
