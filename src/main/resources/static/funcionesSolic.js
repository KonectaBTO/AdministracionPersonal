function eliminarSolic(idSolicitud) {
	swal({
		title: "Esta seguro de Eliminar?",
		text: "Una vez eliminado, no podrá recuperar el dato eliminado!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"/eliminarSolic/"+id,
					success: function(res){
						console.log(res);
					}
				});
				swal("!El dato a sido eliminado exitosamente!", {
					icon: "success",
				}).then((ok)=>{
					if(ok){
						location.href="/listarSolic";
					}
				});
			} else {
				swal("Tus datos nos fueron eliminados!");
			}
		});
}