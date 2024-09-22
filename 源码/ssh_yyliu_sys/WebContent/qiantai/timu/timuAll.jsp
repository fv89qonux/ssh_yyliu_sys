<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>
<%
   String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/header.css" />
	
	<style type="text/css">
		.c1-bline{border-bottom:#999 1px dashed;border-top:1px;}
		.f-right{float:right}
		.f-left{float:left}
		.clear{clear:both}
	</style>
	
  </head>
  
<body>
<div id="header">
     <div class="header">
	       <div class="top">
	             <jsp:include flush="true" page="/qiantai/top.jsp"></jsp:include>  
	       </div>
		   <div class="main_index">
		        <div class="content dz" style="margin-top: 10px;width: 70%;height: 100%;margin-left: 210px;" >
				   <form action="<%=path %>/ziciDafen.action" name="formAdd" method="post">
					   <c:forEach items="${requestScope.timuList}"  varStatus="sta" var="timu">
							<table cellspacing="5" cellpadding="5">
								<tr>
									<td>
										${sta.index+1 }：${timu.name }(<font color="red">${timu.fenshu }分</font>)
										&nbsp;&nbsp;&nbsp;
									</td>
								</tr>
								<tr>
									<td align="left">
										    A:<input type="radio" name="${timu.id}" value="A" style="border: 0"/>${timu.xuanxianga }<br/>
										    B:<input type="radio" name="${timu.id}" value="B" style="border: 0"/>${timu.xuanxiangb }<br/>
										    C:<input type="radio" name="${timu.id}" value="C" style="border: 0"/>${timu.xuanxiangc }<br/>
										    D:<input type="radio" name="${timu.id}" value="D" style="border: 0"/>${timu.xuanxiangd }<br/>
									</td>
								</tr>
							</table>
							<br/>
					   </c:forEach>
					   <input type="submit" value="确定" style="width: 80px;"/>  
			       </form>
	            </div>
				<center>
				    &nbsp;
				</center>
	       </div>
		   <div class="footer">
			    <div class="copyright" style="margin-top: 8px;">		
			                          版权所有 COPY&copy;2020-2020 
			         &nbsp;&nbsp;&nbsp;&nbsp;
			         <a href="<%=path %>/login.jsp">系统后台</a>
			    </div>
		   </div>
	 </div>
</div>
</body>
</html>
