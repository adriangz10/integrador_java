package pronostico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        String csvFile = "D:\\Arg Programa Java\\Trabajo Integrador\\partidos.csv";
        String line = "";
        String cvsSplitBy = ",";
        List<String[]> data = new ArrayList<String[]>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // separa los datos por comas y los almacena en un arreglo
                String[] datos = line.split(cvsSplitBy);

                // agrega el arreglo a la lista
                data.add(datos);
                System.out.println(Arrays.deepToString(data.toArray()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
