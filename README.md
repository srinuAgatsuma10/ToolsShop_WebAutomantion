# 🧪 Tool Shop - Selenium Automation Testing Project

Welcome to the **Tool Shop Automation Testing** repository!  
This project showcases end-to-end automation of core e-commerce functionalities using **Selenium WebDriver** and **TestNG**, applied on the demo website:  
🔗 [https://practicesoftwaretesting.com/](https://practicesoftwaretesting.com/)

---

## 📌 Project Overview

This repository demonstrates a practical application of **automated functional testing** for a sample shopping website.  
It follows a **Modular Page Object Model (POM)** structure integrated with **TestNG**, ensuring clean, maintainable, and scalable automation.

---

## ⚙️ Technologies & Tools Used

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven** – Build and dependency management
- **WebDriverManager** – Auto-manage browser drivers
- **ChromeDriver** – Execution browser
- *(Optional: ExcelUtils & ExtentReports for scaling)*

---


## 🗂️ Framework Structure

```
ToolShopAutomation/
├── pom.xml
├── testng.xml
├── /src
│   ├── /main/java
│   │   ├── pages/         # Page classes for each UI module
│   │   └── utils/         # WebDriver setup, Waits, Configs
│   └── /test/java
│       └── testCases/     # TestNG-based test scripts
```

---

## ✅ Test Cases Covered

The following functionalities of the website are automated and validated:

| Test Case ID | Functionality Tested                   |
|--------------|----------------------------------------|
| TC_01        | Register New Account                   |
| TC_02        | Sign In to Application                 |
| TC_03        | Sign Out from Application              |
| TC_04        | Product Search Functionality           |
| TC_05        | Product Filtering                      |
| TC_06        | Add Product to Favourites              |
| TC_07        | Add Product to Cart                    |
| TC_08        | Working with Pagination                |
| TC_09        | Checkout Process                       |
| TC_10        | Data-Driven Login Testing (Excel)      |

---

## 🚀 How to Run the Tests

<table>
  <tr>
    <td width="40%">
      <img src="https://media.giphy.com/media/du3J3cXyzhj75IOgvA/giphy.gif" alt="Test Execution" width="100%">
    </td>
    <td>

1. **Clone the Repository**
   ```bash
   git clone https://github.com/srinuAgatsuma10/ToolsShop_WebAutomantion.git
   cd ToolShop_WebAutomation
   ```

2. **Import into IDE**  
   Import the project into IntelliJ IDEA / Eclipse as a **Maven project**.

3. **Execute Test Cases**
   Run using `testng.xml` file directly or use:
   ```bash
   mvn clean test
   ```

4. **View Results**  
   TestNG will generate console logs and default reports. You can optionally integrate ExtentReports for enhanced HTML output.

    </td>
  </tr>
</table>

---

## 📸 Screenshots & Reporting (Optional)

You can integrate:
- `ExtentReports` for stylish HTML reports
- `Log4j` for debug and execution logs
- Screenshot capture on test failure

---

## 🤝 Author

**Name:** *GIRIDHARA SRINIVAS*  
**Role:** QA Engineer | Test Automation Intern  
**Tools:** Selenium, Java, TestNG, Maven   
**GitHub:** [Bug Hunter](https://github.com/srinuAgatsuma10/)

---

## ⭐ Why This Project?

This project reflects real-world testing scenarios such as:
- Account management
- Functional verification of cart, search, and checkout flows
- Use of POM for scalable test architecture
- A clean, professional automation portfolio for QA roles

---

**Feel free to fork this repo, contribute or reach out for collaboration. Happy Testing!**
