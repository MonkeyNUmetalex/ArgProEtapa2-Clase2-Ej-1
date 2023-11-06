package org.arosa.exprecionesLambdas.models;

import java.util.ArrayList;
import java.util.List;

public class ConvertirA {

   public List<String> mayuscula(List<String> palabras, PasarMayuscula lambda){
       return lambda.mayuscula(palabras);
   };

}
