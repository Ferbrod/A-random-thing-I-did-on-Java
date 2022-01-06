public class Main {
  public static void main(String[] args) {

    Double PosicionMarco = 0.00;
    int PosicionMadre = 350;
    int dia = 0;
    while (PosicionMadre>PosicionMarco){
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

    Double Top =600.00;
    Double Low = 480.00;

    Double TiempoDeViajeCruda = (Double)(Math.random()*(Top-Low+1)+Low);
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
    PosicionMadre = PosicionMadre + 100;
    if(PosicionMarco>=PosicionMadre){
      break;
    }
    System.out.println("Marco ha viajado" + " " + HorasMarcoFinal+ "Hrs " + "A una velocidad promedio de " + VelocidadMarcoFinal + "Km/h " + "recorriendo un total de " + DistanciaRecorrida + "Km" );
    double Diferencia = (double)Math.round((PosicionMadre-PosicionMarco)*100.00)/100.00;
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
