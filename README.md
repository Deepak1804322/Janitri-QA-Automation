
# Janitri QA Automation Project

This project is built as part of the Janitri QA Internship Assignment. It automates the login page at [https://dev-dash.janitri.in](https://dev-dash.janitri.in) using Java, Selenium WebDriver, Maven, and TestNG with Page Object Model (POM).

---

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

---

##  How to Run

1. Install **ChromeDriver** and place it in the `/drivers` folder.
2. Open the project in your IDE (e.g., IntelliJ, Eclipse).
3. Run the following Maven command:

```bash
mvn clean test
```

4. TestNG will execute all test cases automatically.

---

## Tests Automated

| Test Case | What It Checks | Expected Output |
|-----------|----------------|-----------------|
| **1. Disabled login** | Login button when fields are empty |  Button remains disabled |
| **2. Password toggle** | Click eye icon | 👁 Password becomes visible |
| **3. Invalid login** | Wrong username/password |  Error: "Invalid credentials" |
| **4. Element visibility** | Username, password fields, toggle icon, and login button | All elements visible on load |

---

##  Sample Console Output

```bash
[INFO] Running tests.LoginTests
PASSED: testLoginButtonDisabledWhenFieldAreEmpty
PASSED: testPasswordMaskedButton
PASSED: testInvalidLoginShowErrorMsg
PASSED: testPageElementsVisible

Tests run: 4, Failures: 0, Skips: 0
```

---
## Manual Test Cases

- File: `Manual_Test_Cases.xlsx`
- Covers Functional, Negative, UI, and Boundary tests for the login page

---
## 🔗 Login URL

[https://dev-dash.janitri.in](https://dev-dash.janitri.in)

---
## Author

Vakkala Deepak Reddy
