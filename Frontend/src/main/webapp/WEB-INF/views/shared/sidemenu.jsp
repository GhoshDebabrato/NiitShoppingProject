<div class="col-md-3">
	<p class="lead">NIIT SHOPPING APP</p>
	<div class="list-group">
			<c:forEach items="${categoryList}" var="category">
			<a href="${contextRoot}/product/view/category/${category.id}/product" class="list-group-item">${category.name}</a>
		</c:forEach>
	</div>
</div>