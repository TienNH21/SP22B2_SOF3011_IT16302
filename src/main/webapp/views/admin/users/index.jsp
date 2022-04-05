<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    session="true"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<c:if test="${ empty ds }">
	<p class="alert alert-warning">Không có dữ liệu</p>
</c:if>

<c:if test="${ !empty sessionScope.message }">
	<div class="alert alert-success">
		${ sessionScope.message }
	</div>
	<c:remove var="message" scope="session" />
</c:if>

<c:if test="${ !empty sessionScope.error }">
	<div class="alert alert-danger">
		${ sessionScope.error }
	</div>
	<c:remove var="error" scope="session" />
</c:if>

<c:if test="${ !empty ds }">
	<table class="table">
		<thead class="table-dark">
			<th>Họ tên</th>
			<th>Giới tính</th>
			<th>Địa chỉ</th>
			<th>SĐT</th>
			<th>Email</th>
			<th colspan="2">Thao tác</th>
		</thead>
		<tbody>
			<c:forEach items="${ ds }" var="user">
				<tr>
					<td>${ user.hoTen }</td>
					<td>
						<c:choose>
							<c:when test="${ user.gioiTinh == 1 }">Nam</c:when>
							<c:when test="${ user.gioiTinh == 0 }">Nữ</c:when>
							<c:otherwise> - </c:otherwise>
						</c:choose>
					</td>
					<td>${ user.diaChi }</td>
					<td>${ user.sdt }</td>
					<td>${ user.email }</td>
					<td>
						<a class="btn btn-primary"
href="/SP22B2_SOF3011_IT16302/users/edit?id=${ user.id }"
						>
							Cập nhật
						</a>
					</td>
					<td>
						<a class="btn btn-danger"
href="/SP22B2_SOF3011_IT16302/users/delete?id=${ user.id }"
						>
							Xóa
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</c:if>
