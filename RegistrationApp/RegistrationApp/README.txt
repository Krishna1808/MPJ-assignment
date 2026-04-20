# RegistrationApp - JSP + Servlet + JDBC

## MySQL Setup (Run this first)
```sql
CREATE DATABASE regdb;
USE regdb;
CREATE TABLE users (
    id       INT AUTO_INCREMENT PRIMARY KEY,
    name     VARCHAR(50),
    email    VARCHAR(50),
    password VARCHAR(50)
);
```

## Steps to Run in Eclipse

1. Open Eclipse (Enterprise Java version)
2. File → Import → General → Existing Projects into Workspace → select this folder
3. Add mysql-connector-java.jar to WebContent/WEB-INF/lib
4. Open src/com/reg/DBConnection.java → change "yourpassword" to your MySQL password
5. Right-click project → Run As → Run on Server → Select Tomcat v9.0
6. Open browser → http://localhost:8080/RegistrationApp/register.jsp

## File Structure
```
RegistrationApp/
├── src/com/reg/
│   ├── DBConnection.java       ← JDBC connection
│   └── RegisterServlet.java    ← handles form submit
├── WebContent/
│   ├── register.jsp            ← registration form
│   ├── success.jsp             ← success page
│   └── WEB-INF/
│       ├── web.xml             ← servlet mapping
│       └── lib/                ← paste mysql-connector.jar here
```

## Download MySQL Connector JAR
https://dev.mysql.com/downloads/connector/j/
→ Platform Independent → ZIP → extract → copy .jar to WEB-INF/lib/
