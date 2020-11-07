//crea una prueba o función que devuelva la suma del número más grande y
// el más pequeño del array.
// Por ejemplo, sumMaxMin([1,3,10]) debería devolver 10 + 1 = 11, y 
//sumMaxMin([-2,-5,-10]) debería devolver -2 + -10 = -12.
// Una vez que hayas escrito la prueba, ejecútala 
//(sin escribir toda la función para asegurarte de que fallen todas las pruebas), 
//luego completa la función cerciorándote de que pase todas las pruebas. 

function sumMaxMin(arreglo){//arreglo=[3,7,1] ; 3->length
  
    var minimo=arreglo[0];
    var maximo=arreglo[0];

    for(var i =0; i < arreglo.length; i++){
        //valor maximo
        if(maximo < arreglo[i]){
            maximo = arreglo[i]
        }
        //valor minimo
        if(minimo > arreglo[i] ){
        minimo = arreglo[i]
        }
    }
    return maximo+minimo;
}

b= sumMaxMin([1,3,10])
console.log(b)//11
c= sumMaxMin([-2,-5,-10])
console.log (c);