<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
           function ziyuanDel(id)
           {
               if(confirm('您确定删除吗？'))
               {
                   window.location.href="<%=path %>/ziyuanDel.action?id="+id;
               }
           }
           
           function ziyuanAdd()
           {
                 var url="<%=path %>/admin/ziyuan/ziyuanAdd.jsp";
				 window.location.href=url;
           }
           
           function down1(fujianPath,fujianYuashiMing)
           {
               var url="<%=path %>/updown/updown.jsp?fujianPath="+fujianPath+"&fujianYuashiMing="+fujianYuashiMing;
		       url=encodeURI(url); 
               url=encodeURI(url); 
               window.open(url,"_self");
           }
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/images/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="14" background="<%=path %>/images/tbg.gif">&nbsp;&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="10%">序号</td>
					<td width="30%">信息标题</td>
					<td width="10%">附件下载</td>
					<td width="10%">添加时间</td>
					
					<td width="10%">操作</td>
		        </tr>	
				<s:iterator value="#request.ziyuanList" id="ziyuan" status="sta">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#sta.index+1"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#ziyuan.biaoti"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<a href="#" onclick="down1('<s:property value="#ziyuan.fujian"/>','<s:property value="#ziyuan.fujian"/>')"
						style="font-size: 11px;color: red">附件下载</a>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#ziyuan.shijian"/>
					</td>
					
					<td bgcolor="#FFFFFF" align="center">
						<input type="button" value="删除" onclick="ziyuanDel(<s:property value="#ziyuan.id"/>)"/>
					</td>
				</tr>
				</s:iterator>
			</table>
			
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 8px;">
			  <tr>
			    <td>
			      <input type="button" value="添加资源共享" style="width: 130px;" onclick="ziyuanAdd()" />
			    </td>
			  </tr>
		    </table>
	</body>
</html>
