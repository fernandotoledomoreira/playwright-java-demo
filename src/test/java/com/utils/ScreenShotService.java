package com.utils;

import java.nio.file.Paths;

import com.microsoft.playwright.Page;

import io.qameta.allure.Allure;

public class ScreenShotService {

    // Método para tirar screenshot e realizar o attach no allure report
    public static void takeScreenShot(Page page) {
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("src/test/java/com/screenshot/screenshot.png")));
        Allure.addAttachment("screenshot", ScreenShotService.class.getResourceAsStream("/com/screenshot/screenshot.png"));
    }
}
