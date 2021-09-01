<?php 
$conn = mysqli_connect("localhost", "root", "", "poin_a");

function query($query) {
	global $conn;
	$result = mysqli_query($conn, $query);
	$rows = [];
	while( $row = mysqli_fetch_assoc($result)) {
		$rows[] = $row;
	}
	return $rows;
}

function tambah($data) {
	global $conn;

	$nip = htmlspecialchars($data["nip"]);
	$nama = htmlspecialchars($data["nama"]);
	$hp = htmlspecialchars($data["hp"]);
	$kode_mk = htmlspecialchars($data["kode_mk"]);


	$query = "INSERT INTO tbl_dosen
				VALUES
			  ('$nip', '$nama', '$hp', '$kode_mk')
			";
	mysqli_query($conn, $query);

	return mysqli_affected_rows($conn);
}

function tambah_matkul($data) {
	global $conn;

	$kode_mk = htmlspecialchars($data["kode_mk"]);
	$nama_mk = htmlspecialchars($data["nama_mk"]);


	$query = "INSERT INTO tbl_matakuliah
				VALUES
			  ('$kode_mk', '$nama_mk')
			";
	mysqli_query($conn, $query);

	return mysqli_affected_rows($conn);
}

function ubah($data) {
	global $conn;

	$nip = ($data["nip"]);
	$nama = htmlspecialchars($data["nama"]);
	$hp = htmlspecialchars($data["hp"]);
	$kode_mk = htmlspecialchars($data["kode_mk"]);


	$query = "UPDATE tbl_dosen SET
			nama_dosen = '$nama',
			no_hp_dosen = '$hp',
			kode_mk = '$kode_mk'
		  WHERE nip_dosen = $nip
		";
	mysqli_query($conn, $query);

	return mysqli_affected_rows($conn);
}

function ubah_matkul($data) {
	global $conn;

	$kode_mk = htmlspecialchars($data["kode_mk"]);
	$nama_mk = htmlspecialchars($data["nama_mk"]);

	$query = "UPDATE tbl_matakuliah SET
			kode_mk = '$kode_mk',
			nama_mk = '$nama_mk'
		  WHERE kode_mk = '$kode_mk'
		";
	mysqli_query($conn, $query);

	return mysqli_affected_rows($conn);
}

function hapus($id) {
	global $conn;
	mysqli_query($conn, "DELETE FROM tbl_dosen WHERE nip_dosen = $id");
	return mysqli_affected_rows($conn);
}

function hapus_matkul($id) {
	global $conn;
	mysqli_query($conn, "DELETE FROM tbl_matakuliah WHERE kode_mk = '$id' ");
	return mysqli_affected_rows($conn);
}
?>