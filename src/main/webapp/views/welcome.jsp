<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>

<div class="row">
	<h2>
		<fmt:formatDate value="${ now }" pattern="dd/MM/yyyy" />
	</h2>
</div>

<div class="row">
	<form method="GET"
		action="/SP22B2_SOF3011_IT16302/HelloServlet">
		<label>Họ Tên</label>
		<input type="text" name="ho_ten" />
		<button>Gửi</button>
	</form>
	<h2>Hello ${ name }</h2>
</div>