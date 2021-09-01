<?php 
include'function.php';

$id = $_GET["kode"];

if( hapus_matkul($id) > 0 ) {

	echo "
		<script>
			alert('data berhasil dihapus!');
			document.location.href = 'tbl_matkul.php';
		</script>
		";
} else {
	echo "
		<script>
			alert('data gagal dihapus!');
			document.location.href = 'tbl_matkul.php';
		</script>
		";
}

?>