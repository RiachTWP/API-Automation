# API-Automation
adalah project yang di buat untuk melakukan pengetesan terhadap API dari regres.in
# Install Library
1.buka project API Automation
2.melakukan build gradle di halaman project build.gradle

# Get Data
untuk melakukan Get data kita dapat mengambil data untuk 1 user atau per page
untuk per page:
1. dapat di jalankan template yang sudah ada(ini akan membuka halaman 2 dari list users)
2. ![image](https://github.com/RiachTWP/API-Automation/assets/139956318/eb2e64dd-bea9-4bb0-a646-f58ba531c0f8)

untuk per user:
1. dapat di ubah pathnya menjadi : https://reqres.in/api/users/2
2. Command line : 26
3. running project hasilnya akan seperti ini ![image](https://github.com/RiachTWP/API-Automation/assets/139956318/cfaf8cdb-2d64-44e0-8b81-47c1ac188672)

# Post Data
untuk Post data kita bebas dalam untuk menentukan name dan job yang akan kita isi
1. isi valueName & valueJob
2. excute postData
3. ![image](https://github.com/RiachTWP/API-Automation/assets/139956318/4076cc07-183e-4654-9e8c-002584fd924b)

# Put Data
untuk Put Data kita akan menggunakan ID : 894 seperti dari data yang kita dapat saat melakukan post sebelumnya, di sini kita 
akan mengubah nama dari data tersebut
1. input newName 
2. ubah "int userid = 894"
3. ubah semua path di String fName,lName,avatar,email menjadi "api/users/894"
4. ubah path yang ada di puh menjadi "api/users/894"
5. execute putData ![image](https://github.com/RiachTWP/API-Automation/assets/139956318/d92d7ff1-d228-49a6-87b1-04e50adfe1d2)

# Patch Data
untuk Patch Data masih sama menggunakan ID : 894 , di sini kita juga mengubah nama dari data tersebut
1. input "int UserId : 894"
2. input "String newName = "andre" "
3. Input patch "api/users/894"
4. excute patchData ![image](https://github.com/RiachTWP/API-Automation/assets/139956318/ad1818ab-0606-4ff1-944d-23053d73353a)

# Delete Data
untuk delete data disini masih menggunakan data ID : 894
1. input "int userDelete = 894"
2. input path di delete menjadi "api/users/894"
3. excute deletData ![image](https://github.com/RiachTWP/API-Automation/assets/139956318/d3b15cd0-dd5d-4af6-a7df-82c4fc6fec0a)







