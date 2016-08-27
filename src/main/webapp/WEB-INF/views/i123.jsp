<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Product</title>
<style>
.margin50 {
	margin-top: 50px
}

.dimentions-width, .dimentions-height {
	width: 90%;
	display: initial;
}
</style>
</head>
<jsp:include page="header.jsp" />
<body>
	<div class="container">
		<div class="row">
			<h1>Products Data</h1>
			<form:form action="products" method="POST"
				enctype="multipart/form-data" commandName="product">
				<table>

					<div class="col-md-12 form-group margin50">
						Product Id:
						<div class="col-md-4">
							<input type="text" id="name" name="productid"
								class="form-control name">

						</div>
					</div>
					<div class="col-md-12 form-group margin50">
						Name:
						<div class="col-md-4">
							<input type="text" id="name" name="productname"
								class="form-control name">
						</div>
					</div>
					<div class="col-md-12 form-group margin50">
						Quantity:
						<div class="col-md-12">
							<input type="text" id="name" name="productquantity"
								class="form-control name">
						</div>
					</div>
					<div class="col-md-12 form-group margin50">
						Price:
						<div class="col-md-4">
							<input type="text" id="name" name="productprice"
								class="form-control name">
						</div>
					</div>
					<div class="col-md-12 form-group margin50">
						Description:
						<div class="col-md-4">
							<input type="text" id="name" name="productdescription"
								class="form-control name">
						</div>
					</div>
					<div class="col-md-12 form-group margin50">
						Image:
						<div class="col-md-12">
							<input type="file" id="name" name="image"
								class="form-control name">
						</div>
					</div>
					<div class="col-lg-12 form-group margin50">
						ImageName:
						<div class="col-lg-4">
							<input type="text" id="name" name="imagename"
								class="form-control name">
						</div>
					</div>
					<form:select path="category" style="color:black">
						<form:option value="comics">COMICS</form:option>
						<form:option value="art">ART</form:option>
						<form:option value="engineering">ENGINEERING</form:option>
						<form:option value="cooking">COOKING</form:option>
						<form:option value="biography">BIOGRAPHY</form:option>
						<form:option value="historical">HISTORICAL</form:option>
					</form:select>
					<hr>
					<tr>
						<td colspan="2" class="h"><input type="submit" name="action"
							value="Add" style="color: black" /> <input type="submit"
							name="action" value="Edit" style="color: black" /></td>
					</tr>
				</table>

			</form:form>
		</div>
	</div>

</body>
<%@include file="footer.jsp"%>
</html>