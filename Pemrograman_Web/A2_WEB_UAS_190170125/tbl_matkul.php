<?php
require 'function.php';
$matkul = query("SELECT * FROM tbl_matakuliah");
?>

<!DOCTYPE html>
<html lang="Indonesia">
<head>
<title>Daftar Mata Kuliah</title>
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
        <h1><a href="tbl_matkul.php">Daftar Mata Kuliah Teknik Informatika</a></h1>
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
      <table border="1" cellpadding="10" cellspacing="0">
  
  <tr>
    <th>Kode Mata Kuliah</th>
    <th>Nama Mata Kuliah</th>
    <th>Aksi</th>
  </tr>

  <?php foreach($matkul as $row) { ?>
  <tr>
    <td style="color: black;"><?= $row["kode_mk"]; ?></td>
    <td style="color: black;"><?= $row["nama_mk"]; ?></td>
    <td style="color: black;">
      <a href="ubah_matkul.php?kode=<?= $row["kode_mk"]; ?>">ubah</a> | 
      <a href="hapus_matkul.php?kode=<?= $row["kode_mk"]; ?> " onclick="
      return confirm('yakin?');">hapus</a>
    </td>
  </tr>
  <?php } ?>

</table>
      <footer>
        <p style="color: orange;"><strong>Klik Untuk Menambah Data Mata Kuliah</strong></p><br>
        <ul class="nospace inline pushright">
          <li><a class="btn inverse" href="tambah_matkul.php">Tambah Mata Kuliah</a></li>
        </ul>
      </footer>
    </article>
    <!-- ################################################################################################ -->
  </div>
  <!-- ################################################################################################ -->
</div>

    <!-- ################################################################################################ -->
</body>
</html>