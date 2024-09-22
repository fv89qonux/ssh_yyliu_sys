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
	
	<script type="text/javascript">
         function down1(fujianPath,fujianYuashiMing)
	     {
	        <c:if test="${sessionScope.user==null}">
	           alert("请先登录");
	        </c:if>
	     
	        <c:if test="${sessionScope.user!=null}">
	           var url="<%=path %>/updown/updown.jsp?fujianPath="+fujianPath+"&fujianYuashiMing="+fujianYuashiMing;
	           url=encodeURI(url); 
	           url=encodeURI(url); 
	           window.open(url,"_self");
	        </c:if>
	     }
	     
	     function huifuAdd(zhutiId)
	     {
	           <c:if test="${sessionScope.user==null}">
		           alert("请先登录");
		       </c:if> 
		       <c:if test="${sessionScope.user!=null}">
		           var url="<%=path %>/qiantai/huifu/huifuAdd.jsp?zhutiId="+zhutiId;
		           var ret = window.open(url,"","dialogWidth:850px; dialogHeight:450px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
	               window.location.reload();
	           </c:if>  
	     }
	     
	     
	     function huifuDel(id)
	     {
	           <c:if test="${sessionScope.user==null}">
		           alert("请先登录");
		       </c:if> 
		       <c:if test="${sessionScope.user!=null}">
		           var url="<%=path %>/huifuDel.action?id="+id;
		           var ret = window.open(url,"","dialogWidth:200px; dialogHeight:100px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
	               window.location.reload();
	           </c:if>  
	     }
	     
	     
	     function zhutiDel(id)
	     {
	           <c:if test="${sessionScope.user==null}">
		           alert("请先登录");
		       </c:if> 
		       <c:if test="${sessionScope.user!=null}">
		           var url="<%=path %>/zhutiDel.action?id="+id;
		           var ret = window.open(url,"","dialogWidth:850px; dialogHeight:450px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
	               window.location.href="<%=path %>/index.action";
	           </c:if>  
	     }
	     
	     
	    
    </script>
  </head>
  
<body>
<div id="header">
     <div class="header">
	       <div class="top">
	             <jsp:include flush="true" page="/qiantai/top.jsp"></jsp:include>  
	       </div>
		   <div class="main_index">
		        <div class="content dz" style="margin-top: 10px;width: 70%;height: 100%;margin-left: 210px;" >
				    <TABLE borderColor=#E0E0E0 cellSpacing=0 width="100%" border=1>
				        <TR bgColor=#f0f0f0 height=20>
				          <TD style="TEXT-INDENT: 5px" width="15%" style="font-size: 11px;">楼主</TD>
				          <TD colSpan=2 style="font-size: 11px;">
				                                        【主题】${requestScope.zhuti.title } 
				          </TD>
				        </TR>
				        <TR>
				          <TD vAlign=top align="center" rowSpan=3>
				            <TABLE style="MARGIN-TOP: 0px" border=0>
				              <TR>
				                  <TD align="left" width="100%">
				                       <IMG src="<%=path %>/${requestScope.zhuti.user.fujian}" width="90" height="111">
				                  </TD>
				              </TR>
				              <TR>
				                  <TD align="left" width="100%" style="font-size: 11px;">
				                                                                   账号：${requestScope.zhuti.user.loginname }
				                  </TD>
				              </TR>
				              <TR>
				                  <TD align="left" width="100%" style="font-size: 11px;">
				                                                                      姓名：${requestScope.zhuti.user.name }
				                  </TD>
				              </TR>
				              <TR>
				                  <TD align="left" width="100%" style="font-size: 11px;">
				                                                                      积分：${requestScope.zhuti.user.jifen }
				                  </TD>
				              </TR>
				            </TABLE>
				          </TD>
				        </TR>
				        <TR height=100%>
				          <TD style="PADDING-RIGHT: 9px; PADDING-LEFT: 9px; PADDING-BOTTOM: 9px; PADDING-TOP: 9px" vAlign=top style="font-size: 11px;">
				              <c:out value="${requestScope.zhuti.content}" escapeXml="false"></c:out>
				              <br/><br/>
				              <c:if test="${requestScope.zhuti.fujian !='' }">
			                    ${requestScope.zhuti.fujianYuanshiming}
			                    <a href="#" onClick="down1('${requestScope.zhuti.fujian}','${requestScope.zhuti.fujianYuanshiming}')" style="font-size: 13px;color: red">下载</a>
			                  </c:if>
				          </TD>
				        </TR>
				        <TR bgColor=#f9f9f9 height="15">
				          <TD align=right style="font-size: 12px;height: 15px;">
				                                          发表时间：${requestScope.zhuti.shijian }
				              &nbsp;&nbsp;&nbsp;                            
				              <A href="#" onClick="huifuAdd(${requestScope.zhuti.id })" style="font-size: 11px;">回复该贴&nbsp;</A> 
				              <c:if test="${requestScope.zhuti.catelog.banzhu==sessionScope.user.id }">
				                  <A href="#" onClick="zhutiDel(${requestScope.zhuti.id })" style="font-size: 11px;">删除&nbsp;</A> 
				              </c:if>
				          </TD>
				        </TR>
	                </TABLE>
	                <c:forEach items="${requestScope.zhuti.huifuList}" var="huifu" varStatus="ss">
	                <TABLE style="margin-top: 8px;" borderColor=#E0E0E0 cellSpacing=0 width="100%" border=1>
				        <TR bgColor=#f0f0f0 height=20>
				          <TD style="TEXT-INDENT: 5px" width="15%" style="font-size: 11px;">${ss.index+1 }楼</TD>
				          <TD colSpan=2 style="font-size: 11px;"></TD>
				        </TR>
				        <TR>
				          <TD vAlign=top align="center" rowSpan=3>
				            <TABLE style="MARGIN-TOP: 0px" border=0>
				              <TR>
				                  <TD align="left" width="100%">
				                       <IMG src="<%=path %>/${huifu.user.fujian}" width="90" height="111">
				                  </TD>
				              </TR>
				              <TR>
				                  <TD align="left" width="100%" style="font-size: 11px;">
				                                                                   账号：${huifu.user.loginname }
				                  </TD>
				              </TR>
				              <TR>
				                  <TD align="left" width="100%" style="font-size: 11px;">
				                                                                      姓名：${huifu.user.name }
				                  </TD>
				              </TR>
				              <TR>
				                  <TD align="left" width="100%" style="font-size: 11px;">
				                                                                      积分：${huifu.user.jifen }
				                  </TD>
				              </TR>
				            </TABLE>
				          </TD>
				        </TR>
				        <TR height=100%>
				          <TD style="PADDING-RIGHT: 9px; PADDING-LEFT: 9px; PADDING-BOTTOM: 9px; PADDING-TOP: 9px" vAlign=top style="font-size: 11px;">
				              <c:out value="${huifu.content}" escapeXml="false"></c:out>
				              <br/><br/>
				          </TD>
				        </TR>
				        <TR bgColor=#f9f9f9 height="15">
				          <TD align=right style="font-size: 12px;height: 15px;">
				                                          回复时间：${huifu.shijian }
				              &nbsp;&nbsp;&nbsp;      
				              <c:if test="${requestScope.zhuti.catelog.banzhu==sessionScope.user.id }">
				              <A href="#" onClick="huifuDel(${huifu.id })" style="font-size: 11px;">删除&nbsp;</A> 
				              </c:if>
				          </TD>
				        </TR>
	                </TABLE>
	                </c:forEach>
	                <div style="margin-left: 1px;margin-top: 10px;"><A href="#" onclick="huifuAdd(${requestScope.zhuti.id })">
		                <IMG src="<%=path %>/img/reply.gif">
		            </A></div>
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
