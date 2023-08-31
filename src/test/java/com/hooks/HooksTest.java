package com.hooks;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class HooksTest {
    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    // Antes de Cada Teste
    @BeforeEach
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
    }

    // Depois de Cada Teste
    @AfterEach
    public void tearDown() {
        page.close(); 
        context.close();
        browser.close();
        playwright.close();
    }
}
