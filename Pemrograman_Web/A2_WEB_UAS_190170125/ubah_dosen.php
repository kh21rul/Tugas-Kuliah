<?php  
require'function.php';
$id = $_GET["id"];
$kode_mk = query("SELECT * FROM tbl_matakuliah");
$dsn = query("SELECT * FROM tbl_dosen WHERE nip_dosen = $id")[0];

if (isset($_POST["submit"])) {
  
  // cek apakah data berhasil diubah atau tidak
  if( ubah($_POST) > 0 ) {
    echo "
      <script>
        alert('data berhasil diubah!');
        document.location.href = 'index.php';
      </script>
    ";
  } else {
    echo "
      <script>
        alert('data gagal diubah!');
        document.location.href = 'index.php';
      </script>
    ";
  }


}

?>

<!DOCTYPE html>
<html lang="Indonesia">
<head>
<title>Ubah Data Dosen</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
</head>
<body id="top">
<!-- Top Background Image Wrapper -->
<div class="bgded overlay" style="background-image:url('images/demo/backgrounds/08.jpg');"> 
  <!-- ################################################################################################ -->
  <div class="wrapper row0">
    <div id="topbar" class="hoc clear">
      <div class="fl_left"> 
        <!-- ################################################################################################ -->
      </div>
      <div class="fl_right"> 
        <!-- ################################################################################################ -->
      </div>
    </div>
  </div>
  <!-- ################################################################################################ -->
  <div class="wrapper row1">
    <header id="header" class="hoc clear">
      <div id="logo" class="fl_left"> 
        <!-- ################################################################################################ -->
        <h1><a href="ubah_dosen.php">Ubah Dosen</a></h1>
        <!-- ################################################################################################ -->
      </div>
      <nav id="mainav" class="fl_right"> 
        <!-- ################################################################################################ -->
        <ul class="clear">
          <li class="active"><a href="tbl_matkul.php">Daftar Mata Kuliah</a></li>
        </ul>
        <!-- ################################################################################################ -->
      </nav>
    </header>
  </div>
  <!-- ################################################################################################ -->
  <div id="pageintro" class="hoc clear"> 
    <!-- ################################################################################################ -->
    <article>
      <table>
    <form action="" method="post">
    <tr>
      <th><label for="nip">NIP :</label></th>
      <td style="color: black"><input type="number" name="nip" id="nip" required readonly="on" value="<?= $dsn["nip_dosen"]; ?>"></td>
    </tr>
    <tr>
      <th><label for="nama">Masukkan Nama :</label></th>
      <td style="color: black"><input type="text" name="nama" id="nama" required value="<?= $dsn["nama_dosen"]; ?>"></td>
    </tr>
    <tr>
      <th><label for="hp">Masukkan No HP :</label></th>
      <td style="color: black"><input type="number" name="hp" id="hp" required value="<?= $dsn["no_hp_dosen"]; ?>"></td>
    </tr>
    <tr>
      <th><label for="kode_mk">Masukkan Kode Mata Kuliah :</label></th>
      <td style="color: black">
        <select name="kode_mk" id="kode_mk" required>
        <?php foreach ($kode_mk as $row ) { ?>
          <option><?= $row["kode_mk"]; ?></option>
        <?php } ?>
        </select>
      </td>
    </tr>
    <tr>
      <td colspan="2" style="color: black" align="center"><button type="submit" name="submit">Ubah Data!</button></td>
    </tr>
    </form>
  </table>
    </article>
    <!-- ################################################################################################ -->
  </div>
  <!-- ################################################################################################ -->
</div>

    <!-- ################################################################################################ -->
</body>
</html>