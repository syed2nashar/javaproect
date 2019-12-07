<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- For binding form with a java class -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<h1 style='color: blue; text-align: center'>Currency Conversion
	Application</h1>

<form:form action="conversionform" method="POST"
	modelAttribute="conversionFormBean">
	<table style="width:1000px" style="text-align:center">

		<tr style="text-align: center">
			<td>Currency From :</td>
			<td><form:input path="from" /></td>
		</tr>
		<tr style="text-align: center">
			<td>Currency To :</td>
			<td><form:input path="to" /></td>
		</tr>
		<tr style="text-align: center">
			<td>Quantity :</td>
			<td><form:input path="qnty" /></td>
		</tr>
		<tr>
			<td><input type="reset" value="Reset" /></td>
			<td><input type="submit" value="Convert"></td>
		</tr>
	</table>
	</form:form>
<hr>
	Converted Amount: ${responseBean.getTotalcost()}