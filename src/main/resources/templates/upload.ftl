<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/upload" method="post" enctype="multipart/form-data">
    上传人姓名<input type="text" name="fileOwner" >
    <input type="file" name="file" multiple/>
    <input type="submit" value="上传" />
</form>
</body>
</html>