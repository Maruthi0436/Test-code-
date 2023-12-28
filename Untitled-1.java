Step:1
class DynamicTableTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("your_page_url_here");
        try {
            WebElement dynamicTable = driver.findElement(By.id("Dynamic html table "));
            java.util.List<WebElement> rows = dynamicTable.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                java.util.List<WebElement> cells = row.findElements(By.tagName("td"));

                if (cells.size() == 2) {
                    String name = cells.get(0).getText();
                    String age = cells.get(1).getText();

                    System.out.println("Name: " + name + ", Age: " + age);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            driver.quit();
        }



Step:2


class DynamicTableTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("your_page_url_here");
        try {
            WebElement dynamicTable = driver.findElement(By.id("Dynamic html table"));
            java.util.List<WebElement> rows = dynamicTable.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                java.util.List<WebElement> cells = row.findElements(By.tagName("td"));

                if (cells.size() == 2) {
                    String name = cells.get(0).getText();
                    String age = cells.get(1).getText();

                    System.out.println("Name: " + name + ", Age: " + age);
                }
             }
            WebElement tableDataButton = driver.findElement(By.id("table_data_button"));
            tableDataButton.click();
            WebElement newInputTextBox = driver.findElement(By.id("new_input_text_box"));
            newInputTextBox.sendKeys("bob, 20", "Geroge, 42");
            System.out.println("Scenario 2: Clicked on Table Data button, and new input text box displayed.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}



Step:3


public class DynamicTableTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("your_page_url_here");
        try {
            WebElement dynamicTable = driver.findElement(By.id("Dynamic html table"));
            List<WebElement> rows = dynamicTable.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                if (cells.size() == 2) {
                    String name = cells.get(0).getText();
                    String age = cells.get(1).getText();

                    System.out.println("Name: " + name + ", Age: " + age);
                }
            }
            WebElement tableDataButton = driver.findElement(By.id("table_data_button"));
            tableDataButton.click();
            WebElement newInputTextBox = driver.findElement(By.id("new_input_text_box"));
            String jsonData = "[{\"name\" : \"Bob\", \"age\" : 20, \"gender\": \"male\"}, " +
                              "{\"name\": \"George\", \"age\" : 42, \"gender\": \"male\"}, " +
                              "{\"name\": \"Sara\", \"age\" : 42, \"gender\": \"female\"}, " +
                              "{\"name\": \"Conor\", \"age\" : 40, \"gender\": \"male\"}, " +
                              "{\"name\": \"Jennifer\", \"age\" : 42, \"gender\": \"female\"}]";
            newInputTextBox.sendKeys(jsonData);
            System.out.println("Scenario 2: Clicked on Table Data button, inserted data into the input text box.");
            WebElement refreshTableButton = driver.findElement(By.id("refresh_table_button"));
            refreshTableButton.click();
            System.out.println("Clicked on Refresh Table button.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}


Step:5 


public class DynamicTableTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("your_page_url_here");
        try {
            WebElement dynamicTable = driver.findElement(By.id("Dynamic html table"));
            List<WebElement> rows = dynamicTable.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                if (cells.size() == 2) {
                    String name = cells.get(0).getText();
                    String age = cells.get(1).getText();

                    System.out.println("Name: " + name + ", Age: " + age);
                }
            }
            WebElement tableDataButton = driver.findElement(By.id("table_data_button"));
            tableDataButton.click();
            WebElement newInputTextBox = driver.findElement(By.id("new_input_text_box"));
            String jsonData = "[{\"name\" : \"Bob\", \"age\" : 20, \"gender\": \"male\"}, " +
                              "{\"name\": \"George\", \"age\" : 42, \"gender\": \"male\"}, " +
                              "{\"name\": \"Sara\", \"age\" : 42, \"gender\": \"female\"}, " +
                              "{\"name\": \"Conor\", \"age\" : 40, \"gender\": \"male\"}, " +
                              "{\"name\": \"Jennifer\", \"age\" : 42, \"gender\": \"female\"}]";
            newInputTextBox.sendKeys(jsonData);
            System.out.println("Scenario 2: Clicked on Table Data button, inserted data into the input text box.");
            WebElement refreshTableButton = driver.findElement(By.id("refresh_table_button"));
            refreshTableButton.click();
            System.out.println("Clicked on Refresh Table button.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
     private static void assertTableDataMatches(WebElement dynamicTable, String expectedData) {
        List<WebElement> rows = dynamicTable.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            String expectedRow = expectedData.split("\\},")[i - 1] + "}";
            String actualRow = "{\"name\" : \"" + cells.get(0).getText() +
                    "\", \"age\" : " + cells.get(1).getText() +
                    ", \"gender\": \"" + cells.get(2).getText() + "\"}";
            Assert.assertEquals(actualRow, expectedRow, "Data mismatch at row " + i);
        }
    }
}

