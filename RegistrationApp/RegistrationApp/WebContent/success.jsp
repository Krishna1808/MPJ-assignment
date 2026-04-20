<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
    <style>
        body { font-family: Arial; display: flex; justify-content: center; margin-top: 100px; background: #eef2f7; }
        .box { background: #fff; padding: 40px; border-radius: 8px; text-align: center; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
        h2 { color: #4CAF50; }
        a { display: inline-block; margin-top: 20px; padding: 10px 20px; background: #4CAF50; color: white; text-decoration: none; border-radius: 4px; }
        a:hover { background: #45a049; }
    </style>
</head>
<body>
    <div class="box">
        <h2>✅ Registration Successful!</h2>
        <p>Welcome, <strong><%= request.getAttribute("name") %></strong>!</p>
        <p>Your details have been saved.</p>
        <a href="register.jsp">Register Another</a>
    </div>
</body>
</html>
