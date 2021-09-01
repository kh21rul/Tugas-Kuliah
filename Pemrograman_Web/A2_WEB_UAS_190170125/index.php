<?php
require 'function.php';
$dosen = query("SELECT * FROM tbl_dosen, tbl_matakuliah where tbl_dosen.kode_mk=tbl_matakuliah.kode_mk order by nip_dosen desc");
?>

<!DOCTYPE html>
<html lang="Indonesia">
<head>
<title>Daftar Dosen Teknik Informatika</title>
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
        <h1><a href="index.php">Daftar Dosen Informatika</a></h1>
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
      <table border="1" cellpadding="10" cellspacing="0">
  
  <tr>
    <th>NIP</th>
    <th>Nama</th>
    <th>No HP</th>
    <th>Mata Kuliah</th>
    <th>Aksi</th>
  </tr>

  <?php foreach($dosen as $row) { ?>
  <tr>
    <td style="color: black;"><?= $row["nip_dosen"]; ?></td>
    <td style="color: black;"><?= $row["nama_dosen"]; ?></td>
    <td style="color: black;"><?= $row["no_hp_dosen"]; ?></td>
    <td style="color: black;"><?= $row["nama_mk"]; ?></td>
    <td style="color: black;">
      <a href="ubah_dosen.php?id=<?= $row["nip_dosen"]; ?>">ubah</a> | 
      <a href="hapus_dosen.php?id=<?= $row["nip_dosen"];?>" onclick="
      return confirm('yakin?');">hapus</a>
    </td>
  </tr>
  <?php } ?>

</table>
      <footer>
        <p style="color: orange;"><strong>Klik Dibawah Untuk Menambah Data Dosen</strong></p><br>
        <ul class="nospace inline pushright">
          <li><a class="btn inverse" href="tambah_dosen.php">Tambah Data Dosen</a></li>
        </ul>
      </footer>
    </article>
  </div>
</div>
</body>
</html>