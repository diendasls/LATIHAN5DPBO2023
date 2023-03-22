# LATIHAN 5 DPBO - INTRO TO JAVA GUI: APACHE NETBEANS

*Saya Adinda Salsabilla 2005319 mengerjakan Latihan 5 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin*

## Deskripsi Latihan 5
Download this starter project: [Starter Project](https://drive.google.com/file/d/1TEnEay74nhGcSS9PPzQcxksIlaQhTiZ2/view?usp=sharing)
- Add more property (component type: any, except text field)
- Add method to reset form
- Refresh table after update and delete
- Add confirmation prompt before delete
- Build project (generate .jar file)

Result:

![image](https://user-images.githubusercontent.com/101309423/226637238-0eda176a-464d-4569-ac3c-25cf4a9679ff.png)


## Deskripsi Desain Program
#### Design pada Apache Netbeans
![design](https://user-images.githubusercontent.com/101309423/226916658-9ac46e07-37e5-4f1f-98c7-1266f5a18e4a.jpg)


Dalam program GUI **Daftar Mahasiswa** ini berisi penambahan-penambahan dari file starter project di atas, diantaranya:

- **Penambahan _Gender_** dengan menggunakan salah satu swing controls yaitu Combo Box(Dropdown), yang kemudian akan muncul sebagai hasil baru pada kolom Gender dalam tabel.
- **Penambahan _Button Exit Program_** di bagian kanan bawah untuk exit program dengan adanya _Confirmation Prompt_.
- **Penambahan metode untuk _Reset Form_**, dengan klik button _Cancel_ menggunakan prosedur resetForm().
- **Adanya Fitur _Refresh Table_** dalam bentuk _Update_ dan _Delete_ data form.
- **Penambahan _Confirmation Prompt_** setelah Add data, sebelum Delete data, dan setelah klik button Exit.

Deskripsi Button yang ada:
1. **Add** : Button untuk menambahkan data yang telah diisi pada form ke tabel
2. **Cancel** : Button untuk me-reset isi form jika terdapat data pada form
3. **Update** : Button untuk meng-update/mengganti data yang sudah tertera pada tabel, akan muncul ketika user memilih/meng-klik salah satu baris pada tabel
4. **Delete** : Button untuk menghapus data pada tabel di baris yang dipilih user
5. **Exit** : Button untuk keluar dari program GUI

## Alur Program
- Add data

User dapat menambahkan data mahasiswa dengan mengisi form yang terdiri dari textfield NIM, Nama, dan Nilai serta memilih salah satu pilihan pada Dropdown Gender. Kemudian user dapat mengklik tombol ***add*** sehingga data yang diisi akan ditampilkan pada tabel di bawahnya. Jika user mengklik tombol ***Cancel***, maka data yang terisi pada form akan di-reset dan user harus mengisi ulang datanya.

- Delete data

User dapat menghapus data mahasiswa dengan memilih/klik salah satu baris data yang ingin dihapus pada tabel, kemudian klik tombol ***Delete***. Setelah klik tombol delete akan muncul ***Delete Confirmation Prompt*** untuk user, yang jika memilih _YES_ maka data akan terhapus dan muncul alert bahwa data berhasil terhapus dan tidak tertera pada tabel lagi, jika memillih _NO_ maka data tidak terhapus dan masih tertera pada tabel.

- Update data

User dapat melakukan update data, yaitu dengan memilih/klik salah satu baris data yang ingin di-update pada tabel kemudian pada form akan terisi data yang terpilih. User dapat mengganti isi data pada form (baik pada textfield dan dropdown), kemudian klik tombol ***UPDATE*** dan data pada baris yang dipilih di tabel akan ter-update.

## Dokumentasi Program
#### _Result Design_
![doc1](https://user-images.githubusercontent.com/101309423/226895417-4f787fcd-8b7f-433a-861e-147b94643bcc.jpg)

#### _Record_

https://user-images.githubusercontent.com/101309423/226909640-cba99a79-c21b-4546-b7b6-dacb0a5a4bce.mp

