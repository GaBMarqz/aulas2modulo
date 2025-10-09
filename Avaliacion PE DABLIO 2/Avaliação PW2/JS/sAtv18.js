var lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ];
var npares= 0;

for(n = 0; n < lista.length; n++){
    if(lista[n] %2 == 0){
        npares = npares + 1
        console.log("o número " + lista[n] + " é par");
    }else{
        console.log("o número " + lista[n] + " é impar");
    }
}