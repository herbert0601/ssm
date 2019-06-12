<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <!-- 导入jquery核心类库 -->
    <script type="text/javascript" src="./js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        // document.getElementById("myForm").submit();
    </script>
</head>
<Body>
<form id="myForm" method="post" action="${pageContext.request.contextPath}/addStudent.action">
    学号：<input type="text" name="sno" placeholder="请输入学号：">
    姓名：<input type="text" name="username" placeholder="请输入姓名：">
    密码：<input type="password" name="password">
    性别：<input type="radio" name="sex" value="男" checked="checked">男
         <input type="radio" name="sex" value="女">女
         <input type="submit" value="提交">
</form>
</body>
</html>