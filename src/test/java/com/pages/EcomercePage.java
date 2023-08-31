package com.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.utils.ScreenShotService;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import net.datafaker.Faker;

public class EcomercePage {
    Faker faker = new Faker();

    // **
    // * Mapeamento de elementos
    // **

    public ElementHandle buttonLogin(Page page) {
        Locator locator = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Signup / Login"));
        return locator.elementHandle();
    }

    public ElementHandle fieldEmail(Page page) {
        Locator locator = page.locator("form").filter(new Locator.FilterOptions().setHasText("Login")).getByPlaceholder("Email Address");
        return locator.elementHandle();
    }

    public ElementHandle fieldPassword(Page page) {
        Locator locator = page.getByPlaceholder("Password");
        return locator.elementHandle();
    }

    public ElementHandle buttonPerformLogin(Page page) {
        Locator locator = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login"));
        return locator.elementHandle();
    }

    public ElementHandle loggedTitle(Page page) {
        Locator locator = page.getByText("Logged in as Fernando");
        return locator.elementHandle();
    }
    
    public ElementHandle buttonViewProductDress(Page page) {
        Locator locator = page.locator("div:nth-child(6) > .product-image-wrapper > .choose > .nav > li > a");
        return locator.elementHandle();
    }

    public ElementHandle buttonViewProductBlueCotton(Page page) {
        Locator locator = page.locator("div:nth-child(34) > .product-image-wrapper > .choose > .nav > li > a");
        return locator.elementHandle();
    }

    public ElementHandle buttonViewProductMenTshirt(Page page) {
        Locator locator = page.locator("div:nth-child(4) > .product-image-wrapper > .choose > .nav > li > a");
        return locator.elementHandle();
    }

    public ElementHandle fieldQuantity(Page page) {
        Locator locator = page.locator("#quantity");
        return locator.elementHandle();
    }
    
    public ElementHandle buttonAddToCart(Page page) {
        Locator locator = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Add to cart"));
        return locator.elementHandle();
    }

    public ElementHandle buttonContinueShopping(Page page) {
        Locator locator = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue Shopping"));
        return locator.elementHandle();
    }

    public ElementHandle buttonHome(Page page) {
        Locator locator = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Home"));
        return locator.elementHandle();
    }

    public ElementHandle buttonCart(Page page) {
        Locator locator = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Cart"));
        return locator.elementHandle();
    }

    public ElementHandle removeItemCart(Page page, String item) {
        Locator locator = page.locator(item).getByRole(AriaRole.CELL, new Locator.GetByRoleOptions().setName("")).locator("a");
        return locator.elementHandle();
    }

