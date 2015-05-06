<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<h1>iRonicz - Add Users</h1>
<s:actionerror/>
<s:form action="save" method="post">
    <s:textfield name="username" label="Username"/>
    <s:textfield name="email" label="Email"/>
    <s:radio label="Sex" name="sex" list="#{'male':'Male','femal':'Female'}"  />
    <s:date name="dob" format="dd/MM/yyyy" />
    <s:select list="#{'IN': 'India', 'US':'United States'} " name="country" label="Country" />
    <s:textfield name="phonenumber" label="Phone Number" />
    <s:submit name="save" />
</s:form>

</body>
</html>