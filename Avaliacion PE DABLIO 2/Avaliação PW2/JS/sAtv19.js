function verificarPalindromo(palavra){
    var inverterPalavra = "";

    for(var p = palavra.length - 1; p >= 0; p--){
        inverterPalavra = inverterPalavra + palavra[p];
    }

    if(palavra === inverterPalavra){
        return true;
    }else{
        return false;

    }

}

console.log(verificarPalindromo("ovo"));
console.log(verificarPalindromo("morango"));