<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="false"%>

<%@include file="/header.jsp"%>


<form action="reply.board" method="post">
	<input type="hidden" name="b_num" value="${dto['b_num']}"/>
	넘어오시나요:<div>${dto['b_num']}</div><br/><br/>
	제목:<input type="text" name="b_title" value="Re : "/><br/><br/>
	작성자:<input type="text" name="b_writer"/><br/><br/>
	내용:<input type="5" cols="50" name="b_content"></textarea><br/><br/>
	<input type="submit" value="저장"/>
	<input type="button" value="리스트 페이지로 이동"/>
</form>
<%@include file="/footer.jsp"%>