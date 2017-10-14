<%@ page import="org.springframework.web.context.request.SessionScope" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    helloJsp
    <br>
    sessionId:"<%=request.getSession().getId()%>"
    <hr>
    ${host}
    <hr>
    name:<input type="text" id="name"/>
    <br>
    age:<input type="text" id="age"/>
    <br>
    <a href="javascript:void(0);" id="submitBtn">submit</a>
    <div id="submitResult"></div>
    <hr>
    <a href="javascript:void(0);" id="showAllListBtn">showAllList</a>
    <div id="showAllListResult"></div>


    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery-1.8.0.min.js"></script>
    <script>
        (function(){
            $("#submitBtn").click(function(){
                $.ajax({
                    type: "post",
                    url: "${pageContext.request.contextPath}/users/put",
                    data: {"name":$("#name").val(), "age":$("#age").val()},
                    success: function(data){
                        $("#submitResult").text(JSON.stringify(data));
                    }
                });
            });
            $("#showAllListBtn").click(function(){
                $.ajax({
                    type: "get",
                    url: "${pageContext.request.contextPath}/users/",
                    success: function(data){
                        $("#showAllListResult").text(JSON.stringify(data));
                    }
                });
            });
        })();
    </script>
</body>
</html>