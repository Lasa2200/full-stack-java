//crea una prueba o función que devuelva la suma del número más grande y
// el más pequeño del array.
// Por ejemplo, sumMaxMin([1,3,10]) debería devolver 10 + 1 = 11, y 
//sumMaxMin([-2,-5,-10]) debería devolver -2 + -10 = -12.
// Una vez que hayas escrito la prueba, ejecútala 
//(sin escribir toda la función para asegurarte de que fallen todas las pruebas), 
//luego completa la función cerciorándote de que pase todas las pruebas. 

function sumMaxMin(arreglo){//arreglo=[3,7,1] ; 3->length
    var arrAux=[];
    var suma=0;//3>10>9
    var minimo=arreglo[0];//-1
    var maximo=arreglo[0];//3>7

    for(var i =0; i < arreglo.length; i++){//i=0>1>2>3
        //valor maximo
        if(maximo < arreglo[i]){
            maximo = arreglo[i]
        }
        //valir minimo
        if(minimo > arreglo[i] ){
        minimo = arreglo[i]
        }
        suma= suma + arreglo[i]
    }
    promedio = suma/arreglo.length
    arrAux.push(maximo)
    arrAux.push(minimo)

    return arrAux
}

b= sumMaxMin([1,3,10])
console.log(b)//[7,-1,3]