<%--
  Created by IntelliJ IDEA.
  User: vvtua
  Date: 31/03/2022
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <link rel="stylesheet"href="stylesheet.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<div class="main" style="height: 700px;background-color: aqua" >
    <div class="header">
        <div class="header_top">
            <div class="header_top_img">
                <a href="" class="header_top_img_left">
                    <img class="header_top_img_left_c" src="images/FURAMA.png" alt="">
                </a>
            </div>
            <p class="header_top_text"> VO VAN TUAN</p>
        </div>
        <nav class="navbar navbar-expand-lg navbar-light bg-light" style="padding: 0">
            <div class="container-fluid bg-success " style="padding: 0">
                <a class="navbar-brand" href="#">HOME</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand" href="#">EMPLOYEE</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand" href="#">CUSTOMER</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand" href="#">SERVICE</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand" href="#">CONTRACT</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn  bg-warning " type="submit">Search</button>
                </form>
            </div>
        </nav>
        <div class="body" style="display: flex">
            <div class =body_category>
                <nav class="nav flex-column" >
                    <a class="nav-link"  href="#">DISPLAY SERVICE</a>
                    <a class="nav-link" href="#">ADD NEW SERVICE</a>
                    <a class="nav-link" href="#">LIST SERVICE</a>

                </nav>
            </div>
            <div class="body_content"></div>
            <form class="row ">
                <div class="col-3">
                    <label for="inputName" class="form-label">Name Service</label>
                    <input type="text" class="form-control" id="inputName">
                </div>
                <div class="col-3">
                    <label for="inputDate" class="form-label">Area</label>
                    <input type="text" class="form-control" id="inputDate">
                </div>
                <div class="col-3">
                    <label for="inputEmail" class="form-label">Cost</label>
                    <input type="email" class="form-control" id="inputEmail">
                </div>
                <div class="col-3">
                    <label for="inputPhone" class="form-label">Max people</label>
                    <input type="text" class="form-control" id="inputPhone">
                </div>
                <div class="col-3" style="padding-bottom: 250px">
                    <select id="inputState" class="form-select" style="height: 40px; width: 183px;">
                        <option selected>Villa</option>
                        <option>Room</option>
                        <option>House</option>
                    </select>
                </div>
            </form>
        </div>
        <div class="footer" style="height: 150px">
            <img src="images/frm2.png" class="img-fluid" style="object-fit: cover;height: 173px" alt="">
        </div>
    </div>
</div>
</body>
</html>