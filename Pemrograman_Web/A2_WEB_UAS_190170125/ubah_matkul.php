<?php  
require'function.php';
$id = $_GET["kode"];

$matkul = query("SELECT * FROM tbl_matakuliah WHERE kode_mk = '$id' ")[0];


if (isset($_POST["submit"])) {
  
  // cek apakah data berhasil diubah atau tidak
  if( ubah_matkul($_POST) > 0 ) {
    echo "
      <script>
        alert('data berhasil diubah!');
        document.location.href = 'tbl_matkul.php';
      </script>
    ";
  } else {
    echo "
      <script>
        alert('data gagal diubah!');
        document.location.href = 'tbl_matkul.php';
      </script>
    ";
  }
}
?>


<!DOCTYPE html>
<html lang="Indonesia">
<head>
<title>Ubah Data Mata Kuliah</title>
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
        <h1><a href="ubah_matkul.php">Ubah Mata Kuliah</a></h1>
        <!-- ################################################################################################ -->
      </div>
      <nav id="mainav" class="fl_right"> 
        <!-- ################################################################################################ -->
        <ul class="clear">
          <li class="active"><a href="index.php">Daftar Dosen</a></li>
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
          <th><label for="kode_mk">Kode Mata Kuliah :</label></th>
          <td style="color: black"><input type="text" name="kode_mk" id="kode_mk" required value="<?= $matkul["kode_mk"]; ?>"></td>
        </tr>
        <tr>
          <th><label for="nama_mk">Nama Mata Kuliah :</label></th>
          <td style="color: black"><input type="text" name="nama_mk" id="nama_mk" required value="<?= $matkul["nama_mk"]; ?>"></td>
        </tr>
        <tr>
          <td style="color: black" colspan="2" align="center"><button type="submit" name="submit"> Ubah Data!</button></td>
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