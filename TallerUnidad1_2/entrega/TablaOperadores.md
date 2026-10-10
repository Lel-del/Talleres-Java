# Tabla de evaluación de expresiones
Estado inicial independiente por fila: `int x = 7; boolean flag = false;`.
Las predicciones se guardaron antes de la primera ejecución en Predicciones.md.

| Expresión | Predicción previa | Resultado real (JDK 21) |
| --- | --- | --- |
| int seg = 86400 % 3600; | seg = 0 | seg = 0 |
| int y = ++x + x++; | y = 16; x = 9 | y = 16; x = 9 |
| double div1 = 15 / 2; double div2 = 15.0 / 2; | div1 = 7.0; div2 = 7.5 | div1 = 7.0; div2 = 7.5 |
| boolean res = flag && (++x > 0); | res = false; x = 7 | res = false; x = 7 |

La división de enteros pierde la parte decimal antes de asignarse a double.
En &&, si la primera condición es falsa, la segunda no se evalúa.
Verificación realizada con Java local; la repetición desde IntelliJ queda pendiente.
