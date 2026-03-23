🚀 Selenium-POM-Allure-SingleHTML

📌 Description
A Selenium WebDriver automation framework using Page Object Model (POM) and TestNG, integrated with Allure reporting. It generates both detailed HTML and single-file reports for easy sharing. Designed for scalability, reusability, and efficient test execution using Maven.

---

🛠️ Prerequisites

* Java 11+ ☕
* Maven 🧩
* Eclipse / IntelliJ 💻
* Chrome Browser 🌐
* Allure CLI (2.x) 📊

---

⚙️ Allure Installation

1. Download Allure 2.x from:
   https://github.com/allure-framework/allure2/releases

2. Extract (Example):
   D:\SW Files\allure-2.38.1

3. Add to PATH:
   D:\SW Files\allure-2.38.1\allure-2.38.1\bin

4. Verify:
   allure --version ✅

---

📂 Project Structure

Selenium-POM-Allure-SingleHTML/
│
├── src/
│   ├── main/java/ → Page classes & utilities 🧩
│   └── test/java/ → Test cases 🧪
│
├── testng.xml → Test suite 📋
├── pom.xml → Dependencies & plugins ⚙️
│
├── target/
│   ├── allure-results/ → Raw results 📁
│   ├── site/allure-maven-plugin/ → HTML report 📊
│   └── allure-single/ → Single HTML report 📄

---

▶️ How to Run

Option 1 (Eclipse)
Right click → Run As → Maven test ▶️

Option 2 (Command Line)
mvn clean test 💻

---

📊 Reports

HTML Report:
target/site/allure-maven-plugin/index.html 🌐

Single File Report:
target/allure-single/report.html 📄

---

🌍 Run in Localhost

allure serve target/allure-results 🌐

---

🔄 Execution Flow

TestNG → Selenium → Allure Results → Report Generation → HTML Output

---

⚠️ Common Issues

* Allure not recognized → Check PATH ❌
* Report not generated → Check allure-results 📁
* Version issue → Use Allure 2.x only ⚠️

---

🎯 Summary

✔ Selenium + POM + TestNG + Allure
✔ HTML Report
✔ Single File Report
✔ Localhost Execution
✔ Scalable & Reusable Framework 🚀
