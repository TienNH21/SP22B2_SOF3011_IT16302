<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form method="GET"
	action="/SP22B2_SOF3011_IT16302/HelloServlet">
	<label>Họ Tên</label>
	<input type="text" name="ho_ten" />
	<button>Gửi</button>
</form>
<h2>Hello ${ name }</h2>
