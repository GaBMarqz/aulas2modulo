var notas = [];

var qntd = parseInt(prompt("Você tem quantas materias? "));
for(var n = 0; n < qntd; n++){
    var nota = parseFloat(prompt("Insira suas notas " + (n + 1)));
    notas.push(nota);

}

console.log("Essas são suas notas: " + notas);

var soma = 0;
for(var m = 0; m < notas.length; m++){
    soma = soma + notas[m];
}
console.log("Total: " + soma)

var media = soma / notas.length;
console.log("Sua média final é: " + media.toFixed(2));

if(media >= 7){
    console.log("Você está dentro dos conformes e passou de ano");

}else{
    console.log("Você infelizmente não está aprovado. Você está de recuperação.")
}