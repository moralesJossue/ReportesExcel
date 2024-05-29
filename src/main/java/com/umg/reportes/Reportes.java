// **********************************************
// CLASE DATOS FICTICIOS
// **********************************************
/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to
change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this
template
*/
package com.umg.reportes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
*
* @author danybd
*/
public class Reportes {
Datos datos = new Datos();
public void generarReporteExcel() {
// Se declara la variable en donde se almacenarán los datos obtenidos
List<NotasEstudiante> listaEstudiantes = new ArrayList<>();
// Obtener los datos
listaEstudiantes = datos.llenarLista();
// Establecer el nombre del reporte
String nombreReporte = System.getProperty("user.dir") + "/reporte.xlsx";
// Crear un nuevo libro de trabajo
Workbook workbook = new XSSFWorkbook();
// Crear una hoja
Sheet hoja = workbook.createSheet("Reporte");
// Establecer los titulos del encabezado
String[] titulos = {"CARNÉ", "NOMBRE Y APELLIDOS", "P1", "P2", "ACT", "EF",
"TOTAL", "A/R"};
// Crear la fila del encabezado
Row filaEncabezados = hoja.createRow(0);
// Llenar la fila del encabezado
for(int i = 0; i < titulos.length; i++) {
Cell celda = filaEncabezados.createCell(i);
celda.setCellValue(titulos[i]);
hoja.autoSizeColumn(i);
}
// Llenar el resto de datos
for(int i = 0; i<listaEstudiantes.size(); i++) {
Row filaDatos = hoja.createRow(i+1);
for(int dato = 0; dato < titulos.length; dato++) {
Cell celdaDato = filaDatos.createCell(dato);
String noCarne = listaEstudiantes.get(i).getNoCarne() != null ?
listaEstudiantes.get(i).getNoCarne() : "";
String nombreApellidos =
listaEstudiantes.get(i).getNombreApellidos() != null ?
listaEstudiantes.get(i).getNombreApellidos() : "";
Integer primerParcial =
listaEstudiantes.get(i).getPrimerParcial() != null ?
listaEstudiantes.get(i).getPrimerParcial() : 0;
Integer segundoParcial =
listaEstudiantes.get(i).getSegundoParcial()!= null ?
listaEstudiantes.get(i).getSegundoParcial() : 0;
Integer actividades = listaEstudiantes.get(i).getActividades()!=
null ? listaEstudiantes.get(i).getActividades() : 0;
Integer evaluacionFinal =
listaEstudiantes.get(i).getEvaluacionFinal()!= null ?
listaEstudiantes.get(i).getEvaluacionFinal() : 0;
Integer total = Math.round((primerParcial + segundoParcial +
actividades + evaluacionFinal)/4);
String resultado = total >= 61 ? "Aprobado" : "Reprobado";
switch (dato) {
case 0: { celdaDato.setCellValue(noCarne); break; }
case 1: { celdaDato.setCellValue(nombreApellidos); break; }
case 2: { celdaDato.setCellValue(primerParcial); break; }
case 3: { celdaDato.setCellValue(segundoParcial); break; }
case 4: { celdaDato.setCellValue(actividades); break; }
case 5: { celdaDato.setCellValue(evaluacionFinal); break; }
case 6: { celdaDato.setCellValue(total); break; }
case 7: { celdaDato.setCellValue(resultado); break; }
}
hoja.autoSizeColumn(dato);
}
}
// Guardar el libro de trabajo en un archivo
try (FileOutputStream fileOut = new FileOutputStream(nombreReporte)) {
workbook.write(fileOut);
System.out.println("Archivo Excel creado correctamente.");
} catch (IOException e) {
e.printStackTrace();
}
// Cerrar el libro de trabajo
try {
workbook.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}