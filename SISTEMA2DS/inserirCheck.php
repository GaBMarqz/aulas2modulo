<?php

    include("conexao.php");

    $nome = $_POST['nome'];
    $idade = $_POST['idade'];
    $cpf = $_POST['cpf'];
    $email = $_POST['email'];
    $telefone = $_POST['telefone'];
    $celular = $_POST['celular'];
    $abrir = $_POST['abrir'];
    $dobrar = $_POST['dobrar'];
    

    $inserir = $pdo->prepare("insert into demo (nome, idade, cpf, email, telefone, celular, abrir, dobrar) 
                    values ('$nome', '$idade', '$cpf', '$email', '$telefone', '$celular', '$abrir', '$dobrar')");
    $inserir->execute();

   header("location:kaline.php");