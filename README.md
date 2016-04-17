# SisfoTubesKel5
TUBES PBO IF3806-KEL5

Aplikasi Sisfo Manajemen Proyek adalah suatu aplikasi yang ditargetkan pada manajer proyek dan programmer. Aplikasi ini dapat membantu manajer proyek dalam mengatur dan memantau proyek serta tugas-tugas yang akan diberikan kepada programmer. Bagi programmer itu sendiri aplikasi ini dapat membantu untuk mengetahui proyek serta tugas yang diberikan oleh manajer, serta programmer dapat mengeset status tugas apabila tugas telah selesai dikerjakan. 

Pada aplikasi terdapat login yang memungkinkan untuk membedakan user menjadi 3 golongan, yaitu Admin, Manajer Proyek, dan Programmer. Untuk user Admin sendiri memiliki fungsionalitas untuk membuat Manajer Proyek, membuat Programmer, menghapus Manajer Proyek, dan menghapus Programmer. Untuk user Manajer Proyek memiliki fungsionalitas untuk menambah Proyek, menghapus Proyek, membuat Tugas, menghapus Tugas, menambahkan Pelaksana, menghapus Pelaksana, dan melakukan Set Pelaksana. Sedangkan untuk user Programmer memiliki fungsionalitas untuk melakukan Set Status Tugas pada tugas yang diberikan oleh Manajer Proyek.

Setiap tampilan aplikasi setelah user login, akan terdapat beberapa menu utama pada sebelah kiri layar aplikasi, dan terdapat informasi user pada pojok kanan atas, dan menu logout terdapat pada pojok kanan bawah.

Pada user Admin, terdapat informasi user pada pojok atas, lalu ada beberapa pilihan menu, yaitu:
1. menu Beranda yang akan menampilkan akivitas terakhir, tabel manajer proyek, dan tabel programmer. 
2. menu Tambah Manajer Proyek yang akan menampilkan field/form berupa nama,telepon,alamat,id,password,jenis kelamin yang harus diisi, yang kemudian klik button simpan untuk meyimpan data
3. menu Tambah Programmer yang akan menampilkan field/form berupa nama,telepon,alamat,id,password,jenis kelamin yang harus diisi, yang kemudian klik button simpan untuk meyimpan data
4. menu Hapus Manajer Proyek yang akan menapilkan field input id Manajer Proyek, dan tabel manajer proyek, unuk menghapus manajer proyek maka harus melakukan input id dari manajer proyek yang akan dihapus lalu klik button hapus untuk menghapus data.
5. menu Hapus Programmer yang akan menapilkan field input id programmer, dan tabel programmer, unuk menghapus programmer maka harus melakukan input id dari programmer yang akan dihapus lalu klik button hapus untuk menghapus data.
6. menu Logout untuk keluar dari halaman menu Admin dan akan menampilkan kembali halaman login.

Pada user Manajer Proyek, terdapat informasi user pada pojok atas, lalu ada beberapa pilihan menu, yaitu:
1. menu Beranda yang menampilkan Aktivitas Terakhir.
2. menu Tambah Proyek yang berisi field input nama proyek yang wajib diisi dan mmenginput tanggal deadline dari proyek, kemudian klik button simpan untuk menyimpan data.
3. menu Hapus Proyek yang akan menampilkan combobox nama proyek yang dapat dipilih, dan tabel proyek. Untuk menghapus proyek, maka perlu melakukan input nama proyek yang akan dihapus dan klik button hapus, untuk menghapus data.
4. menu Detail Proyek akan menampilkan combobox pilihan nama proyek yang akan diaktifkan dengan klik button aktifkan. Kemudian akan muncul 3 tab panel berisi kelola tugas, kelola pelaksana, dan set pelaksana.
4a. menu Kelola pelaksan berisi textfield input nama tugas yang digunakan untuk membuat tugas baru dan untuk menyimpannya harus klik button simpan. kemudian tugas tersebut akan ditampilkan pada tabel tugas pada menu kelola tugas. selain untuk menambah tugas, menu kelola tugas juga menyediakan untuk menghapus tugas, dimana untuk menghapus tugas, tinggal memilih tugas di comboboox yang disediakan dan klik button hapus.
4b. menu Kelola Pelaksana merupakan menu yang berisi fungsi menambah dan menghapus  programmer kedalam proyek, selain itu terdapat 2 tabel programmer tersedia, dan programmer dalam proyek. untuk melakukan penambhanan dan penhapusan programmer, tinggal pilih programmer pada combobox yang disediakan lalu klik simpan untuk menambah programer, dan hapus untuk menghapus programmer.
4c. menu Set Pelaksana berisi fungsi untuk melakukan set programmer terhadap suau tugas. Dimana dengan memilih nama tugas dan nama programmer pada combobox yang disediakan lalu klik buton simpan. yang kemudian akan ditampilkan pada tabel dibawahnya. yaitu tabel daftar tugas dan tabel daftar programmer.
5. menu Logout untuk keluar dari user manajer proyek dan kembali ke halaman login.

Pada user programmer terdapat informasi user pada pojok atas, lalu ada beberapa pilihan menu, yaitu:
1. menu beranda yang berisi aktivitas terakhir.
2. menu set status tugas, dimana programmer dapat melakukan set status tugas menjadi selesai dengan memilih proyek  lalu klik button aktifkan dan tugas pada combobox kemudian klik button selesai. kemudian akan ditampilkan status pada tabel yang disediakan.
3. menu Logout untuk keluar dari user programmerdan kembali ke menu login.

