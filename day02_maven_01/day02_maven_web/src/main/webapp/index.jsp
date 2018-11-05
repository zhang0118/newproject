<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2018/10/30
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">点击有惊喜</a>

<form action="user/fileupload" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="upload" ><br/>
    <input type="submit" value="上传文件">
</form>

</body>
</html>
