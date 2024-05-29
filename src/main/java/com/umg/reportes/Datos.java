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
import java.util.ArrayList;
import java.util.List;
/**
*
* @author danybd
*/
public class Datos {
public List<NotasEstudiante> llenarLista() {
List<NotasEstudiante> listaEstudiantes = new ArrayList<>();
// Crear y agregar los objetos Estudiante a la lista
NotasEstudiante estudiante1 = new NotasEstudiante("123ABC", "Juan Pérez", 85, 90, 95, 88);
listaEstudiantes.add(estudiante1);
NotasEstudiante estudiante2 = new NotasEstudiante("456DEF", "María González", 78, 85, 88, 92);
listaEstudiantes.add(estudiante2);
NotasEstudiante estudiante3 = new NotasEstudiante("789GHI", "Luis Martínez", 92, 88, 90, 85);
listaEstudiantes.add(estudiante3);
NotasEstudiante estudiante4 = new NotasEstudiante("012JKL", "Ana Rodríguez", 90, 92, 86, 89);
listaEstudiantes.add(estudiante4);
NotasEstudiante estudiante5 = new NotasEstudiante("345MNO", "Pedro Gómez", 80, 75, 85, 90);
listaEstudiantes.add(estudiante5);
NotasEstudiante estudiante6 = new NotasEstudiante("678PQR", "Laura Sánchez", 85, 88, 92, 87);
listaEstudiantes.add(estudiante6);
NotasEstudiante estudiante7 = new NotasEstudiante("901STU", "Carlos López",
88, 90, 84, 91);
listaEstudiantes.add(estudiante7);
NotasEstudiante estudiante8 = new NotasEstudiante("234VWX", "Sofía Díaz",
92, 95, 88, 86);
listaEstudiantes.add(estudiante8);
NotasEstudiante estudiante9 = new NotasEstudiante("567YZA", "Diego Hernández", 85, 82, 90, 88);
listaEstudiantes.add(estudiante9);
NotasEstudiante estudiante10 = new NotasEstudiante("890BCD", "Fernanda Torres", 88, 90, 85, 92);
listaEstudiantes.add(estudiante10);
NotasEstudiante estudiante11 = new NotasEstudiante("123EFG", "Alejandro Ramírez", 82, 88, 85, 90);
listaEstudiantes.add(estudiante11);
NotasEstudiante estudiante12 = new NotasEstudiante("456HIJ", "Elena Vargas", 90, 92, 86, 88);
listaEstudiantes.add(estudiante12);
NotasEstudiante estudiante13 = new NotasEstudiante("789KLM", "Javier Cruz",
85, 80, 88, 92);
listaEstudiantes.add(estudiante13);
NotasEstudiante estudiante14 = new NotasEstudiante("012NOP", "Paula Jiménez", 88, 85, 90, 87);
listaEstudiantes.add(estudiante14);
NotasEstudiante estudiante15 = new NotasEstudiante("345QRS", "Andrea Medina", 92, 88, 85, 91);
listaEstudiantes.add(estudiante15);
NotasEstudiante estudiante16 = new NotasEstudiante("678TUV", "Roberto Morales", 85, 90, 92, 86);
listaEstudiantes.add(estudiante16);
NotasEstudiante estudiante17 = new NotasEstudiante("901WXY", "Gabriela Ortiz", 90, 86, 88, 89);
listaEstudiantes.add(estudiante17);
NotasEstudiante estudiante18 = new NotasEstudiante("234ZAB", "Jorge García", 88, 85, 90, 92);
listaEstudiantes.add(estudiante18);
NotasEstudiante estudiante19 = new NotasEstudiante("567CDE", "Valeria Silva", 85, 92, 88, 87);
listaEstudiantes.add(estudiante19);
NotasEstudiante estudiante20 = new NotasEstudiante("890EFG", "Daniel Castro", 92, 90, 85, 91);
listaEstudiantes.add(estudiante20);
return listaEstudiantes;
}
}