    public ElementHandle itemAtCart(Page page, String itemName) {
        Locator locator = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(itemName));
        return locator.elementHandle();
    }

    public ElementHandle itemQuantityCart(Page page, String itemQuantity) {
        Locator locator = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(itemQuantity));
        return locator.elementHandle();
    }

    public ElementHandle fieldName(Page page) {
        Locator locator = page.getByPlaceholder("Name");
        return locator.elementHandle();
    }

    public ElementHandle fieldNewEmail(Page page) {
        Locator locator = page.locator("form").filter(new Locator.FilterOptions().setHasText("Signup")).getByPlaceholder("Email Address");
        return locator.elementHandle();
    }

    public ElementHandle buttonSignup(Page page) {
        Locator locator = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Signup"));
        return locator.elementHandle();
    }

    public ElementHandle checkBoxMr(Page page) {
        Locator locator = page.getByLabel("Mr.");
        return locator.elementHandle();
    }

    public ElementHandle fieldNewPassword(Page page) {
        Locator locator = page.getByLabel("Password *");
        return locator.elementHandle();
    }

    public ElementHandle fieldDays(Page page) {
        Locator locator = page.locator("#days");
        return locator.elementHandle();
    }

    public ElementHandle fieldMonths(Page page) {
        Locator locator = page.locator("#months");
        return locator.elementHandle();
    }

    public ElementHandle fieldYears(Page page) {
        Locator locator = page.locator("#years");
        return locator.elementHandle();
    }

    public ElementHandle fieldFirstName(Page page) {
        Locator locator = page.getByLabel("First name *");
        return locator.elementHandle();
    }

    public ElementHandle fiedlLastName(Page page) {
        Locator locator = page.getByLabel("Last name *");
        return locator.elementHandle();
    }

    public ElementHandle fieldAddress(Page page) {
        Locator locator = page.getByLabel("Address * (Street address, P.O. Box, Company name, etc.)");
        return locator.elementHandle();
    }

    public ElementHandle fieldCountry(Page page) {
        Locator locator =  page.getByLabel("Country *");
        return locator.elementHandle();
    }

    public ElementHandle fieldState(Page page) {
        Locator locator = page.getByLabel("State *");
        return locator.elementHandle();
    }

    public ElementHandle fieldCity(Page page) {
        Locator locator = page.getByLabel("City *");
        return locator.elementHandle();
    }
    
    public ElementHandle fieldZipCode(Page page) {
        Locator locator = page.locator("#zipcode");
        return locator.elementHandle();
    }

    public ElementHandle fieldMobileNumber(Page page) {
        Locator locator = page.getByLabel("Mobile Number *");
        return locator.elementHandle();
    }

    public ElementHandle buttonCreateAccount(Page page) {
        Locator locator = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Account"));
        return locator.elementHandle();
    }

    public ElementHandle messageCreateAccount(Page page) {
        Locator locator = page.getByText("Account Created!");
        return locator.elementHandle();
    }

    
    // **
    // * Métodos e Funções
    // **

    public void openPage(Page page) {
        page.navigate("https://automationexercise.com");
        page.waitForLoadState();
        ScreenShotService.takeScreenShot(page);
    }

    // Método para realizar o login no ecomerce
    public void performLogin(Page page) {
        buttonLogin(page).click();
        page.waitForLoadState();
        ScreenShotService.takeScreenShot(page);
        assertEquals(true, fieldEmail(page).isVisible());
        assertEquals(true, fieldPassword(page).isVisible());
        assertEquals(true, buttonPerformLogin(page).isVisible());
        fieldEmail(page).fill("fernandotoledomoreira@gmail.com");
        fieldPassword(page).fill("1234");
        ScreenShotService.takeScreenShot(page);
        buttonPerformLogin(page).click();
        page.waitForLoadState();
        assertEquals(" Logged in as Fernando", loggedTitle(page).textContent());
        ScreenShotService.takeScreenShot(page);
    }

    // Método para adicionar 3 items Stylish Dress ao carrinho
    public void addDressToCart(Page page) {
        buttonViewProductDress(page).click();
        page.waitForLoadState();
        fieldQuantity(page).fill("3");
        ScreenShotService.takeScreenShot(page);
        buttonAddToCart(page).click();
        ScreenShotService.takeScreenShot(page);
        buttonContinueShopping(page).click();
    }

    // Método para adicionar 2 items Beautiful Peacock Blue Cotton Linen Saree ao carrinho
    public void addBlueCottonToCart(Page page) {
        buttonViewProductBlueCotton(page).click();
        page.waitForLoadState();
        fieldQuantity(page).fill("2");
        ScreenShotService.takeScreenShot(page);
        buttonAddToCart(page).click();
        ScreenShotService.takeScreenShot(page);
        buttonContinueShopping(page).click();
    }
    
    // Método para adicionar 1 item Men Tshirt ao carrinho
    public void addMenTshirtToCart(Page page) {
        buttonViewProductMenTshirt(page).click();
        page.waitForLoadState();
        ScreenShotService.takeScreenShot(page);
        buttonAddToCart(page).click();
        ScreenShotService.takeScreenShot(page);
        buttonContinueShopping(page).click();
    }

    // Método para adicionar items ao carrinho    
    public void addItemsToCart(Page page) {
        buttonHome(page).click();
        page.waitForLoadState();
        ScreenShotService.takeScreenShot(page);
        addDressToCart(page);

        buttonHome(page).click();
        page.waitForLoadState();
        ScreenShotService.takeScreenShot(page);
        addBlueCottonToCart(page);
        
        buttonHome(page).click();
        page.waitForLoadState();
        ScreenShotService.takeScreenShot(page);
        addMenTshirtToCart(page);
    }

    // Método para validar items no carrinho e remove-los
    public void validateCart(Page page) {
        buttonCart(page).click();
        page.waitForLoadState();
        ScreenShotService.takeScreenShot(page);

        assertEquals(true, itemAtCart(page, "Stylish Dress").isVisible());
        assertEquals(true, itemAtCart(page, "Beautiful Peacock Blue Cotton Linen Saree").isVisible());
        assertEquals(true, itemAtCart(page, "Men Tshirt").isVisible());

        assertEquals(true, itemQuantityCart(page, "3").isVisible());
        assertEquals(true, itemQuantityCart(page, "2").isVisible());
        assertEquals(true, itemQuantityCart(page, "1").isVisible());

        removeItemCart(page, "#product-4").click();
        removeItemCart(page, "#product-41").click();
        removeItemCart(page, "#product-2").click();
        ScreenShotService.takeScreenShot(page);
    }
    
    // Método para realizar o cadastro de um novo usuario no ecomerce
    public void createNewUser(Page page) {
        buttonLogin(page).click();
        page.waitForLoadState();
        ScreenShotService.takeScreenShot(page);
        fieldName(page).fill(faker.name().fullName());
        fieldNewEmail(page).fill(faker.name().firstName() + "@teste.com");
        buttonSignup(page).click();
        checkBoxMr(page).click();
        fieldNewPassword(page).fill("1234");
        fieldDays(page).selectOption("12");
        fieldMonths(page).selectOption("5");
        fieldYears(page).selectOption("1971");
        ScreenShotService.takeScreenShot(page);
        fieldFirstName(page).fill(faker.name().firstName());
        fiedlLastName(page).fill(faker.name().lastName());
        fieldAddress(page).fill(faker.address().streetAddress());
        fieldCountry(page).selectOption("United States");
        fieldState(page).fill(faker.address().state());
        fieldCity(page).fill(faker.address().city());
        fieldZipCode(page).fill(faker.address().zipCode());
        fieldMobileNumber(page).fill(faker.number().digits(8));
        ScreenShotService.takeScreenShot(page);
        buttonCreateAccount(page).click();
    }

    public void validateNewUser(Page page) {
        page.waitForLoadState();
        assertEquals(true, messageCreateAccount(page).isVisible());
        ScreenShotService.takeScreenShot(page);
    }
}