<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="./css/normalize.min.css">
    <link rel="stylesheet" href="./css/home.min.css">
    <title>To-Do List</title>
</head>

<body>
    <header>
        <div class="Header-Container">
            <div>
                <img class="Header-Logo"
                    src="https://raw.githubusercontent.com/reduxjs/redux/master/logo/logo-title-dark.png"
                    alt="To-Do List">
            </div>
            <div class="Header-Button">
                <button>Giriş Yap</button>
                <button>Kayıt Ol</button>
            </div>
        </div>
    </header>

    <section class="Content">
        
        <div class="Right-Menu">
            <div class="User-Detail">
                <img class="User-Logo" src="./img/user.png" alt="My To-Do List">
                <p><b>Hoş Geldin</b></p>
                <h2>Ali Kömesöğütlü</h3>
            </div>


            <div class="Right-Menu-Function">
                <button class="Right-Menu-Function-Button firstButton">Ekle</button>
                <button class="Right-Menu-Function-Button">Sil</button>
            </div>
            <button class="Right-Menu-Button">Tümünü Göster</button>
            <button class="Right-Menu-Button">Yaklaşanları Göster</button>
            <button class="Right-Menu-Button">Tamamlanmayanları Göster</button>
            <button class="Right-Menu-Button">Tamamlananları Göster</button>
        </div>
        <div class="Left-Content">
            <div class="Card">
                <p class="title">Bugün Saat 7.00'da işe git</p>
                <p class="description">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Perspiciatis dolorum
                    ipsa odio, rem.</p>
                    <div class="Card-Footer">
                            <p>Başlangıç : 28.07.2019</p>
                            <p>Bitiş : 10.08.2019</p>
                    </div>
            </div>
      

        </div>
    </section>

</body>

</html>