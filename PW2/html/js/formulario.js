var nome = document.querySelector('#nome');
var idade = document.querySelector('#idade');
var email = document.querySelector('#email');

function cadastrar(){
    const nome = document.getElementById('nome').value;
    const idade = document.getElementById('idade').value;
    const email = document.getElementById('email').value;

    console.log(nome);
    console.log(idade);
    console.log(email);

    resultado.innerHTML = nome;
    resultado.innerHTML = idade;
    resultado.innerHTML = email;
}