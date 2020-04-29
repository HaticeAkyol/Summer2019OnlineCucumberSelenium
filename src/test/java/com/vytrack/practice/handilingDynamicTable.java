package com.vytrack.practice;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;

public class handilingDynamicTable {
    public static void main(String[] args){

        WebDriver driver = Driver.get();
        driver.get("http://demo.guru99.com/test/web-table-element.php");

    }
}
