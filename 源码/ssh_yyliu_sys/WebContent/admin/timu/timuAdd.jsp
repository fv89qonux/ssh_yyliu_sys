<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 

<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
        
        <link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
        
        <script language="javascript">
        </script>
	</head>

	<body leftmargin="9" topmargin="9" background='<%=path %>/images/allbg.gif'>
			<form action="<%=path %>/timuAdd.action" name="formAdd" method="post">
				     <table width="80%" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC">
						<tr bgcolor="#EEF4EA">
					        <td colspan="3" background="<%=path %>/images/wbg.gif" class='title'><span>&nbsp;</span></td>
					    </tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="15%" bgcolor="#FFFFFF" align="center">
						        题目名称：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						         <input type="text" name="name" size="90"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" id="timuXuanxianga" height="22">
						    <td width="15%" bgcolor="#FFFFFF" align="center">
						        选项A：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						         <input type="text" name="xuanxianga" size="90"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" id="timuXuanxiangb" height="22">
						    <td width="15%" bgcolor="#FFFFFF" align="center">
						        选项B：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						         <input type="text" name="xuanxiangb" size="90"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" id="timuXuanxiangc" height="22">
						    <td width="15%" bgcolor="#FFFFFF" align="center">
						        选项C：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						         <input type="text" name="xuanxiangc" size="90"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" id="timuXuanxiangd" height="22">
						    <td width="15%" bgcolor="#FFFFFF" align="center">
						        选项D：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						         <input type="text" name="xuanxiangd" size="90"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" height="22" id="radioo">
						    <td width="15%" bgcolor="#FFFFFF" align="center">
						        正确答案：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						        <select name="daan" style="width: 154px;">
						            <option value="A">A</option>
						            <option value="B">B</option>
						            <option value="C">C</option>
						            <option value="D">D</option>
						        </select>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" id="timuXuanxiangd" height="22">
						    <td width="15%" bgcolor="#FFFFFF" align="center">
						        分数：
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						         <input type="text" name="fenshu" value="10" style="width: 150px;" onpropertychange="onchange1(this.value)" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/>
						    </td>
						</tr>
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="15%" bgcolor="#FFFFFF" align="center">
						        &nbsp;
						    </td>
						    <td width="75%" bgcolor="#FFFFFF" align="left">
						       <input type="submit" value="提交"/>&nbsp; 
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
					 </table>
			</form>
   </body>
</html>
