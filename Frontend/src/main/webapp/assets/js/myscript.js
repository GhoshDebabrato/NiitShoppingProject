$(function() {
// Product DataTable
	var $table = $('#productTable');

	if ($table.length) {
		
		var jsonUrl = '';
		if (window.categoryId == '') {
			jsonUrl = window.contextRoot + '/json/data/view/all/active/products';
		} else {
			jsonUrl = window.contextRoot + '/json/data/view/category/'
					+ window.categoryId + '/products';
		}

		$table
				.DataTable({
					lengthMenu : [ [ 3, 5, 10, -1 ],
							[ '3 Items', '5 Items', '10 Items', 'ALL' ] ],
					pageLength : 5,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
						{
								data : 'code',
								bSortable : false,
								mRender : function(data, type, row) {

									return '<img src="' + window.contextRoot
											+ '/rs/images/' + data
											+ '.jpg" class="dataTableImg"/>';

								}

							},
							{
								data : 'name',
								bSortable:false
							},
							{
								data : 'brand'
							},
							{
								data : 'unitPrice',

							},
							{
								data : 'quantity',
							},
							{
								data : 'id',
								bSortable : false,
								mRender : function(data, type, row) {

									var str = '';
									str += '<a href="javascript:void(0)" class="btn btn-success disabled"><span class="glyphicon glyphicon-eye-open"></span></a>&nbsp;&nbsp;';

									
											str += '<a href="javascript:void(0)" class="btn btn-success disabled"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
									
									return str;

								}
							}		

					]
				});
	}


});