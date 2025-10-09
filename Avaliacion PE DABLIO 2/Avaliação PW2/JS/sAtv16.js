var num1 = parseInt(prompt("Digite o primeiro valor: "));
var num2 = parseInt(prompt("Digite o segundo valor: "));
var num3 = parseInt(prompt("Digite o terceiro valor: "));

if((num1 > num2) && (num1 > num3)){
    console.log("O primeiro valor é o maior dos 3.");

}
else if((num2 > num1) && (num2 > num3)){
    console.log("O segundo valor é o maior dos 3.");

}
else if((num3 > num1) && (num3 > num2)){
    console.log("O terceiro valor é o maior dos 3.");

}else{
    console.log("Valor não compreendido, inválido ou os 3 valores são idênticos... '-'");
}
