# 📘 Automation Framework – README

## 📌 Project Overview

This project is a **Selenium + TestNG + Allure Reporting framework** designed to execute UI automation tests and generate detailed reports.

It supports:

* Functional & Regression Testing
* TestNG Execution
* Allure Reporting (HTML + Single File)
* Data handling using Apache POI

Reference POM: 

---

## 🛠️ Prerequisites

Ensure the following are installed:

* Java 11+
* Maven (mvn -version)
* Eclipse IDE (or IntelliJ)
* Chrome Browser
* Allure CLI (2.x only)

---

## ⚙️ Allure Installation (IMPORTANT)

### Step 1: Download Allure

Download from:
https://github.com/allure-framework/allure2/releases

Example:
allure-2.38.1.zip

---

### Step 2: Extract

Extract to:
D:\SW Files\allure-2.38.1

---

### Step 3: Set PATH

Add to Environment Variables → PATH:

D:\SW Files\allure-2.38.1\allure-2.38.1\bin

---

### Step 4: Verify

Run:

allure --version

Expected:
2.x.x

---

## 📂 Project Structure

* src/test/java → Test classes
* src/main/java → Utility/Page classes
* testng.xml → Test execution suite
* pom.xml → Dependencies & plugins
* target/allure-results → Raw results
* target/site/allure-maven-plugin → Report
* target/allure-single → Single HTML report

---

## ▶️ How to Run Tests

### Option 1: From Eclipse

Right Click Project →
Run As → Maven test

---

### Option 2: From Command Line

mvn clean test

---

## 📊 How Reports Are Generated

After execution:

✔ Allure results generated →
target/allure-results

✔ HTML Report generated →
target/site/allure-maven-plugin

✔ Single file report →
target/allure-single/report.html

---

## 🌐 How to View Report

### Option 1: Open HTML (Recommended)

Open:

target/site/allure-maven-plugin/index.html

---

### Option 2: Single File Report

Open:

target/allure-single/report.html

---

### Option 3: Localhost (Interactive Report)

Run:

allure serve target/allure-results

Opens in browser:

[http://localhost:xxxx](http://localhost:xxxx)

---

## 📌 Execution Flow

1. TestNG executes test cases
2. Allure captures results
3. Maven plugin generates report
4. Exec plugin creates single HTML
5. Report opens automatically

---

## ⚠️ Common Issues & Fixes

### 1. Allure not recognized

Fix:
Ensure Allure path is set correctly

---

### 2. Report not generated

Check:
target/allure-results exists

---

### 3. Build failure due to exec plugin

Reason:
Command/path issue

Fix:
Use full path OR simplify plugin

---

### 4. Allure version conflict

Ensure:
Only Allure 2.x installed


