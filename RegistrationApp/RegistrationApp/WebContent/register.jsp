<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
    <style>
        body { font-family: Arial; display: flex; justify-content: center; margin-top: 80px; background: #eef2f7; }
        form { background: #fff; padding: 30px; border-radius: 8px; width: 300px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
        h2 { text-align: center; color: #333; }
        label { font-size: 13px; color: #555; }
        input { width: 100%; padding: 8px; margin: 6px 0 14px; box-sizing: border-box; border: 1px solid #ccc; border-radius: 4px; }
        button { width: 100%; padding: 10px; background: #4CAF50; color: white; border: none; border-radius: 4px; cursor: pointer; font-size: 15px; }
        button:hover { background: #45a049; }
    </style>
</head>
<body>
    <form action="RegisterServlet" method="post">
        <h2>Register</h2>
        <label>Name</label>
        <input type="text" name="name" placeholder="Enter your name" required />
        <label>Email</label>
        <input type="email" name="email" placeholder="Enter your email" required />
        <label>Password</label>
        <input type="password" name="password" placeholder="Enter password" required />
        <button type="submit">Register</button>
    </form>
</body>
</html>
