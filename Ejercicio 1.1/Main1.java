public class Main1 {
  public static void main(String[] args) {
    int Iniciar = 1;
    Double PosicionMarco = 0.00;
    Double PosicionMadre = 350.00;
    int dia = 0;
    while (Iniciar == 1){
    System.out.println("--------------------------------------------------------------------------------------");
    dia++;
    System.out.println("Dia " + dia);
    System.out.println("           ");
    Double Menor = 10.00;
    Double Mayor = 15.00;

    Double VelocidadMarcoCruda = (Double)(Math.random()*(Mayor-Menor+1)+Menor);
    Double VelocidadMarcoPromedio = Math.round(VelocidadMarcoCruda*100.00)/100.00;
    if(VelocidadMarcoPromedio > 15.00){
      VelocidadMarcoPromedio = 15.00;
    }
    Double VelocidadMarcoFinal= VelocidadMarcoPromedio;
    Double Velocidadiezporciento = VelocidadMarcoPromedio*0.10;
    Double Veiniticincoporciento = VelocidadMarcoPromedio*0.25;
    int min = 1;
    int max = 10;
    int Clima = (int)Math.floor(Math.random()*(max-min+1)+min);
    if (Clima > 4){
    System.out.println ("Hizo Buen clima");
    }
    if (Clima == 1){
      System.out.println ("Llovio muy fuerte");
      VelocidadMarcoFinal = Math.round(Veiniticincoporciento*100.00)/100.00;
    }

    if(Clima > 1 && Clima<=4 ){
        System.out.println ("Llovio leve");
        VelocidadMarcoFinal = Math.round((VelocidadMarcoPromedio-Veiniticincoporciento)*100.00)/100.00;
    }

    int Uno =100;
    int Cero =1;
    int ProbabilidadMonoCansar = (int)Math.floor(Math.random()*(Uno-Cero+1)+Cero);
    if(ProbabilidadMonoCansar<=25){
      System.out.println("Amelio se canso");
      VelocidadMarcoPromedio = Math.round((VelocidadMarcoPromedio - Velocidadiezporciento)*100.00)/100.00;
    }

    Double High =600.00;
    Double Low = 480.00;

    Double TiempoDeViajeCruda = (Double)(Math.random()*(High-Low+1)+Low);
    Double TiempoDeViajeRedondeado = Math.round(TiempoDeViajeCruda*100.00)/100.00;
    if (TiempoDeViajeRedondeado >600.00){
      TiempoDeViajeRedondeado = 600.00;
    }
    Double ConversionDeMinutos = Math.round((TiempoDeViajeRedondeado /60)*100.00)/100.00;
    double parteDecimal = Math.round((ConversionDeMinutos % 1)*100.00)/100.00; // Lo que sobra de dividir al número entre 1

    float MinutosMarcoArreglado = (float)(parteDecimal*60);

    int HorasMarcoArreglado = (int)(ConversionDeMinutos - parteDecimal);
    if(HorasMarcoArreglado < 8){
      HorasMarcoArreglado = 8;
    }

    float MinutosMarcoPartTwo = MinutosMarcoArreglado/100;
    double HorasMarcoFinal = Math.round((HorasMarcoArreglado+MinutosMarcoPartTwo)*100.00)/100.00;

    int Alto =100;
    int Bajo =1;
    int ProbabilidadMonoEscapar = (int)Math.floor(Math.random()*(Alto-Bajo+1)+Bajo);
    if(ProbabilidadMonoEscapar<=15){
      System.out.println("Amelio se escapo");
      HorasMarcoFinal = Math.round((HorasMarcoFinal - 2)*100.00)/100.00;
    }

    Double DistanciaRecorrida = Math.round((HorasMarcoFinal * VelocidadMarcoFinal)*100.00)/100.00;
    PosicionMarco = PosicionMarco + DistanciaRecorrida;
    //Codigo de la mama
    Double Bot = 6.00;
    Double Top = 9.00;

    Double VelocidadMamaCruda = (Double)(Math.random()*(Top-Bot+1)+Bot);
    Double VelocidadMamaPromedio = Math.round(VelocidadMamaCruda*100.00)/100.00;
    if(VelocidadMarcoPromedio > 9.00){
      VelocidadMarcoPromedio = 9.00;
    }
    Double VelocidadMamaFinal= VelocidadMamaPromedio;
    Double Ciencuentaporciento = VelocidadMarcoPromedio*0.5;
    Double Veiniticincoporcientomama = VelocidadMamaPromedio*0.25;

    int Bottom = 1;
    int OnTop = 10;
    int ClimaMama = (int)Math.floor(Math.random()*(OnTop-Bottom+1)+Bottom);
    if (ClimaMama > 4){
    System.out.println ("Hizo Buen clima para mama");
    }
    if (ClimaMama == 1){
      System.out.println ("Llovio muy fuerte para mama");
      VelocidadMamaFinal = Math.round(Ciencuentaporciento*100.00)/100.00;
    }

    if(ClimaMama > 1 && ClimaMama<=4 ){
        System.out.println ("Llovio leve para mama");
        VelocidadMamaFinal = Math.round((VelocidadMamaPromedio-Veiniticincoporcientomama)*100.00)/100.00;
    }


        Double Positivo =540.00;
        Double Negativo = 360.00;

        Double TiempoDeViajeCrudoMama = (Double)(Math.random()*(Positivo-Negativo+1)+Negativo);
        Double TiempoDeViajeRedondeadoMama = Math.round(TiempoDeViajeCrudoMama*100.00)/100.00;
        if (TiempoDeViajeRedondeadoMama >540.00){
          TiempoDeViajeRedondeadoMama = 360.00;
        }
        Double ConversionDeMinutosMama = Math.round((TiempoDeViajeRedondeadoMama /60)*100.00)/100.00;
        double parteDecimalMama = Math.round((ConversionDeMinutosMama % 1)*100.00)/100.00; // Lo que sobra de dividir al número entre 1

        float MinutosMamaArreglado = (float)(parteDecimalMama*60);

        int HorasMamaArreglado = (int)(ConversionDeMinutosMama - parteDecimalMama);
        if(HorasMamaArreglado < 6){
          HorasMamaArreglado = 6;
        }

        float MinutosMamaPartTwo = MinutosMamaArreglado/100;
        double HorasMamaFinal = Math.round((HorasMamaArreglado + MinutosMamaPartTwo)*100.00)/100.00;

        Double DistanciaRecorridaMama = Math.round((HorasMamaFinal * VelocidadMamaFinal)*100.00)/100.00;
        PosicionMadre = PosicionMadre + DistanciaRecorridaMama;
        System.out.println("Mama ha viajado " + HorasMamaFinal + "Hrs " + "con una velocidad promedio de " + VelocidadMamaFinal + "Km/h " + "recorriendo un total de " + DistanciaRecorridaMama + "Km");

        int Suerte = 1;
        int Logica = 2;
        int Correr = (int)Math.floor(Math.random()*(Logica-Suerte+1)+Suerte);

        double Diferencia = (double)Math.round((PosicionMadre-PosicionMarco)*100.00)/100.00;
        if(Diferencia <=0){
          System.out.println("Marco encontro a su mama en el dia " + dia);
          Iniciar = 2;
          break;
        }
        if(Diferencia <= 50.00 && Correr == 1){
          PosicionMarco = PosicionMarco + 25.00;
          System.out.println("Alguien vio a la mama de marco, corre como el viento tiro al blanco");
        }

    System.out.println("Marco ha viajado" + " " + HorasMarcoFinal+ "Hrs " + "A una velocidad promedio de " + VelocidadMarcoFinal + "Km/h " + "recorriendo un total de " + DistanciaRecorrida + "Km" );

    System.out.println("Marco esta a "+ Diferencia+ " Km de su madre");
    System.out.println("--------------------------------------------------------------------------------------");

    try {
    Thread.sleep(1000);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
  }
}
}
